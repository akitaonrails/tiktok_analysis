package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AudienceSubInfo implements Serializable {
    public static final SubStatus SubStatus = new SubStatus();

    @C09CT("sub_status")
    public final int subStatus;

    public static final class SubStatus {
    }

    public final int getSubStatus() {
        return this.subStatus;
    }

    public AudienceSubInfo(int i) {
        this.subStatus = i;
    }
}
