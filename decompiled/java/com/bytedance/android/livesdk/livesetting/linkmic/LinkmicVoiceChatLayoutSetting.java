package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_voice_chat_layout_setting")
public final class LinkmicVoiceChatLayoutSetting {
    public static final LinkmicVoiceChatLayoutSetting INSTANCE = new LinkmicVoiceChatLayoutSetting();
    public static final LayoutSetting DEFAULT = new LayoutSetting(false, false, true, false, true, true, true, true, true, true, true, false);

    public final LayoutSetting getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LayoutSetting layoutSetting = DEFAULT;
        LayoutSetting layoutSetting2 = (LayoutSetting) settingsManager.getValueSafely("livesdk_linkmic_voice_chat_layout_setting", layoutSetting);
        return layoutSetting2 != null ? layoutSetting2 : layoutSetting;
    }
}
