package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_preview_enabled")
public final class LiveEffectPreviewEnableSwitch {
    public static final LiveEffectPreviewEnableSwitch INSTANCE = new LiveEffectPreviewEnableSwitch();
    public static final boolean DEFAULT = true;

    private final boolean getSettingValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_effect_preview_enabled", DEFAULT);
    }

    public final boolean enable() {
        return getSettingValue();
    }
}
