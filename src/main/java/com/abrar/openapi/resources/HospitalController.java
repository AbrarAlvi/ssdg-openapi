package com.abrar.openapi.resources;


import com.abrar.openapi.entity.Hospital;
import com.abrar.openapi.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/*@RequestMapping("/hospital")*/
@RestController
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @RequestMapping(value = "/test/hospitals/{id}", method = RequestMethod.GET)

    public @ResponseBody
    Hospital getHospital(@PathVariable("id") int id) throws Exception {

        return this.hospitalService.getHospital(id);

    }

    @RequestMapping(value = "/test/hospitals/", method = RequestMethod.GET)

    public @ResponseBody
    List<Hospital> getAllHospitals() throws Exception {
        return this.hospitalService.getAllHospitals();

    }

    @RequestMapping(value = "/test/hospitals/", method = RequestMethod.POST,consumes = {"application/json"})
    public @ResponseBody
    void addHospitals(@RequestBody Hospital hospital) throws Exception {

        this.hospitalService.addHospital(hospital);
    }

    @RequestMapping(value = "/test/hospitals/", method = RequestMethod.DELETE,consumes = {"application/json"})
    public @ResponseBody
    void deleteHospitals(@RequestBody Hospital hospital) throws Exception {

        this.hospitalService.deleteHospital(hospital);
    }

    @RequestMapping(value = "/test/hospitals/", method = RequestMethod.PUT,consumes = {"application/json"})
    public @ResponseBody
    void updateHospitals(@RequestBody Hospital hospital) throws Exception {

        this.hospitalService.updateHospital(hospital);
    }

}
