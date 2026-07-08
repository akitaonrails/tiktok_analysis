package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_sdk_fast_open_disable")
public final class LiveSdkFastOpenDisableSetting {
    public static final int DEFAULT = 0;
    public static final LiveSdkFastOpenDisableSetting INSTANCE = new LiveSdkFastOpenDisableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_fast_open_disable", DEFAULT);
    }
}
