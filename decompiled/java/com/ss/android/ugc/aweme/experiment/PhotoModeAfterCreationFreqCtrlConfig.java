package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class PhotoModeAfterCreationFreqCtrlConfig {

    @C09CT("consecutive_item_exit_threshold")
    public final int consecutiveItemExitThreshold;

    @C09CT("gid_max_exposure_count")
    public final int gidMaxExposureCount;

    @C09CT("interval_ms")
    public final long intervalMs;

    @C09CT("no_click_exit_threshold")
    public final int noClickExitThreshold;

    @C09CT("uid_daily_max_exposure_level_1")
    public final int uidDailyMaxExposureLevel1;

    @C09CT("uid_daily_max_exposure_level_2")
    public final int uidDailyMaxExposureLevel2;

    @C09CT("uid_daily_max_exposure_level_3")
    public final int uidDailyMaxExposureLevel3;

    @C09CT("uid_different_did_max_exposure_num")
    public final int uidDistinctGidExitThreshold;

    public PhotoModeAfterCreationFreqCtrlConfig() {
        this(3, 86400000L, 3, 5, 3, 1, 3, 3);
    }

    public PhotoModeAfterCreationFreqCtrlConfig(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.noClickExitThreshold = i;
        this.intervalMs = j;
        this.gidMaxExposureCount = i2;
        this.uidDailyMaxExposureLevel1 = i3;
        this.uidDailyMaxExposureLevel2 = i4;
        this.uidDailyMaxExposureLevel3 = i5;
        this.consecutiveItemExitThreshold = i6;
        this.uidDistinctGidExitThreshold = i7;
    }
}
