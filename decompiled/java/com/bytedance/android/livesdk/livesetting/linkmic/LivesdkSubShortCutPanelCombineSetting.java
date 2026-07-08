package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_sub_short_cut_panel_combine")
public final class LivesdkSubShortCutPanelCombineSetting {
    public static final boolean DEFAULT = true;
    public static final LivesdkSubShortCutPanelCombineSetting INSTANCE = new LivesdkSubShortCutPanelCombineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_sub_short_cut_panel_combine", DEFAULT);
    }
}
