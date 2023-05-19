package bo.edu.ucb.sis213.internship.backend.api;

import bo.edu.ucb.sis213.internship.backend.bl.CompanyBl;
import bo.edu.ucb.sis213.internship.backend.dto.CompanyDto;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import com.fasterxml.uuid.Generators;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyApi {

    public static final String UPLOADED_FOLDER = "/Users/ecampohermoso/data/logos/";
    private CompanyBl companyBl;

    public CompanyApi(CompanyBl companyBl) {
        this.companyBl = companyBl;
    }

    @PostMapping(path = "/")
    public CompanyDto saveCompany(CompanyDto companyDto) {
        companyDto = companyBl.save(companyDto);
        return companyDto;
    }

    @PostMapping("/logoLocal/")
    public ResponseEntity<?> uploadLogo(@RequestParam("file") MultipartFile uploadfile) {

        if (uploadfile.isEmpty()) {
            return new ResponseEntity<>("Por favor selecciona un archivo", HttpStatus.BAD_REQUEST);
        }

        try {
            byte[] bytes = uploadfile.getBytes();
            TimeBasedGenerator gen = Generators.timeBasedGenerator();
            UUID uuid = gen.generate();
            Path path = Paths.get(UPLOADED_FOLDER + uuid.toString());
            System.out.println(uploadfile.getOriginalFilename());
            System.out.println(uploadfile.getSize());
            System.out.println(uploadfile.getContentType());
            Files.write(path, bytes);

            // Guardo en BBDD la ruta
            // fileBl.save(UUID, path, uploadfile.getOriginalFilename(), size, contentType);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("Archivo subido exitosamente: " + uploadfile.getOriginalFilename(), HttpStatus.OK);
    }
}
