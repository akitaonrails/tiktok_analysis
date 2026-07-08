package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_anchor_content_font_color")
public final class LivePublicScreenUiConfigAnchorContentFontColorSetting {
    public static final LivePublicScreenUiConfigAnchorContentFontColorSetting INSTANCE = new LivePublicScreenUiConfigAnchorContentFontColorSetting();
    public static final String DEFAULT = "#E6FFFFFF";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePublicScreenUiConfigAnchorContentFontColorSetting.class);
    }
}
