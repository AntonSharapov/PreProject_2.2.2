package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;


@Controller
public class CarController {

    private CarService carSerivice;

    @Autowired
    public CarController(CarService carSerivice) {
        this.carSerivice = carSerivice;
    }

    @GetMapping(value = "/cars")
    public String getCars (@RequestParam(value = "count", defaultValue = "5") int id, ModelMap model) {
            model.addAttribute("ls", carSerivice.getByID(id));
        return "Car";
    }

//        @GetMapping(value = "/cars")
//        public String show(ModelMap model){
//            model.addAttribute("lst", carSerivice.getAlllist());
//            return "Car";
//        }
    }
