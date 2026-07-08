package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_add_fetch_user_list_for_chmg_opt")
public final class LiveSdkMultiAddFetchUserListForChMgOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiAddFetchUserListForChMgOptSetting INSTANCE = new LiveSdkMultiAddFetchUserListForChMgOptSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_add_fetch_user_list_for_chmg_opt", DEFAULT);
    }
}
