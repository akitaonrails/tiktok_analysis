package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_effect_shortcut_panel_effect_replace")
public final class LiveEffectShortcutPanelReplaceSetting {
    public static final boolean DEFAULT = true;
    public static final LiveEffectShortcutPanelReplaceSetting INSTANCE = new LiveEffectShortcutPanelReplaceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_effect_shortcut_panel_effect_replace", DEFAULT);
    }
}
