package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_ranking_banner_countdown_setting")
public final class LiveCreatorRankingBannerCountdownSetting {
    public static final LiveCreatorRankingBannerCountdownSetting INSTANCE = new LiveCreatorRankingBannerCountdownSetting();
    public static final long DEFAULT = 172800;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_creator_ranking_banner_countdown_setting", DEFAULT);
    }
}
