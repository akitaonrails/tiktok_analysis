package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_big_card_optimus")
public final class LiveShortTouchBigCardOptSetting {
    public static final LiveShortTouchBigCardOptSetting INSTANCE = new LiveShortTouchBigCardOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_short_touch_big_card_optimus", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
