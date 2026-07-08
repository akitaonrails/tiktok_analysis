package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_unknown_source_config")
public final class LiveUnknownSourceConfigSetting {
    public static final LiveUnknownSourceConfigSetting INSTANCE = new LiveUnknownSourceConfigSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_unknown_source_config", DEFAULT);
    }
}
