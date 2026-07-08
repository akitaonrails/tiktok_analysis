package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_shortcut_panel_effect_count")
public final class LiveEffectShortcutPanelEffectCountSetting {
    public static final int DEFAULT = 30;
    public static final LiveEffectShortcutPanelEffectCountSetting INSTANCE = new LiveEffectShortcutPanelEffectCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_effect_shortcut_panel_effect_count", DEFAULT);
    }
}
