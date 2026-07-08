package com.ss.android.ugc.aweme.im.activestatus.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityStatus {

    @C09CT("active_cross_apps")
    public final List<CrossAppStatus> activeCrossApps;

    @C09CT("active_time")
    public final long activeTime;

    @C09CT("inactive_time")
    public final long inactiveTime;

    @C09CT("user_id")
    public final String userID;

    public ActivityStatus(String str, long j, long j2, List<CrossAppStatus> list) {
        this.userID = str;
        this.activeTime = j;
        this.inactiveTime = j2;
        this.activeCrossApps = list;
    }
}
