package com.ss.android.ugc.aweme.biz.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTtpayOpencaSettingModel {

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("loop_count")
    public final int loopCount;

    public PipoTtpayOpencaSettingModel() {
        this(1000L, 10);
    }

    public PipoTtpayOpencaSettingModel(long j, int i) {
        this.intervalMs = j;
        this.loopCount = i;
    }
}
