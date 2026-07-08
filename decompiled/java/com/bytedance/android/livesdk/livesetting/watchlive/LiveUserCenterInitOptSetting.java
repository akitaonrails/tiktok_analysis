package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_user_center_init_opt")
public final class LiveUserCenterInitOptSetting {
    public static final boolean DEFAULT = false;
    public static final LiveUserCenterInitOptSetting INSTANCE = new LiveUserCenterInitOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_user_center_init_opt", DEFAULT);
    }
}
