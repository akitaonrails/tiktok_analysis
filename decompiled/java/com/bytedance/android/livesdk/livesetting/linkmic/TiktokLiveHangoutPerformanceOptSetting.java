package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_hangout_performance_opt")
public final class TiktokLiveHangoutPerformanceOptSetting {
    public static final TiktokLiveHangoutPerformanceOptSetting INSTANCE = new TiktokLiveHangoutPerformanceOptSetting();
    public static final TiktokLiveHangoutPerformanceOptConfig DEFAULT = new TiktokLiveHangoutPerformanceOptConfig(false, false, false, false, false, false, false, false, false, false, false, false, false);
    public static final C01GW value$delegate = C452501pT.LIZ(EnumC452301pR.NONE, AFwS206S0000000_18.get$arr$(48));

    private final TiktokLiveHangoutPerformanceOptConfig getValue() {
        return (TiktokLiveHangoutPerformanceOptConfig) value$delegate.getValue();
    }

    public static final boolean isDispatchOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().dispatchOpt;
    }

    public static final boolean isHangoutFragmentV2AsyncInflateOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().hangoutFragmentV2AsyncInflateOpt;
    }

    public static final boolean isHangoutFragmentV2StagedAssembleOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().hangoutFragmentV2StagedAssembleOpt;
    }

    public static final boolean isHangoutFragmentV2X2cInflateOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().hangoutFragmentV2X2cInflateOpt;
    }

    public static final boolean isHotPathLogReduceOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().hotPathLogReduceOpt;
    }

    public static final boolean isInteractModuleRecyclerViewReuseOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().interactModuleRecyclerViewReuseOpt;
    }

    public static final boolean isPlayCardFeedCellWidthAnimatorOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().playCardFeedCellWidthAnimatorOpt;
    }

    public static final boolean isPlayFeedLazyCenterLoadingOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().playFeedLazyCenterLoadingOpt;
    }

    public static final boolean isPlayFeedScrollDedupOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().playFeedScrollDedupOpt;
    }

    public static final boolean isRandomMatchEnterRoomOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().randomMatchEnterRoomOpt;
    }

    public static final boolean isRoomFeedFragmentAsyncCommitOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().roomFeedFragmentAsyncCommitOpt;
    }

    public static final boolean isRoomFeedLayoutChangeThrottleOpt() {
        TiktokLiveHangoutPerformanceOptSetting tiktokLiveHangoutPerformanceOptSetting = INSTANCE;
        return tiktokLiveHangoutPerformanceOptSetting.getValue().enable && tiktokLiveHangoutPerformanceOptSetting.getValue().roomFeedLayoutChangeThrottleOpt;
    }
}
