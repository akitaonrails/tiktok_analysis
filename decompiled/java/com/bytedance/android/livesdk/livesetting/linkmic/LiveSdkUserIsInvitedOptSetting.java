package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_user_is_invited_opt")
public final class LiveSdkUserIsInvitedOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkUserIsInvitedOptSetting INSTANCE = new LiveSdkUserIsInvitedOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_user_is_invited_opt", DEFAULT);
    }
}
