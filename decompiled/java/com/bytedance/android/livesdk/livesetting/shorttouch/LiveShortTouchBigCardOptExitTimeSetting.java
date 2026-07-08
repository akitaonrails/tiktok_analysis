package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_big_card_optimus_exit_time")
public final class LiveShortTouchBigCardOptExitTimeSetting {
    public static final LiveShortTouchBigCardOptExitTimeSetting INSTANCE = new LiveShortTouchBigCardOptExitTimeSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_short_touch_big_card_optimus_exit_time", DEFAULT);

    public final boolean showWhenStartExit() {
        return value == 0;
    }
}
