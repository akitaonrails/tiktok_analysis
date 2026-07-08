package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class EnterRoomClickPerfOptConfig {
    public static final TypeAdapter ADAPTER = new EnterRoomClickPerfOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("feed_load_more_delay_expired_time_ms")
    public long feedLoadMoreDelayExpiredTimeMs;

    @C09CT("opt_aab_check_on_enter_room")
    public boolean optAabCheckOnEnterRoom;

    @C09CT("opt_feed_loadmore_preload_defer")
    public boolean optFeedLoadMorePreloadDefer;

    @C09CT("opt_live_room_ad_logger_lazy")
    public boolean optLiveRoomAdLoggerLazy;

    @C09CT("opt_message_manager_init_defer")
    public boolean optMessageManagerInitDefer;

    @C09CT("opt_preload_audience_toolbar_lazy")
    public boolean optPreloadAudienceToolbarLazy;

    @C09CT("opt_reddot_manager_init_defer")
    public boolean optRedDotManagerInitDefer;

    @C09CT("opt_skip_gaussian_blur_background")
    public boolean optSkipGaussianBlurBackground;

    @C09CT("opt_stream_strategy_init_defer")
    public boolean optStreamStrategyInitDefer;

    @C09CT("opt_thread_priority_boost_watch")
    public boolean optThreadPriorityBoostWatch;

    @C09CT("opt_user_attr_request_defer")
    public boolean optUserAttrRequestDefer;

    @C09CT("xml_preload_dialog_live_drawer_feed_v3_draw_opt")
    public boolean xmlPreloadDialogLiveDrawerFeedV3DrawOpt;

    public EnterRoomClickPerfOptConfig() {
        this(false, false, false, 1000L, false, false, false, false, false, false, false, false, false);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getFeedLoadMoreDelayExpiredTimeMs() {
        return this.feedLoadMoreDelayExpiredTimeMs;
    }

    public final boolean getOptAabCheckOnEnterRoom() {
        return this.optAabCheckOnEnterRoom;
    }

    public final boolean getOptFeedLoadMorePreloadDefer() {
        return this.optFeedLoadMorePreloadDefer;
    }

    public final boolean getOptLiveRoomAdLoggerLazy() {
        return this.optLiveRoomAdLoggerLazy;
    }

    public final boolean getOptMessageManagerInitDefer() {
        return this.optMessageManagerInitDefer;
    }

    public final boolean getOptPreloadAudienceToolbarLazy() {
        return this.optPreloadAudienceToolbarLazy;
    }

    public final boolean getOptRedDotManagerInitDefer() {
        return this.optRedDotManagerInitDefer;
    }

    public final boolean getOptSkipGaussianBlurBackground() {
        return this.optSkipGaussianBlurBackground;
    }

    public final boolean getOptStreamStrategyInitDefer() {
        return this.optStreamStrategyInitDefer;
    }

    public final boolean getOptThreadPriorityBoostWatch() {
        return this.optThreadPriorityBoostWatch;
    }

    public final boolean getOptUserAttrRequestDefer() {
        return this.optUserAttrRequestDefer;
    }

    public final boolean getXmlPreloadDialogLiveDrawerFeedV3DrawOpt() {
        return this.xmlPreloadDialogLiveDrawerFeedV3DrawOpt;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setFeedLoadMoreDelayExpiredTimeMs(long j) {
        this.feedLoadMoreDelayExpiredTimeMs = j;
    }

    public final void setOptAabCheckOnEnterRoom(boolean z) {
        this.optAabCheckOnEnterRoom = z;
    }

    public final void setOptFeedLoadMorePreloadDefer(boolean z) {
        this.optFeedLoadMorePreloadDefer = z;
    }

    public final void setOptLiveRoomAdLoggerLazy(boolean z) {
        this.optLiveRoomAdLoggerLazy = z;
    }

    public final void setOptMessageManagerInitDefer(boolean z) {
        this.optMessageManagerInitDefer = z;
    }

    public final void setOptPreloadAudienceToolbarLazy(boolean z) {
        this.optPreloadAudienceToolbarLazy = z;
    }

    public final void setOptRedDotManagerInitDefer(boolean z) {
        this.optRedDotManagerInitDefer = z;
    }

    public final void setOptSkipGaussianBlurBackground(boolean z) {
        this.optSkipGaussianBlurBackground = z;
    }

    public final void setOptStreamStrategyInitDefer(boolean z) {
        this.optStreamStrategyInitDefer = z;
    }

    public final void setOptThreadPriorityBoostWatch(boolean z) {
        this.optThreadPriorityBoostWatch = z;
    }

    public final void setOptUserAttrRequestDefer(boolean z) {
        this.optUserAttrRequestDefer = z;
    }

    public final void setXmlPreloadDialogLiveDrawerFeedV3DrawOpt(boolean z) {
        this.xmlPreloadDialogLiveDrawerFeedV3DrawOpt = z;
    }

    public EnterRoomClickPerfOptConfig(boolean z, boolean z2, boolean z3, long j, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.enable = z;
        this.optPreloadAudienceToolbarLazy = z2;
        this.optFeedLoadMorePreloadDefer = z3;
        this.feedLoadMoreDelayExpiredTimeMs = j;
        this.optStreamStrategyInitDefer = z4;
        this.optRedDotManagerInitDefer = z5;
        this.optSkipGaussianBlurBackground = z6;
        this.optLiveRoomAdLoggerLazy = z7;
        this.optMessageManagerInitDefer = z8;
        this.optUserAttrRequestDefer = z9;
        this.optThreadPriorityBoostWatch = z10;
        this.optAabCheckOnEnterRoom = z11;
        this.xmlPreloadDialogLiveDrawerFeedV3DrawOpt = z12;
    }
}
