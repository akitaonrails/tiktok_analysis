package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_user_info_show_icon_for_long_language")
public final class LiveUserInfoShowIconSetting {
    public static final LiveUserInfoShowIconSetting INSTANCE = new LiveUserInfoShowIconSetting();
    public static final String[] DEFAULT = {"ru-RU", "ja-JP", "my-MM", "uk-UA", "bn-IN"};

    public final String[] getLanguage() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_user_info_show_icon_for_long_language", DEFAULT);
    }
}
