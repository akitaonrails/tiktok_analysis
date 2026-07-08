package com.bytedance.apm.agent.logging;

/* JADX INFO: loaded from: classes14.dex */
public interface AgentLog {
    void audit(String str);

    void debug(String str);

    void error(String str);

    void error(String str, Throwable th);

    int getLevel();

    void info(String str);

    void setLevel(int i);

    void verbose(String str);

    void warning(String str);
}
