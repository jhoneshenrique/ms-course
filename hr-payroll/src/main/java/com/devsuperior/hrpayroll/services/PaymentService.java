package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feingclients.WorkerFeingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeingClient workerFeingClient;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeingClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(),days);
    }
}
