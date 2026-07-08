package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_process_effect_immediately")
public final class TTLSEnableProcessEffectImmediatelySettings {
    public static final boolean DEFAULT = false;
    public static final TTLSEnableProcessEffectImmediatelySettings INSTANCE = new TTLSEnableProcessEffectImmediatelySettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlivestreamer_process_effect_immediately", DEFAULT);
    }
}
