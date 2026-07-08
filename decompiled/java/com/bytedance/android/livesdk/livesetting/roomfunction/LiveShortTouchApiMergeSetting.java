package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_short_touch_api_merge")
public final class LiveShortTouchApiMergeSetting {
    public static final LiveShortTouchApiMergeSetting INSTANCE = new LiveShortTouchApiMergeSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_short_touch_api_merge", DEFAULT);

    public final boolean enable() {
        int i = value;
        return i == 1 || i == 2;
    }

    public final boolean enableRequestWhenEnterSuccess() {
        return value == 1;
    }

    public final boolean enableRequestWhenWidgetLoad() {
        return value == 2;
    }
}
