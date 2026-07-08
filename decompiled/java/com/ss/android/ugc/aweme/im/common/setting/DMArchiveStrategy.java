package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes15.dex */
public final class DMArchiveStrategy {

    @C09CT("auto_archive_inactive_interval_in_ms")
    public final long autoArchiveInactiveIntervalMs;

    @C09CT("auto_archive_inactive_on_preload_delay_in_ms")
    public final long autoArchiveOnPreloadDelayMs;

    @C09CT("expiration_time_to_auto_archive_in_day")
    public final int expirationTimeToAutoArchiveDay;

    @C09CT("unread_num_threshold_to_guide_auto_archive_inactive")
    public final int unreadNumThresholdToGuideAutoArchive;

    public DMArchiveStrategy() {
        this(30, 99, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public DMArchiveStrategy(int i, int i2, long j, long j2) {
        this.expirationTimeToAutoArchiveDay = i;
        this.unreadNumThresholdToGuideAutoArchive = i2;
        this.autoArchiveOnPreloadDelayMs = j;
        this.autoArchiveInactiveIntervalMs = j2;
    }
}
