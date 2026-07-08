package com.bytedance.apm.agent.logging;

/* JADX INFO: loaded from: classes14.dex */
public class AndroidAgentLog implements AgentLog {
    public int level = 3;

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
    public void info(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return this.level;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i) {
        if (i <= 6 && i >= 1) {
            this.level = i;
            return;
        }
        throw new IllegalArgumentException("Log level is not between ERROR and AUDIT");
    }
}
