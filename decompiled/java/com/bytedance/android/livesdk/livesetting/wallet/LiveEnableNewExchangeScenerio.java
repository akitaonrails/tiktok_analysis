package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_enable_new_exchange_scenarios")
public final class LiveEnableNewExchangeScenerio {
    public static final boolean DEFAULT = false;
    public static final LiveEnableNewExchangeScenerio INSTANCE = new LiveEnableNewExchangeScenerio();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_enable_new_exchange_scenarios", DEFAULT);
    }
}
