package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C0C64;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes15.dex */
public final class IMAdaptiveNetworkRequestExperiment {
    public static final RequestManagerConfiguration LIZ = new RequestManagerConfiguration(8, 4, false, false, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 300);

    public static final class RequestManagerConfiguration {

        @C09CT("enable_feature_delay")
        public final boolean enableFeatureDelay;

        @C09CT("enable_switch_off")
        public final boolean enableSwitchOff;

        @C09CT("enter_chat_delay_time_ms")
        public final long enterChatDelayTimeMs;

        @C09CT("good_disable_network_quality_threshold")
        public final int goodDisableNetworkQualityThreshold;

        @C09CT("good_network_quality_threshold")
        public final int goodNetworkQualityThreshold;

        @C09CT("network_level_cache_expire_time_ms")
        public final long networkLevelCacheExpiryTimeMs;

        @C09CT("task_sparse_interval_ms")
        public final long taskSparseIntervalMs;

        public RequestManagerConfiguration() {
            this(8, 4, false, false, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 300L);
        }

        public RequestManagerConfiguration(int i, int i2, boolean z, boolean z2, long j, long j2, long j3) {
            this.goodNetworkQualityThreshold = i;
            this.goodDisableNetworkQualityThreshold = i2;
            this.enableSwitchOff = z;
            this.enableFeatureDelay = z2;
            this.networkLevelCacheExpiryTimeMs = j;
            this.enterChatDelayTimeMs = j2;
            this.taskSparseIntervalMs = j3;
        }
    }

    public static RequestManagerConfiguration LIZ() {
        RequestManagerConfiguration requestManagerConfiguration = (RequestManagerConfiguration) C0C64.LJIILLIIL().LJJII(RequestManagerConfiguration.class, LIZ, "tt_im_adaptive_network_request", true);
        return requestManagerConfiguration == null ? new RequestManagerConfiguration(8, 4, false, false, Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 300L) : requestManagerConfiguration;
    }
}
