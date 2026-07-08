package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_follow_margin_opt_setting")
public final class LiveFollowLayoutMarginOptSetting {
    public static final LiveFollowLayoutMarginOptSetting INSTANCE = new LiveFollowLayoutMarginOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_follow_margin_opt_setting", true);

    public final boolean enable() {
        return value;
    }
}
