package com.bytedance.android.livesdk.livesetting.shorttouch;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_big_card_optimus_treasure_box")
public final class LiveShortTouchBigCardTreasureBoxSetting {
    public static final LiveShortTouchBigCardTreasureBoxSetting INSTANCE = new LiveShortTouchBigCardTreasureBoxSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_short_touch_big_card_optimus_treasure_box", true);

    public final boolean enable() {
        return value;
    }
}
