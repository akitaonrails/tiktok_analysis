package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_prepare_retry_interval")
public final class LiveMatchPrepareRetryIntervalSetting {
    public static final long DEFAULT = 500;
    public static final LiveMatchPrepareRetryIntervalSetting INSTANCE = new LiveMatchPrepareRetryIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_match_prepare_retry_interval", DEFAULT);
    }
}
