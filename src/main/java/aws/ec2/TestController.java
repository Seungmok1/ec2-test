package aws.ec2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("hello world!!!");
    }
}
