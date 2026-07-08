package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_add_invitee_enter_source_opt")
public final class LiveSdkMultiAddInviteeEnterSourceOptSetting {
    public static final int DEFAULT = 1;
    public static final LiveSdkMultiAddInviteeEnterSourceOptSetting INSTANCE = new LiveSdkMultiAddInviteeEnterSourceOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multi_add_invitee_enter_source_opt", DEFAULT) == 1;
    }
}
