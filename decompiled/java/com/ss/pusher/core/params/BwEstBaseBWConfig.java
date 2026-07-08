package com.ss.pusher.core.params;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes21.dex */
public final class BwEstBaseBWConfig {

    @C09CT("use_adaptive_fps")
    public final int useAdaptiveFps;

    @C09CT("use_ewma_bandwidth_estimate")
    public final int useEwmaBandwidthEstimate;

    @C09CT("transport_bw_est_1s")
    public final int transportBwEst1 = LSPassThroughRecordSizeConfig.DEFAULT;

    @C09CT("transport_bw_est_2s")
    public final int transportBwEst2 = 2000;

    @C09CT("codetable_set_fps")
    public final int codetableSetFps = 15;

    @C09CT("min_frame_rate")
    public final int minFrameRate = 10;

    @C09CT("bwe_sample_dur_length")
    public final int bweSampleDurLength = 500;

    @C09CT("transport_bw_est_1s_factor")
    public final double transportBwest1sFactor = 1.5d;

    @C09CT("transport_bw_est_3s_factor")
    public final double transportBwest3sFactor = 1.25d;

    @C09CT("durlist_rate_1s_factor")
    public final double durlistRate1sFactor = 0.1d;

    @C09CT("durlist_rate_2s_factor")
    public final double durlistRate2sFactor = 0.2d;

    @C09CT("bwe_factor")
    public final double bweFactor = 0.95d;

    @C09CT("bitrate_adjust_interval")
    public final int bitraAdjustInterval = 1;

    @C09CT("min_adjust_step")
    public final int minAdjustStep = 30;
}
