package com.ss.android.ugc.feed.platform.componentmanager.outreach;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class FcpComponentOutreachFrequencyExtraInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("log_id")
    public final String logID;

    public FcpComponentOutreachFrequencyExtraInfo() {
        this(null, null);
    }

    public FcpComponentOutreachFrequencyExtraInfo(String str, String str2) {
        this.groupId = str;
        this.logID = str2;
    }
}
