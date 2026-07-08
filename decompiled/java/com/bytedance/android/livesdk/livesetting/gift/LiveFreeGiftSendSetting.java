package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_free_gift_send")
public final class LiveFreeGiftSendSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFreeGiftSendSetting INSTANCE = new LiveFreeGiftSendSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_free_gift_send", DEFAULT);
    }
}
