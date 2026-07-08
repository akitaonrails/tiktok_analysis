package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_center_opt_no_auth")
public final class LiveCenter50FollowerDisplay {
    public static final int DEFAULT = 0;
    public static final LiveCenter50FollowerDisplay INSTANCE = new LiveCenter50FollowerDisplay();

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_opt_no_auth", DEFAULT);
    }

    public final boolean enable() {
        return getSettingValue() > 0;
    }
}
