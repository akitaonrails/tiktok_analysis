package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_invite_count_down_setting")
public final class MultiGuestInviteCountDownSetting {
    public static final MultiGuestInviteCountDownSetting INSTANCE = new MultiGuestInviteCountDownSetting();
    public static final int DEFAULT = 120;

    public static final int getCountDownSeconds() {
        return SettingsManager.INSTANCE.getIntValue("mg_invite_count_down_setting", DEFAULT);
    }
}
