package action.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionApplication {

    @RequestMapping("/hi")
    String hello(){
        return "hello";
    }
}
