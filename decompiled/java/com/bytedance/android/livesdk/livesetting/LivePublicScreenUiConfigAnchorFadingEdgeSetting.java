package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_anchor_fading_edge")
public final class LivePublicScreenUiConfigAnchorFadingEdgeSetting {
    public static final LivePublicScreenUiConfigAnchorFadingEdgeSetting INSTANCE = new LivePublicScreenUiConfigAnchorFadingEdgeSetting();
    public static final int DEFAULT = 24;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_ui_config_anchor_fading_edge", DEFAULT);
    }
}
