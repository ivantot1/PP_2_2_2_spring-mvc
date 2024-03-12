package web.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("cars",carServiceImpl.cars(5));
         return "cars/index";
    }
//    @GetMapping("/{count}")
//    public String show(@PathVariable("count") int count,Model model){
//        return null;
//    }
}
