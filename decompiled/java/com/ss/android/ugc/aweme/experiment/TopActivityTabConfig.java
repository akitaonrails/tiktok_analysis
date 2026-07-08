package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TopActivityTabConfig {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("activity_schema")
    public final String activityScheme;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("gecko_channel")
    public final String geckoChannel;

    @C09CT("gecko_force_check")
    public final boolean geckoForceCheck;

    @C09CT("gecko_preload_enable")
    public final boolean geckoPreloadEnable;

    @C09CT("start_time")
    public final long startTime;

    public TopActivityTabConfig() {
        this("", 0L, 0L, "", "", false, true);
    }

    public TopActivityTabConfig(String str, long j, long j2, String str2, String str3, boolean z, boolean z2) {
        this.activityId = str;
        this.startTime = j;
        this.endTime = j2;
        this.activityScheme = str2;
        this.geckoChannel = str3;
        this.geckoForceCheck = z;
        this.geckoPreloadEnable = z2;
    }
}
