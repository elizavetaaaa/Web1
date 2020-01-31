package namasteWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamasteController {

    @RequestMapping("/")
    public String index(){
        return "HEllo , from me";
    }
}