package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_fans_club_new_tip_text_size_language")
public final class LiveFansClubNewTextLanguageSetting {
    public static final LiveFansClubNewTextLanguageSetting INSTANCE = new LiveFansClubNewTextLanguageSetting();
    public static final String[] DEFAULT = {"uk-UA", "pt", "lv", "cs-CZ", "fr", "fr-CA", "es"};

    public final String[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("live_fans_club_new_tip_text_size_language", strArr);
        return stringArrayValue != null ? stringArrayValue : strArr;
    }
}
