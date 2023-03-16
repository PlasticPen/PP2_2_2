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
    public String show(@RequestParam(defaultValue = "5", value = "count", required = false) int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}
