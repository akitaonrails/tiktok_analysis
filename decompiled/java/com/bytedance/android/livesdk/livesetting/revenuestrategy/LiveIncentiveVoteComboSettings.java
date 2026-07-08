package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_incentive_vote_combo_config")
public final class LiveIncentiveVoteComboSettings {
    public static final LiveIncentiveVoteComboSettings INSTANCE = new LiveIncentiveVoteComboSettings();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_incentive_vote_combo_config", DEFAULT);
    }
}
