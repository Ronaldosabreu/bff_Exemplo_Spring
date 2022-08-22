package BFFSpring.BFF.domain.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
//http://www.basef.com.br/index.php/Atalhos_do_IntelliJ_Idea
@Data
@AllArgsConstructor
public class ErroDTO {
    private HttpStatus status;
    private String message;
}
