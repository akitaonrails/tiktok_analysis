package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_user_name_show_opt")
public final class LiveUserNameShowOptSetting {
    public static final LiveUserNameShowOptSetting INSTANCE = new LiveUserNameShowOptSetting();
    public static final int DEFAULT = 3;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_user_name_show_opt", DEFAULT);

    public final boolean enable() {
        return value > 0;
    }

    public final int value() {
        return value;
    }
}
