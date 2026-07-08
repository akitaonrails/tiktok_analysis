package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("enable_guide_gift_exchange")
public final class LiveGiftGuideExchange {
    public static final boolean DEFAULT = false;
    public static final LiveGiftGuideExchange INSTANCE = new LiveGiftGuideExchange();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_guide_gift_exchange", DEFAULT);
    }
}
