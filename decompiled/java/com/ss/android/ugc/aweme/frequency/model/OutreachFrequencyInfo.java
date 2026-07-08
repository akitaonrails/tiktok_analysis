package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachFrequencyInfo implements Serializable {

    @C09CT("not_allow_key_list")
    public final List<NotAllowOutreachItemInfo> notAllowKeyList;

    @C09CT("outreach_type")
    public final String outreachType;

    public OutreachFrequencyInfo() {
        this(null, null);
    }

    public OutreachFrequencyInfo(String str, List<NotAllowOutreachItemInfo> list) {
        this.outreachType = str;
        this.notAllowKeyList = list;
    }
}
