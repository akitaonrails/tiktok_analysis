package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fluency_enter_duration")
public final class LiveFluencyEnterDurationSetting {
    public static final long DEFAULT = 5000;
    public static final LiveFluencyEnterDurationSetting INSTANCE = new LiveFluencyEnterDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_fluency_enter_duration", DEFAULT);
    }
}
