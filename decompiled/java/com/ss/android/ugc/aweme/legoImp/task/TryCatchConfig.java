package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class TryCatchConfig {

    @C09CT("delay")
    public final long delayMillis;

    @C09CT("rules")
    public final ExceptionRuleConfig[] exceptionRules;

    @C09CT("proc_mode")
    public final int processMode;

    public TryCatchConfig() {
        this(0L, 0, null);
    }

    public TryCatchConfig(long j, int i, ExceptionRuleConfig[] exceptionRuleConfigArr) {
        this.delayMillis = j;
        this.processMode = i;
        this.exceptionRules = exceptionRuleConfigArr;
    }
}
