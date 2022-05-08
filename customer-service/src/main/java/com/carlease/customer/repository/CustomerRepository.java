package com.carlease.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlease.customer.models.Customer;

/**
 * The Interface CustomerRepository.
 */
@Repository
/** */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
