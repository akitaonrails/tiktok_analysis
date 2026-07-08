package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_anchor_user_font_color")
public final class LivePublicScreenUiConfigAnchorUserFontColorSetting {
    public static final LivePublicScreenUiConfigAnchorUserFontColorSetting INSTANCE = new LivePublicScreenUiConfigAnchorUserFontColorSetting();
    public static final String DEFAULT = "#80FFFFFF";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePublicScreenUiConfigAnchorUserFontColorSetting.class);
    }
}
