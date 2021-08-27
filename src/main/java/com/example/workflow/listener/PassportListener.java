package com.example.workflow.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class PassportListener implements ExecutionListener {

  @Override
  public void notify(DelegateExecution execution) throws Exception {
    execution.setVariable("applicantName", "John");
  }
}
