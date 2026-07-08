package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_exchange_confirm_threshold")
public final class LiveExchangeConfirmThreshold {
    public static final int DEFAULT = 50000;
    public static final LiveExchangeConfirmThreshold INSTANCE = new LiveExchangeConfirmThreshold();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_exchange_confirm_threshold", DEFAULT);
    }
}
