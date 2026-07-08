package com.bytedance.apm.agent.logging;

/* JADX INFO: loaded from: classes14.dex */
public class NullAgentLog implements AgentLog {
    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return 5;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
    }
}
