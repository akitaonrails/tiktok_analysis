package com.bytedance.android.livesdk.livesetting.performance;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_enter_room_click_perf_opt")
public final class LiveEnterRoomClickPerfOptSetting {
    public static final LiveEnterRoomClickPerfOptSetting INSTANCE = new LiveEnterRoomClickPerfOptSetting();
    public static final EnterRoomClickPerfOptConfig DEFAULT = new EnterRoomClickPerfOptConfig(false, false, false, 1000, false, false, false, false, false, false, false, false, false);
    public static final C01GW expConfig$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(70));

    public static final boolean enable() {
        return INSTANCE.getExpConfig().getEnable();
    }

    public static final long feedLoadMoreDelayExpiredTimeMs() {
        return INSTANCE.getExpConfig().getFeedLoadMoreDelayExpiredTimeMs();
    }

    private final EnterRoomClickPerfOptConfig getExpConfig() {
        return (EnterRoomClickPerfOptConfig) expConfig$delegate.getValue();
    }

    public static final boolean optAabCheckOnEnterRoom() {
        return INSTANCE.getExpConfig().getOptAabCheckOnEnterRoom();
    }

    public static final boolean optFeedLoadMorePreloadDefer() {
        return INSTANCE.getExpConfig().getOptFeedLoadMorePreloadDefer();
    }

    public static final boolean optLiveRoomAdLoggerLazy() {
        return INSTANCE.getExpConfig().getOptLiveRoomAdLoggerLazy();
    }

    public static final boolean optMessageManagerInitDefer() {
        return INSTANCE.getExpConfig().getOptMessageManagerInitDefer();
    }

    public static final boolean optPreloadAudienceToolbarLazy() {
        return INSTANCE.getExpConfig().getOptPreloadAudienceToolbarLazy();
    }

    public static final boolean optRedDotManagerInitDefer() {
        return INSTANCE.getExpConfig().getOptRedDotManagerInitDefer();
    }

    public static final boolean optSkipGaussianBlurBackground() {
        return INSTANCE.getExpConfig().getOptSkipGaussianBlurBackground();
    }

    public static final boolean optStreamStrategyInitDefer() {
        return INSTANCE.getExpConfig().getOptStreamStrategyInitDefer();
    }

    public static final boolean optThreadPriorityBoostWatch() {
        return INSTANCE.getExpConfig().getOptThreadPriorityBoostWatch();
    }

    public static final boolean optUserAttrRequestDefer() {
        return INSTANCE.getExpConfig().getOptUserAttrRequestDefer();
    }

    public static final boolean xmlPreloadDialogLiveDrawerFeedV3DrawOpt() {
        return INSTANCE.getExpConfig().getXmlPreloadDialogLiveDrawerFeedV3DrawOpt();
    }
}
