package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ranking_bottom_bar_content_fix_setting")
public final class LiveRankingBottomBarContentFix {
    public static final LiveRankingBottomBarContentFix INSTANCE = new LiveRankingBottomBarContentFix();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ranking_bottom_bar_content_fix_setting", DEFAULT);
    }
}
