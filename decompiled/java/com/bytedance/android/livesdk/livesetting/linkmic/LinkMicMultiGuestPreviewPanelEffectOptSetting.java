package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_linkmic_preview_panel_effect_opt")
public final class LinkMicMultiGuestPreviewPanelEffectOptSetting {
    public static final int DEFAULT = 0;
    public static final int EXPERIMENT_GROUP = 1;
    public static final LinkMicMultiGuestPreviewPanelEffectOptSetting INSTANCE = new LinkMicMultiGuestPreviewPanelEffectOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_linkmic_preview_panel_effect_opt", DEFAULT);
    }
}
