package com.bytedance.android.livesdk.qa;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_qa_api_retry_count")
public final class LivesdkQaApiRetryCountSetting {
    public static final int DEFAULT = 3;
    public static final LivesdkQaApiRetryCountSetting INSTANCE = new LivesdkQaApiRetryCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("livesdk_qa_api_retry_count", DEFAULT);
    }
}
