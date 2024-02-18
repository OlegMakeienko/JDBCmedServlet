package com.makeienko.jdbcmedservlet.dao;

import com.makeienko.jdbcmedservlet.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentDao {
    Optional<Payment> getById(long paymentId);
    List<Payment> getByUserId(long userId);
    void save(Payment payment);
    void update(Payment payment);
    void delete(long paymentId);
}
