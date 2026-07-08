package com.bytedance.apm.agent.logging;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class DefaultAgentLog implements AgentLog {
    public AgentLog impl = new NullAgentLog();

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        int level;
        synchronized (this) {
            try {
                level = this.impl.getLevel();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return level;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
        synchronized (this) {
            try {
                this.impl.audit(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
        synchronized (this) {
            try {
                this.impl.debug(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
        synchronized (this) {
            try {
                this.impl.error(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
        synchronized (this) {
            try {
                this.impl.info(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setImpl(AgentLog agentLog) {
        synchronized (this) {
            try {
                this.impl = agentLog;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i) {
        synchronized (this) {
            try {
                this.impl.setLevel(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
        synchronized (this) {
            try {
                this.impl.verbose(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
        synchronized (this) {
            try {
                this.impl.warning(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
        synchronized (this) {
            try {
                this.impl.error(str, th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
