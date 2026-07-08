package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("auto_match_keep_alive_interval")
public final class RandomLinkMicKeepLiveIntervalSetting {
    public static final RandomLinkMicKeepLiveIntervalSetting INSTANCE = new RandomLinkMicKeepLiveIntervalSetting();
    public static final long DEFAULT = 4;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("auto_match_keep_alive_interval", DEFAULT);
    }
}
