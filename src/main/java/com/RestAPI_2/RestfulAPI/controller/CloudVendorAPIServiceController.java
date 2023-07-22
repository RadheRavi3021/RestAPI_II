package com.RestAPI_2.RestfulAPI.controller;

import com.RestAPI_2.RestfulAPI.model.CloudVendor;
import com.RestAPI_2.RestfulAPI.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIServiceController {

    @Autowired
    CloudVendorService cloudVendorService;


    @GetMapping("{vendorId}")


    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Success vendor Created Successfully ";
    }

    @PutMapping()
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return  "Updated Successfully";
    }


    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
       cloudVendorService.deleteCloudVendor(vendorId);
        return "deleted successfully";
    }
}
