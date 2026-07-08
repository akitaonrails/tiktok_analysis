package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_anchor_container_height")
public final class LivePublicScreenUiConfigAnchorContainerHeightSetting {
    public static final LivePublicScreenUiConfigAnchorContainerHeightSetting INSTANCE = new LivePublicScreenUiConfigAnchorContainerHeightSetting();
    public static final int DEFAULT = 220;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_ui_config_anchor_container_height", DEFAULT);
    }
}
