package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_ranking_opt_out_fallback_setting")
public final class LiveAudienceRankingOptOutFallbackSetting {
    public static final LiveAudienceRankingOptOutFallbackSetting INSTANCE = new LiveAudienceRankingOptOutFallbackSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_audience_ranking_opt_out_fallback_setting", DEFAULT);
    }
}
