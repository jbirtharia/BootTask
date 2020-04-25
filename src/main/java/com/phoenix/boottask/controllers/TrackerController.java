package com.phoenix.boottask.controllers;

import com.phoenix.boottask.constants.Constant;
import com.phoenix.boottask.entity.Application;
import com.phoenix.boottask.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j
public class TrackerController {

    @Autowired
    ApplicationService applicationService;


    @GetMapping(Constant.APPLICATIONS_URL)
    public String retrieveApplications(Model model){
        log.info("Applications : {}",applicationService.getApplications());
        model.addAttribute(Constant.APPLICATIONS,applicationService.getApplications());
        return Constant.DATA;
    }

    @GetMapping(Constant.NEW_URL)
    public String register(Model model){
        model.addAttribute(Constant.APPLICATION,new Application());
        return Constant.FORM;
    }

    @PostMapping(Constant.SAVE_APPLICATION_URL)
    public String save(@Valid @ModelAttribute(Constant.APPLICATION) Application application, Model model, BindingResult result){
        if (result.hasErrors())
            return Constant.FORM;
        else {
            applicationService.saveApplication(application);
            model.addAttribute(Constant.APP,application);
            log.info("Application : {}",application);
            return Constant.SUCCESS;
        }
    }

}
