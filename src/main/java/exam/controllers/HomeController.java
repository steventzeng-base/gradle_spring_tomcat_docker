package exam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 *
 * @author steven
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(method = GET)
    public void hello(){
    }
}
