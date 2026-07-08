package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_guide_recharged_show_duration")
public final class LiveRechargeGiftGuideDisplayDuration {
    public static final int DEFAULT = 30;
    public static final LiveRechargeGiftGuideDisplayDuration INSTANCE = new LiveRechargeGiftGuideDisplayDuration();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_guide_recharged_show_duration", DEFAULT);
    }
}
