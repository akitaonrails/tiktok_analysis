package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("auto_match_keep_alive_retry_enabled")
public final class RandomLinkMicKeepLiveRetryEnableSetting {
    public static final RandomLinkMicKeepLiveRetryEnableSetting INSTANCE = new RandomLinkMicKeepLiveRetryEnableSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("auto_match_keep_alive_retry_enabled", DEFAULT);
    }
}
