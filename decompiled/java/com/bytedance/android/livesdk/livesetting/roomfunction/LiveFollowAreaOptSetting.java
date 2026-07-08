package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_follow_click_area_opt")
public final class LiveFollowAreaOptSetting {
    public static final LiveFollowAreaOptSetting INSTANCE = new LiveFollowAreaOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_follow_click_area_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
