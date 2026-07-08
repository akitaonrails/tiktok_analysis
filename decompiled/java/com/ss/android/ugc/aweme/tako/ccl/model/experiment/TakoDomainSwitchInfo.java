package com.ss.android.ugc.aweme.tako.ccl.model.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class TakoDomainSwitchInfo {

    @C09CT("tako_domain")
    public final String domain;

    @C09CT("chunk_receive_interval_timeout")
    public final int intervalTimeout;

    @C09CT("op")
    public final int op;

    @C09CT("chunk_request_total_timeout_android")
    public final int totalTimeout;

    public TakoDomainSwitchInfo() {
        this(-1, "", -1, -1);
    }

    public TakoDomainSwitchInfo(int i, String str, int i2, int i3) {
        this.op = i;
        this.domain = str;
        this.totalTimeout = i2;
        this.intervalTimeout = i3;
    }
}
