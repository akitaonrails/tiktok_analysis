package com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AdFastScrollAbModel {

    @C09CT("business_name")
    public final String business_name;

    @C09CT("feature_enable")
    public final boolean featureEnable;

    @C09CT("first_feed_show_optimization")
    public final boolean firstFeedShowOptimization;

    @C09CT("first_frame_metrics_optimization")
    public final boolean firstFrameMetricsOptimization;

    @C09CT("label_upload_enable")
    public final boolean labelUploadEnable;

    @C09CT("model_feature_optimization_v1")
    public final boolean modelFeatureOptimizationV1;

    @C09CT("post_delay_on_video_selected_ms")
    public final long postDelayOnVideoSelected;

    @C09CT("post_delay_on_video_selected_first_render_ms")
    public final long postDelayOnVideoSelectedFirstRenderCalled;

    @C09CT("send_to_vod_strategy_center")
    public final boolean sendToVodStrategyCenter;

    @C09CT("trigger_ahead_number")
    public final int triggerAheadNumber;

    public AdFastScrollAbModel() {
        this(false, "tt_ads_fast_scroll_prediction", false, 5, false, 200L, 100L, false, false, false);
    }

    public AdFastScrollAbModel(boolean z, String str, boolean z2, int i, boolean z3, long j, long j2, boolean z4, boolean z5, boolean z6) {
        this.featureEnable = z;
        this.business_name = str;
        this.labelUploadEnable = z2;
        this.triggerAheadNumber = i;
        this.firstFrameMetricsOptimization = z3;
        this.postDelayOnVideoSelected = j;
        this.postDelayOnVideoSelectedFirstRenderCalled = j2;
        this.modelFeatureOptimizationV1 = z4;
        this.sendToVodStrategyCenter = z5;
        this.firstFeedShowOptimization = z6;
    }
}
