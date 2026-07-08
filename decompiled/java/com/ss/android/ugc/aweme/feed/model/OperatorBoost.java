package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OperatorBoost implements Serializable {

    @C09CT("end_time")
    public long endTime;

    @C09CT("region")
    public String region;

    @C09CT("target_vv")
    public long targetVv;

    public OperatorBoost() {
    }

    public OperatorBoost(long j, long j2, String str) {
        this.targetVv = j;
        this.endTime = j2;
        this.region = str;
    }
}
