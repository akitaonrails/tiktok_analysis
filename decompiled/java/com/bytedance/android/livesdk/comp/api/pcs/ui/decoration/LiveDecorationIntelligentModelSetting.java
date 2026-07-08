package com.bytedance.android.livesdk.comp.api.pcs.ui.decoration;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_decoration_intelligent_model_setting")
public final class LiveDecorationIntelligentModelSetting {
    public static final LiveDecorationIntelligentModelSetting INSTANCE = new LiveDecorationIntelligentModelSetting();
    public static final String DEFAULT = "";

    public final String getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String str = DEFAULT;
        String stringValue = settingsManager.getStringValue("live_decoration_intelligent_model_setting", str);
        return stringValue != null ? stringValue : str;
    }
}
