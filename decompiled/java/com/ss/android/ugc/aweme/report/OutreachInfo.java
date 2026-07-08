package com.ss.android.ugc.aweme.report;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class OutreachInfo implements Serializable {

    @C09CT("outreach_id")
    public final String outreachId;

    @C09CT("outreach_key")
    public final String outreachKey;

    @C09CT("outreach_type")
    public final String outreachType;

    public OutreachInfo() {
        this(null, null, null);
    }

    public OutreachInfo(String str, String str2, String str3) {
        this.outreachType = str;
        this.outreachKey = str2;
        this.outreachId = str3;
    }
}
