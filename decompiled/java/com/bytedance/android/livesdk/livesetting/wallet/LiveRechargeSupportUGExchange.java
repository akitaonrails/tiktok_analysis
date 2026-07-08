package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_recharge_support_ug_exchange")
public final class LiveRechargeSupportUGExchange {
    public static final boolean DEFAULT = true;
    public static final LiveRechargeSupportUGExchange INSTANCE = new LiveRechargeSupportUGExchange();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_recharge_support_ug_exchange", DEFAULT);
    }
}
