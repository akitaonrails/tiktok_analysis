package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_anchor_rank_team_ui_adapt")
public final class LivePopularityRankingNewUISetting {
    public static final boolean DEFAULT = false;
    public static final LivePopularityRankingNewUISetting INSTANCE = new LivePopularityRankingNewUISetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_anchor_rank_team_ui_adapt", DEFAULT);
    }
}
