package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_audience_user_font_color")
public final class LivePublicScreenUiConfigAudienceUserFontColorSetting {
    public static final LivePublicScreenUiConfigAudienceUserFontColorSetting INSTANCE = new LivePublicScreenUiConfigAudienceUserFontColorSetting();
    public static final String DEFAULT = "#80FFFFFF";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePublicScreenUiConfigAudienceUserFontColorSetting.class);
    }
}
