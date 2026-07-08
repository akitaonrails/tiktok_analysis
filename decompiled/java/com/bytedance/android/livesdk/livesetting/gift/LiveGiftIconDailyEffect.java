package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_icon_daily_animation_enable")
public final class LiveGiftIconDailyEffect {
    public static final boolean DEFAULT = true;
    public static final LiveGiftIconDailyEffect INSTANCE = new LiveGiftIconDailyEffect();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_icon_daily_animation_enable", DEFAULT);
    }
}
