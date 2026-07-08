package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_background_repel")
public final class LiveEffectBackgroundCoexistSetting {
    public static final boolean DEFAULT = true;
    public static final LiveEffectBackgroundCoexistSetting INSTANCE = new LiveEffectBackgroundCoexistSetting();

    public final boolean enable() {
        return !SettingsManager.INSTANCE.getBooleanValue("live_effect_background_repel", DEFAULT);
    }

    public final boolean disable() {
        return !enable();
    }
}
