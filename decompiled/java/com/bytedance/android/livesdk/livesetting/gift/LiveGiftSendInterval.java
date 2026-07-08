package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_send_interval")
public final class LiveGiftSendInterval {
    public static final LiveGiftSendInterval INSTANCE = new LiveGiftSendInterval();
    public static final float DEFAULT = 0.5f;

    private final float getSettingValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_gift_send_interval", DEFAULT);
    }

    public final float getValue() {
        return getSettingValue();
    }
}
