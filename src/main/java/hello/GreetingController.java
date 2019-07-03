package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	
    	MyApp app1 = new MyApp();
    	List<MyApp> listApp = new ArrayList<MyApp>();
    	
    	app1.setName("Raja");
    	app1.setAge(20);
    	
    	listApp.add(app1);
    	
        model.addAttribute("listApp", listApp);
        return "greeting";
    }

}