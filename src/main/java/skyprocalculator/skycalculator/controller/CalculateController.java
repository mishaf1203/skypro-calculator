package skyprocalculator.skycalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skyprocalculator.skycalculator.service.CalculateService;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    @Autowired
    CalculateService calculateService;

    @GetMapping
    public String welcome() {
        return "Добро пожаловать!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1",required = false) Integer a, @RequestParam(name = "num2",required = false) Integer b) {
        int result = calculateService.plus(a, b);
        return a +" + "+ b+ " = " +result;
    }
        @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") Integer a, @RequestParam(name = "num2") Integer b) {
        int result = calculateService.minus(a, b);
        return a +" - "+ b+ " = " +result;
    }
        @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1") Integer a, @RequestParam(name = "num2") Integer b) {
        int result = calculateService.multiply(a, b);
        return a +" * "+ b+ " = " +result;
    }
        @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1") Integer a, @RequestParam(name = "num2") Integer b) {
        double result = calculateService.divide(a, b);
        return a +" / "+ b+ " = " +result;
    }

}
