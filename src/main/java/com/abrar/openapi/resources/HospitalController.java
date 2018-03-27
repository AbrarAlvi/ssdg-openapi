package com.abrar.openapi.resources;


import com.abrar.openapi.entity.Hospital;
import com.abrar.openapi.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @RequestMapping(value = "/hospitals/{id}", method = RequestMethod.GET)

    public @ResponseBody
    Hospital getHospital(@PathVariable("id") int id) throws Exception {

        return this.hospitalService.getHospital(id);

    }

    @RequestMapping(value = "/hospitals", method = RequestMethod.GET)

    public @ResponseBody
    List<Hospital> getAllHospitals() throws Exception {
        return this.hospitalService.getAllHospitals();

    }

}