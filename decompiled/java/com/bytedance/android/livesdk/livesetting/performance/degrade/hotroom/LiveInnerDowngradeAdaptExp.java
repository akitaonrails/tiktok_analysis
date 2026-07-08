package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C01GW;
import X.C20483815Dg;
import X.C2097608Jq;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_downgrade_adapt_exp")
public final class LiveInnerDowngradeAdaptExp {
    public static boolean disableAlog;
    public static boolean disableApmLog;
    public static final LiveInnerDowngradeAdaptExp INSTANCE = new LiveInnerDowngradeAdaptExp();
    public static final AdaptExpConfig DEFAULT = new AdaptExpConfig(false, false, false, false, false, false, false, false, false, false, 0, false, 2, false, false, false, 2, false, false, false, 2000, false, false, false, false, false, false, Mp4ScreenVideoLoadTimeout.CONTROL, false, 80, 0.6f, false, false, false, false, C2097608Jq.LJ(), false, false);
    public static final C01GW expValue$delegate = C452501pT.LIZIZ(new C20483815Dg());

    public final AdaptExpConfig getExpValue() {
        return (AdaptExpConfig) expValue$delegate.getValue();
    }

    public final boolean isDisableAlog() {
        return getExpValue().getAdaptDisableAlog() && disableAlog;
    }

    public final boolean isDisableApmLog() {
        return getExpValue().getAdaptDisableApmLog() && disableApmLog;
    }

    public final boolean getDisableAlog() {
        return disableAlog;
    }

    public final boolean getDisableApmLog() {
        return disableApmLog;
    }

    public final boolean isLikeAnimDowngrade(boolean z) {
        if (z) {
            return getExpValue().getEnableLikeAnimAnchorDowngrade();
        }
        return getExpValue().getEnableLikeAnimAudienceDowngrade();
    }

    public final void setDisableAlog(boolean z) {
        disableAlog = z;
    }

    public final void setDisableApmLog(boolean z) {
        disableApmLog = z;
    }
}
