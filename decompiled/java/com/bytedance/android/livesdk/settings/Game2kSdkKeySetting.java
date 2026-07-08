package com.bytedance.android.livesdk.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "2k_sdk_key")
public final class Game2kSdkKeySetting {
    public static final String DEFAULT = "";
    public static final Game2kSdkKeySetting INSTANCE = new Game2kSdkKeySetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("2k_sdk_key", DEFAULT);
    }

    public final boolean enable() {
        return getValue().length() > 0;
    }
}
