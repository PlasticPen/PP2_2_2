package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String show(@RequestParam(value = "count", required = false) String count, Model model) {
        //Invalid Parameter also leads to showing all cars in the list;
        int amount = 0;
        try {
            amount = Integer.parseInt(count);
        } catch (NumberFormatException mfe) {
            amount = 5;
        }
        model.addAttribute("cars", carService.getCars(amount));
        return "cars";
    }

}
