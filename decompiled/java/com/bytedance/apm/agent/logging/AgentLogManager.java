package com.bytedance.apm.agent.logging;

/* JADX INFO: loaded from: classes14.dex */
public class AgentLogManager {
    public static DefaultAgentLog instance = new DefaultAgentLog();

    public static AgentLog getAgentLog() {
        return instance;
    }

    public static void setAgentLog(AgentLog agentLog) {
        instance.setImpl(agentLog);
    }
}
