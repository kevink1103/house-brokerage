package com.kevink1103.housebrokerage.controller;

import com.kevink1103.housebrokerage.constants.ActionType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("api/calc/brokerage")
    public Long calculateBrokerage(@RequestParam ActionType actionType,
                                   @RequestParam Long price) {
        // TODO: brokerage calculation
        return null;
    }

}
