package com.example.workflow.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class DelegateRandomNumber implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Random random = new Random();

        execution.setVariable("Number", random.nextInt());
    }
    
}
