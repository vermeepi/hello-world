package org.vermeepi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;

/**
 * Created by piet.vermeersch on 18/02/2016.
 */
@Controller
public class HomeController {

    @Autowired
    Comparator<String> comparator;

    @RequestMapping(value = "/")
    public String home() {
        System.out.println("HomeController: Passing through and returning home ...");
        return "home";
    }

    @RequestMapping(value = "/compare", method = RequestMethod.GET)
    public String compare(@RequestParam("input1") String input1, @RequestParam("input2") String input2, Model model) {
        System.out.println("HomeController:compare:" + input1 + ", " + input2);
        int result = comparator.compare(input1, input2);
        String comparison = (result < 0) ? "less than" : (result > 0 ? "greater than" : "equal to");
        String output = "According to our Comparator, '" + input1 + "' is " + comparison + " '" + input2 + "'";
        model.addAttribute("output", output);
        return "compareResult";
    }
}
