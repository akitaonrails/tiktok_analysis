package com.ss.android.ugc.aweme.im.strategy.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class StrategyApiTimeoutOptSettingsData {

    @C09CT("timeout_connection")
    public final long timeoutConnection;

    @C09CT("timeout_read")
    public final long timeoutRead;

    @C09CT("timeout_write")
    public final long timeoutWrite;

    public StrategyApiTimeoutOptSettingsData() {
        this(60000L, 60000L, 60000L);
    }

    public StrategyApiTimeoutOptSettingsData(long j, long j2, long j3) {
        this.timeoutConnection = j;
        this.timeoutRead = j2;
        this.timeoutWrite = j3;
    }
}
