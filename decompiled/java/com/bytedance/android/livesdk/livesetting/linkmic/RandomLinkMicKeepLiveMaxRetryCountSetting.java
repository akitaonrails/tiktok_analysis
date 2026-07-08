package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("auto_match_keep_alive_max_retry_count")
public final class RandomLinkMicKeepLiveMaxRetryCountSetting {
    public static final RandomLinkMicKeepLiveMaxRetryCountSetting INSTANCE = new RandomLinkMicKeepLiveMaxRetryCountSetting();
    public static final int DEFAULT = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("auto_match_keep_alive_max_retry_count", DEFAULT);
    }
}
