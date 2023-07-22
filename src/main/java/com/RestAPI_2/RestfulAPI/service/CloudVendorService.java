package com.RestAPI_2.RestfulAPI.service;

import com.RestAPI_2.RestfulAPI.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    void createCloudVendor(CloudVendor cloudVendor);
    void updateCloudVendor(CloudVendor cloudVendor);
    void deleteCloudVendor(String cloudVendorId);
    CloudVendor getCloudVendor(String cloudVendorId);
    List<CloudVendor> getAllCloudVendor();

}
