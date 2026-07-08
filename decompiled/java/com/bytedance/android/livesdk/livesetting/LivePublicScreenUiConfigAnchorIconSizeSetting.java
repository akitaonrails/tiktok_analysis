package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_anchor_icon_size")
public final class LivePublicScreenUiConfigAnchorIconSizeSetting {
    public static final LivePublicScreenUiConfigAnchorIconSizeSetting INSTANCE = new LivePublicScreenUiConfigAnchorIconSizeSetting();
    public static final int DEFAULT = 12;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_ui_config_anchor_icon_size", DEFAULT);
    }
}
