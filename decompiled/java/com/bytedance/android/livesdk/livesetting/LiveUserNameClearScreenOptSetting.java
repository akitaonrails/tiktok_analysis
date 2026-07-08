package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_name_clear_screen_opt")
public final class LiveUserNameClearScreenOptSetting {
    public static final LiveUserNameClearScreenOptSetting INSTANCE = new LiveUserNameClearScreenOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_user_name_clear_screen_opt", true);

    public final boolean enable() {
        return value;
    }
}
