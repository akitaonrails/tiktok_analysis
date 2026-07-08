package com.bytedance.android.livesdk.livesetting.feed;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_huawei_fold_screen_device_list")
public final class LiveHuaweiFoldScreenDeviceListSetting {
    public static final LiveHuaweiFoldScreenDeviceListSetting INSTANCE = new LiveHuaweiFoldScreenDeviceListSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_huawei_fold_screen_device_list", DEFAULT);
    }

    public static final boolean contains(String str) {
        if (str == null) {
            return false;
        }
        return C13LQ.LJIILLIIL(str, INSTANCE.getValue());
    }
}
