package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_animate_setting")
public final class LiveShortTouchAnimateSetting {
    public static final LiveShortTouchAnimateSetting INSTANCE = new LiveShortTouchAnimateSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_short_touch_animate_setting", DEFAULT);

    public final int value() {
        return value;
    }
}
