package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecordSnapshot implements Serializable {

    @C09CT("end_time")
    public final Long endTime;

    @C09CT("md5")
    public final String md5;

    @C09CT("start_time")
    public final Long startTime;

    public OutreachRecordSnapshot(String str, Long l, Long l2) {
        this.md5 = str;
        this.startTime = l;
        this.endTime = l2;
    }
}
