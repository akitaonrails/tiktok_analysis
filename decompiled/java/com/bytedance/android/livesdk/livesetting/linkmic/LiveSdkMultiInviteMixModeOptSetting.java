package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_invite_mix_mode_opt")
public final class LiveSdkMultiInviteMixModeOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiInviteMixModeOptSetting INSTANCE = new LiveSdkMultiInviteMixModeOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_invite_mix_mode_opt", DEFAULT);
    }
}
