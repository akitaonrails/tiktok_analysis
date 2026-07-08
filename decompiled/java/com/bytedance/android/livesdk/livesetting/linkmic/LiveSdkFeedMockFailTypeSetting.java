package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_feed_mock_fail_type")
public final class LiveSdkFeedMockFailTypeSetting {
    public static final int DEFAULT = 0;
    public static final int EMPTY = 2;
    public static final int EXCEPTION = 1;
    public static final LiveSdkFeedMockFailTypeSetting INSTANCE = new LiveSdkFeedMockFailTypeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_feed_mock_fail_type", DEFAULT);
    }

    public final boolean isEmpty() {
        return getValue() == 2;
    }

    public final boolean isException() {
        return getValue() == 1;
    }
}
