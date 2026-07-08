package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_degradation264_strategy")
public final class LiveGiftDegradation264ResourceSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftDegradation264ResourceSetting INSTANCE = new LiveGiftDegradation264ResourceSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("gift_degradation264_strategy", DEFAULT);
    }

    public static final boolean enableOsPlayerForAudience() {
        return getValue() == 2;
    }

    public final boolean enableDegradation264() {
        return getValue() != 0;
    }
}
