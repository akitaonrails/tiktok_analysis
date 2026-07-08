package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_api_request_time")
public final class LiveShortTouchApiRequestTimeSetting {
    public static final LiveShortTouchApiRequestTimeSetting INSTANCE = new LiveShortTouchApiRequestTimeSetting();
    public static final int DEFAULT = 1;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_short_touch_api_request_time", 1);

    public final boolean enableRequestWhenEnterSuccess() {
        return value == 1;
    }

    public final boolean enableRequestWhenWidgetLoad() {
        return value == 2;
    }
}
