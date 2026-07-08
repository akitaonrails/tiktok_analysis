package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_pause_enable_effect")
public final class PauseEnableEffectSetting {
    public static final boolean DEFAULT = false;
    public static final PauseEnableEffectSetting INSTANCE = new PauseEnableEffectSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pause_enable_effect", DEFAULT);
    }
}
