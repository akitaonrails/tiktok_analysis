package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_avatar_list_offset_opt")
public final class LiveSdkAvatarListOffsetOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkAvatarListOffsetOptSetting INSTANCE = new LiveSdkAvatarListOffsetOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_avatar_list_offset_opt", DEFAULT);
    }
}
