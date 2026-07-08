package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "hangout_cmp_guide_panel_enable")
public final class HangoutCmpGuidePanelEnableSetting {
    public static final boolean DEFAULT = true;
    public static final HangoutCmpGuidePanelEnableSetting INSTANCE = new HangoutCmpGuidePanelEnableSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("hangout_cmp_guide_panel_enable", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
