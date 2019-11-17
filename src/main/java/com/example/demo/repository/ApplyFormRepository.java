package com.example.demo.repository;

import com.example.demo.model.ApplyForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyFormRepository extends JpaRepository<ApplyForm, Integer> {
//    ApplyForm findByPhone(Integer phone);
}
