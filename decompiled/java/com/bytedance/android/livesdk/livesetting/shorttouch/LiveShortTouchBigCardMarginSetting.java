package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_big_card_margin")
public final class LiveShortTouchBigCardMarginSetting {
    public static final LiveShortTouchBigCardMarginSetting INSTANCE = new LiveShortTouchBigCardMarginSetting();
    public static final int DEFAULT = 32;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_short_touch_big_card_margin", 32);

    public final int marginDp() {
        return value;
    }
}
