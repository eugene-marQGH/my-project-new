package com.example.workflow.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PassportValidatorDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    String applicantName = (String) execution.getVariable("applicantName");
    if (applicantName==null || applicantName =="") {}
    applicantName = applicantName.toUpperCase();
    execution.setVariable("input", var);
  }
}
