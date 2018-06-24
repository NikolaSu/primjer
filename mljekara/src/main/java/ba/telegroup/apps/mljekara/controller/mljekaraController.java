package ba.telegroup.apps.mljekara.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/mljekara")
@RestController
public class mljekaraController {

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String getNameOfProject(){
        return "Mljekara";
    }

}
