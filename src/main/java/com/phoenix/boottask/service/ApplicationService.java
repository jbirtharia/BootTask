package com.phoenix.boottask.service;

import com.phoenix.boottask.entity.Application;
import com.phoenix.boottask.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    ApplicationRepository repository;

    public List<Application> getApplications() {
        List<Application> applications = new ArrayList<>();
        repository.findAll().forEach(applications::add);
        return applications;
    }

    public void saveApplication(Application application) {
        repository.save(application);
    }
}
