package com.ss.android.ugc.aweme.im.b2c.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessLeadInfoConfigData {

    @C09CT("dismiss_frequency")
    public final long dismissFrequency;

    @C09CT("fetch_autofill_frequency")
    public final long fetchAutoFillFrequency;

    @C09CT("query_message_size")
    public final int queryMessageSize;

    public BusinessLeadInfoConfigData() {
        this(1L, 3, 1L);
    }

    public BusinessLeadInfoConfigData(long j, int i, long j2) {
        this.dismissFrequency = j;
        this.queryMessageSize = i;
        this.fetchAutoFillFrequency = j2;
    }
}
