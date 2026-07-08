package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_effect_fps_guest")
public final class LinkMicEffectFpsGuestSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicEffectFpsGuestSetting INSTANCE = new LinkMicEffectFpsGuestSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_effect_fps_guest", DEFAULT);
    }
}
