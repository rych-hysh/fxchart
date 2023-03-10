package com.hryoichi.fxchart.RestController;

import com.hryoichi.fxchart.Entities.Rates;
import com.hryoichi.fxchart.Repositories.RatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rates")
public class RatesRestController {
    @Autowired
    private RatesRepository rateRepository;
    @GetMapping("/all")
    public @ResponseBody Iterable<Rates> getAllRates(){
        return rateRepository.findAll();
    }
}
