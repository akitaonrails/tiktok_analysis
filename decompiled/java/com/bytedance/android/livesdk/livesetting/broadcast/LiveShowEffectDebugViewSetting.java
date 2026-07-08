package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_show_effect_debug_view")
public final class LiveShowEffectDebugViewSetting {
    public static final boolean DEFAULT = false;
    public static final LiveShowEffectDebugViewSetting INSTANCE = new LiveShowEffectDebugViewSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_show_effect_debug_view", DEFAULT);
    }
}
