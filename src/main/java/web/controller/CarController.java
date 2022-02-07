package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
//    @GetMapping("/car")
//    public String printCar(){
//        return "car";
//    }

    @GetMapping("/cars")
    public String printCarList(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {

        model.addAttribute("messages", CarService.getCarsArray(count));

        return "cars";
    }



}
