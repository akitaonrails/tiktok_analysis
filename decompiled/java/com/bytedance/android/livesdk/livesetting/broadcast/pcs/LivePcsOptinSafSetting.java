package com.bytedance.android.livesdk.livesetting.broadcast.pcs;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = true, value = "live_pcs_optin_saf")
public final class LivePcsOptinSafSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsOptinSafSetting INSTANCE = new LivePcsOptinSafSetting();

    public final boolean enablePrefetch() {
        return isEnabled(1);
    }

    public final boolean enableSAF() {
        return isEnabled(2);
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_optin_saf", DEFAULT);
    }

    private final boolean isEnabled(int i) {
        if ((i & getValue()) != 0) {
            return true;
        }
        return false;
    }
}
