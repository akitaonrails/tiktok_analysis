package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_guide_recharged_max_show_times")
public final class LiveRechargeGiftGuideShowTimes {
    public static final int DEFAULT = 2;
    public static final LiveRechargeGiftGuideShowTimes INSTANCE = new LiveRechargeGiftGuideShowTimes();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_guide_recharged_max_show_times", DEFAULT);
    }
}
