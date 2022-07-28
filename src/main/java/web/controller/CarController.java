package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printTable(@RequestParam(value = "count", required = false, defaultValue = "5") int value, ModelMap model) {
        model.addAttribute("carList", carService.getCars(value));
        return "cars";
    }
}
