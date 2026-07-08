package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class GetTargetIDCData {

    @C09CT("current_timestamp")
    public final long currentTimestamp;

    @C09CT("delay_second")
    public final int delaySecond;

    @C09CT("target_idc")
    public final String targetIdc;

    public GetTargetIDCData() {
        this("", 0L, 0);
    }

    public GetTargetIDCData(String str, long j, int i) {
        this.targetIdc = str;
        this.currentTimestamp = j;
        this.delaySecond = i;
    }
}
