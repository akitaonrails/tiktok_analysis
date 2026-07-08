package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "host_effect_preview_countdown")
public final class CountDownEffectEnablePreviewSetting {
    public static final CountDownEffectEnablePreviewSetting INSTANCE = new CountDownEffectEnablePreviewSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("host_effect_preview_countdown", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
