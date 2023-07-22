package com.RestAPI_2.RestfulAPI.database;

import com.RestAPI_2.RestfulAPI.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {

}
