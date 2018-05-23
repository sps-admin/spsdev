package com.skyguard.sps.client.mytest.controller;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * Created by liupei on 2018/5/23.
 */
public class ManagerTaskListener implements TaskListener {

        private static final long serialVersionUID = 1L;
        @Override
        public void notify(DelegateTask delegateTask) {
            String eventName = delegateTask.getEventName();
            System.out.println("event name " + eventName);
            System.out.println("event name " + delegateTask.getAssignee());
            delegateTask.addCandidateUser("qijun");
        }
}
