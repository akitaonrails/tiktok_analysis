package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_sdk_join_channel_retry_count")
public final class LinkMicSdkJoinChannelRetryCount {
    public static final long DEFAULT = 1;
    public static final LinkMicSdkJoinChannelRetryCount INSTANCE = new LinkMicSdkJoinChannelRetryCount();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("linkmic_sdk_join_channel_retry_count", DEFAULT);
    }
}
