package com.ss.android.ugc.playerkit.model;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class PlayListWiseBitrateSelectConfig {

    @C09CT("checking_playlist_len")
    public final int checkingPlayListLen;

    @C09CT("checking_playlist_offset")
    public final int checkingPlayListOffset;

    @C09CT("first_feed_cnt_threshold")
    public final int firstFeedCntThreshold;

    @C09CT("ladder_selection_predict_type")
    public final int ladderSelectionPredictType;

    @C09CT("max_bandwidth_usage_factor")
    public final float maxBandwidthUsageFactor;

    @C09CT("max_fd_bandwidth_usage_factor")
    public final float maxFdBandwidthUsageFactor;

    @C09CT("max_fd_internet_speed_KBps")
    public final int maxFdInternetSpeedKBps;

    @C09CT("max_nfd_internet_speed_KBps")
    public final int maxInternetSpeedKBps;

    @C09CT("max_reserved_duration_ms")
    public final long maxReservedDurationMs;

    @C09CT("min_bandwidth_usage_factor")
    public final float minBandwidthUsageFactor;

    @C09CT("min_fd_bandwidth_usage_factor")
    public final float minFdBandwidthUsageFactor;

    @C09CT("min_fd_internet_speed_KBps")
    public final int minFdInternetSpeedKBps;

    @C09CT("min_nfd_internet_speed_KBps")
    public final int minInternetSpeedKBps;

    @C09CT("safe_cache_duration_ms")
    public final long safeCacheDurationMs;

    public PlayListWiseBitrateSelectConfig() {
        this(0, Mp4ScreenVideoLoadTimeout.CONTROL, 2000L, 0, 4, 1.5f, 0.7f, 8000, 100, 5, 1.2f, 0.8f, 4000, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public PlayListWiseBitrateSelectConfig(int i, long j, long j2, int i2, int i3, float f, float f2, int i4, int i5, int i6, float f3, float f4, int i7, int i8) {
        this.ladderSelectionPredictType = i;
        this.maxReservedDurationMs = j;
        this.safeCacheDurationMs = j2;
        this.checkingPlayListOffset = i2;
        this.checkingPlayListLen = i3;
        this.maxBandwidthUsageFactor = f;
        this.minBandwidthUsageFactor = f2;
        this.maxInternetSpeedKBps = i4;
        this.minInternetSpeedKBps = i5;
        this.firstFeedCntThreshold = i6;
        this.maxFdBandwidthUsageFactor = f3;
        this.minFdBandwidthUsageFactor = f4;
        this.maxFdInternetSpeedKBps = i7;
        this.minFdInternetSpeedKBps = i8;
    }
}
