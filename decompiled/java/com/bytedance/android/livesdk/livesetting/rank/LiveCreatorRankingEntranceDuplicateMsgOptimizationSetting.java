package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_creator_ranking_entrance_duplicate_msg_optimization_setting")
public final class LiveCreatorRankingEntranceDuplicateMsgOptimizationSetting {
    public static final LiveCreatorRankingEntranceDuplicateMsgOptimizationSetting INSTANCE = new LiveCreatorRankingEntranceDuplicateMsgOptimizationSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_ranking_entrance_duplicate_msg_optimization_setting", DEFAULT);
    }
}
