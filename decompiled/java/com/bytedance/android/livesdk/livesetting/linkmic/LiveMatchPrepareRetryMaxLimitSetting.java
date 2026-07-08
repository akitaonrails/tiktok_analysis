package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_prepare_retry_max_limit")
public final class LiveMatchPrepareRetryMaxLimitSetting {
    public static final int DEFAULT = 10;
    public static final LiveMatchPrepareRetryMaxLimitSetting INSTANCE = new LiveMatchPrepareRetryMaxLimitSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_prepare_retry_max_limit", DEFAULT);
    }
}
