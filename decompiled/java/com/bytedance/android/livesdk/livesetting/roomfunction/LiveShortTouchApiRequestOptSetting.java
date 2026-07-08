package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_api_request_opt")
public final class LiveShortTouchApiRequestOptSetting {
    public static final LiveShortTouchApiRequestOptSetting INSTANCE = new LiveShortTouchApiRequestOptSetting();
    public static final int DEFAULT = 1;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_short_touch_api_request_opt", 1);

    public final boolean enable() {
        return value == 1;
    }
}
