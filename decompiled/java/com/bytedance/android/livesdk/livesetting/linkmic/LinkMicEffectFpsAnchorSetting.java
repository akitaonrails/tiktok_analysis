package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_effect_fps_anchor")
public final class LinkMicEffectFpsAnchorSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicEffectFpsAnchorSetting INSTANCE = new LinkMicEffectFpsAnchorSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_effect_fps_anchor", DEFAULT);
    }
}
