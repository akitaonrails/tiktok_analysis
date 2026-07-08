package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ranking_bottom_bar_red_dot_overlap_fix")
public final class LiveRankingBottomBarRedDotOverlapFix {
    public static final LiveRankingBottomBarRedDotOverlapFix INSTANCE = new LiveRankingBottomBarRedDotOverlapFix();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ranking_bottom_bar_red_dot_overlap_fix", DEFAULT);
    }
}
