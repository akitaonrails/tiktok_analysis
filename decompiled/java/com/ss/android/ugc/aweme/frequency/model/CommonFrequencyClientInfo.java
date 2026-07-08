package com.ss.android.ugc.aweme.frequency.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CommonFrequencyClientInfo implements Serializable {

    @C09CT("outreach_frequency_info")
    public final List<OutreachFrequencyInfo> entityFrequencyInfo;

    public CommonFrequencyClientInfo() {
        this(null);
    }

    public CommonFrequencyClientInfo(List<OutreachFrequencyInfo> list) {
        this.entityFrequencyInfo = list;
    }
}
