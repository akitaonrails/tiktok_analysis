package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_mp_host")
public final class LiveMPHostSetting {
    public static final String DEFAULT = "https://webcast16-normal-useast5.tiktokv.us.com";
    public static final LiveMPHostSetting INSTANCE = new LiveMPHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_mp_host", DEFAULT);
    }
}
