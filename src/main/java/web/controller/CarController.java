package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCarList(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("messages", carService.getCarsList(count));
        return "cars";
    }
}
