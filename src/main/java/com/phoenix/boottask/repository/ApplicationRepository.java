package com.phoenix.boottask.repository;

import com.phoenix.boottask.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application,Integer> {
}
