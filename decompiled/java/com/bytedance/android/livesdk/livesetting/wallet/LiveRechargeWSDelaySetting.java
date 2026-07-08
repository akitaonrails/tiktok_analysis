package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_recharge_ws_delay")
public final class LiveRechargeWSDelaySetting {
    public static final int DEFAULT = 0;
    public static final LiveRechargeWSDelaySetting INSTANCE = new LiveRechargeWSDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_recharge_ws_delay", DEFAULT);
    }
}
