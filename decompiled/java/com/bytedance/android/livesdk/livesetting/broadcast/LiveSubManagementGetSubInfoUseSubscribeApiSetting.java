package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_management_get_sub_info_use_subscribe_api")
public final class LiveSubManagementGetSubInfoUseSubscribeApiSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSubManagementGetSubInfoUseSubscribeApiSetting INSTANCE = new LiveSubManagementGetSubInfoUseSubscribeApiSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_management_get_sub_info_use_subscribe_api", DEFAULT);
    }
}
