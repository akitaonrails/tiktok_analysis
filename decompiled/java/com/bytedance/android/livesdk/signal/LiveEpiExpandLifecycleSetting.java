package com.bytedance.android.livesdk.signal;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_epi_expand_lifecycle")
public final class LiveEpiExpandLifecycleSetting {
    public static final int DEFAULT = 0;
    public static final LiveEpiExpandLifecycleSetting INSTANCE = new LiveEpiExpandLifecycleSetting();

    public final boolean connectWsWhenUplink() {
        return SettingsManager.INSTANCE.getIntValue("live_epi_expand_lifecycle", DEFAULT) > 1;
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_epi_expand_lifecycle", DEFAULT) > 0;
    }
}
