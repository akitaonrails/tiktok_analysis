package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_hardware_decode")
public final class LiveGiftHardwareDecodeSetting {
    public static final int DEFAULT = 0;
    public static final LiveGiftHardwareDecodeSetting INSTANCE = new LiveGiftHardwareDecodeSetting();
    public static final int OS_PLAYER = 2;
    public static final int TTPLAYER_HARD_DECODE = 1;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("gift_hardware_decode", DEFAULT);
    }

    public static final boolean enableOsPlayer() {
        return getValue() == 2;
    }
}
