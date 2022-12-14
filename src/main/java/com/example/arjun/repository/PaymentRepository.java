package com.example.arjun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.arjun.dto.PaymentDto;
import com.example.arjun.entity.Payment;



public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	Payment save(PaymentDto payment);

	
}
