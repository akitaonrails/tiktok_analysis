package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_opt_out_new_rule_experiment")
public final class RankingOptOutNewRuleExperimentSetting {
    public static final RankingOptOutNewRuleExperimentSetting INSTANCE = new RankingOptOutNewRuleExperimentSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ranking_opt_out_new_rule_experiment", DEFAULT);
    }
}
