package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_wallet_email_incentive_kill_switch")
public final class LiveEmailIncentiveKillSwitchSetting {
    public static final LiveEmailIncentiveKillSwitchSetting INSTANCE = new LiveEmailIncentiveKillSwitchSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_email_incentive_kill_switch", DEFAULT);
    }
}
