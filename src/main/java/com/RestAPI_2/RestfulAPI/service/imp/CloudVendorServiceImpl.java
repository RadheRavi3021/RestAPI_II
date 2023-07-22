package com.RestAPI_2.RestfulAPI.service.imp;

import com.RestAPI_2.RestfulAPI.database.CloudVendorRepository;
import com.RestAPI_2.RestfulAPI.model.CloudVendor;
import com.RestAPI_2.RestfulAPI.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
    CloudVendorRepository cloudVendorRepository;

//    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
//        this.cloudVendorRepository = cloudVendorRepository;
//    }

    @Override
    public void createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository
                .save(cloudVendor);
    }

    @Override
    public void updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository
                .save(cloudVendor);
    }

    @Override
    public void deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository
                .deleteById(cloudVendorId);
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return  cloudVendorRepository
                .findById(cloudVendorId)
                .orElse(null);
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return  cloudVendorRepository
                .findAll();
    }
}
