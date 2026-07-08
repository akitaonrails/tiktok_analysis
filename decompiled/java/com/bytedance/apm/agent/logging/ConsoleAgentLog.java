package com.bytedance.apm.agent.logging;

import X.C2188811AlT;
import java.io.PrintStream;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class ConsoleAgentLog implements AgentLog {
    public int mLevel = 3;

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public int getLevel() {
        return this.mLevel;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void audit(String str) {
        if (this.mLevel == 6) {
            print("AUDIT", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void debug(String str) {
        if (this.mLevel >= 5) {
            print("DEBUG", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str) {
        if (this.mLevel >= 1) {
            print("ERROR", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void info(String str) {
        if (this.mLevel >= 3) {
            print("INFO", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void setLevel(int i) {
        this.mLevel = i;
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void verbose(String str) {
        if (this.mLevel >= 4) {
            print("VERBOSE", str);
        }
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void warning(String str) {
        if (this.mLevel >= 2) {
            print("WARN", str);
        }
    }

    public static void print(String str, String str2) {
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(str);
        sbLIZ.append("] ");
        sbLIZ.append(str2);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.apm.agent.logging.AgentLog
    public void error(String str, Throwable th) {
        if (this.mLevel >= 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" ");
            sbLIZ.append(th.getMessage());
            print("ERROR", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
