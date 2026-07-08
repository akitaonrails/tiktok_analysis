package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EffectiveTime {

    @C09CT("end_time")
    public String endTime;

    @C09CT("start_time")
    public String startTime;

    public EffectiveTime() {
        this(null, null);
    }

    public EffectiveTime(String str, String str2) {
        this.startTime = str;
        this.endTime = str2;
    }
}
