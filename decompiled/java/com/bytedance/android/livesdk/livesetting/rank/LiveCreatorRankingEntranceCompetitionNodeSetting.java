package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_creator_ranking_entrance_competition_node_setting")
public final class LiveCreatorRankingEntranceCompetitionNodeSetting {
    public static final LiveCreatorRankingEntranceCompetitionNodeSetting INSTANCE = new LiveCreatorRankingEntranceCompetitionNodeSetting();
    public static final boolean DEFAULT = false;
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue("live_creator_ranking_entrance_competition_node_setting", DEFAULT);

    public final boolean getValue() {
        return value;
    }

    public final void setValue(boolean z) {
        value = z;
    }
}
