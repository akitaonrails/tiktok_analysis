package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_ui_config_audience_text_font_weight")
public final class LivePublicScreenUiConfigAudienceTextFontWeightSetting {
    public static final int DEFAULT = 0;
    public static final LivePublicScreenUiConfigAudienceTextFontWeightSetting INSTANCE = new LivePublicScreenUiConfigAudienceTextFontWeightSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_ui_config_audience_text_font_weight", DEFAULT);
    }
}
