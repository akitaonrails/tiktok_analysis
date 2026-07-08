package com.bytedance.android.livesdk.programmedlive.pin;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_custom_message_translate_api_latency")
public final class LiveCustomMessageTranslateApiLatencySetting {
    public static final long DEFAULT = 10000;
    public static final LiveCustomMessageTranslateApiLatencySetting INSTANCE = new LiveCustomMessageTranslateApiLatencySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_custom_message_translate_api_latency", DEFAULT);
    }
}
