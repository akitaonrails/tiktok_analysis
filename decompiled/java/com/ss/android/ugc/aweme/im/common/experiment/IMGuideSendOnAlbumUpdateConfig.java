package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class IMGuideSendOnAlbumUpdateConfig {

    @C09CT("is_enabled")
    public final boolean isEnabled;

    @C09CT("n_cycles_disable")
    public final int nCyclesDisable;

    @C09CT("x_display_interval_mins")
    public final long xDisplayInterval;

    @C09CT("y_times_not_clicked")
    public final int yTimesNotClicked;

    @C09CT("z_days_hide")
    public final long zDaysHide;

    public IMGuideSendOnAlbumUpdateConfig() {
        this(false, 0L, 0, 0L, 0);
    }

    public IMGuideSendOnAlbumUpdateConfig(boolean z, long j, int i, long j2, int i2) {
        this.isEnabled = z;
        this.xDisplayInterval = j;
        this.yTimesNotClicked = i;
        this.zDaysHide = j2;
        this.nCyclesDisable = i2;
    }
}
