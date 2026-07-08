package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_opt_out_new_rule")
public final class RankingOptOutNewRuleSetting {
    public static final boolean DEFAULT = false;
    public static final RankingOptOutNewRuleSetting INSTANCE = new RankingOptOutNewRuleSetting();

    public final boolean getValue(boolean z) {
        if (z && SettingsManager.INSTANCE.getBooleanValue("live_ranking_opt_out_new_rule", DEFAULT) && RankingOptOutNewRuleExperimentSetting.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }
}
