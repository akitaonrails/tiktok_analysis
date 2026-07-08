package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("auto_match_keep_alive_enabled")
public final class RandomLinkMicKeepLiveEnableSetting {
    public static final boolean DEFAULT = false;
    public static final RandomLinkMicKeepLiveEnableSetting INSTANCE = new RandomLinkMicKeepLiveEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("auto_match_keep_alive_enabled", DEFAULT);
    }
}
