package com.example.workflow.delegate;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DelegateLogger implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(DelegateLogger.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("\n\n ... DelegateLogger invoked by "
                + "processDefinitionID=" + execution.getProcessDefinitionId()
                + "activityID=" + execution.getCurrentActivityId()
                + "activityName=" + execution.getCurrentActivityName()
                + "processDefinitionID=" + execution.getProcessDefinitionId()
                + "executionID" + execution.getId()
                + "BusinessKeyID" + execution.getBusinessKey() + "\n\n"
        );

    }

}
