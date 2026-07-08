package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_exchange_cancel_limit")
public final class LiveExchangeCancelLimit {
    public static final int DEFAULT = 2;
    public static final LiveExchangeCancelLimit INSTANCE = new LiveExchangeCancelLimit();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_wallet_exchange_cancel_limit", DEFAULT);
    }
}
