package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_big_card_optimus_time")
public final class LiveShortTouchBigCardOptTimeSetting {
    public static final LiveShortTouchBigCardOptTimeSetting INSTANCE = new LiveShortTouchBigCardOptTimeSetting();
    public static final long DEFAULT = 300;
    public static final long value = SettingsManager.INSTANCE.getLongValue("live_short_touch_big_card_optimus_time", 300);

    public final long duration() {
        return value;
    }
}
