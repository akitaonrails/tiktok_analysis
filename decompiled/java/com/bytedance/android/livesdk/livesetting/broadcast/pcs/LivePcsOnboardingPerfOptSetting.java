package com.bytedance.android.livesdk.livesetting.broadcast.pcs;

import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_onboarding_perf_opt")
public final class LivePcsOnboardingPerfOptSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsOnboardingPerfOptSetting INSTANCE = new LivePcsOnboardingPerfOptSetting();

    private final int getValue() {
        int intValue = SettingsManager.INSTANCE.getIntValue("live_pcs_onboarding_perf_opt", DEFAULT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePcsOnboardingPerfOptSetting=");
        sbLIZ.append(intValue);
        C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
        return intValue;
    }

    private final boolean isMasterEnabled() {
        return isEnabled() || LivePcsOnboardingPerfForceEnableSetting.INSTANCE.isEnabled();
    }

    public final boolean enabledDotLottieWebp() {
        return isMasterEnabled();
    }

    public final boolean enabledDownstreamPrefetch() {
        return isMasterEnabled();
    }

    public final boolean enabledFrontPrefetch() {
        return isMasterEnabled();
    }

    public final boolean enabledLynxPreload() {
        return isMasterEnabled();
    }

    public final boolean enabledWebp() {
        return isMasterEnabled();
    }

    public final boolean isEnabled() {
        return getValue() == 1;
    }
}
