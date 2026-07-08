package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_ranking_lop_fix_setting")
public final class LiveAudienceRankingLOPFixSetting {
    public static final LiveAudienceRankingLOPFixSetting INSTANCE = new LiveAudienceRankingLOPFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_audience_ranking_lop_fix_setting", DEFAULT);
    }
}
