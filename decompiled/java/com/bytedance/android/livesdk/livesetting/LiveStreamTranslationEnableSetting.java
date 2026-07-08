package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_stream_translation_enable")
public final class LiveStreamTranslationEnableSetting {
    public static final LiveStreamTranslationEnableSetting INSTANCE = new LiveStreamTranslationEnableSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_stream_translation_enable", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
