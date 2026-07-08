package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_exclusive_tab")
public final class LiveGiftRankingExclusiveTabSetting {
    public static final LiveGiftRankingExclusiveTabSetting INSTANCE = new LiveGiftRankingExclusiveTabSetting();
    public static final RankingExclusiveTabParams DEFAULT = new RankingExclusiveTabParams(true, 3, 3, 3);

    private final RankingExclusiveTabParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RankingExclusiveTabParams rankingExclusiveTabParams = DEFAULT;
        RankingExclusiveTabParams rankingExclusiveTabParams2 = (RankingExclusiveTabParams) settingsManager.getValueSafely("live_ranking_exclusive_tab", rankingExclusiveTabParams);
        return rankingExclusiveTabParams2 != null ? rankingExclusiveTabParams2 : rankingExclusiveTabParams;
    }

    public static final boolean isEnabled() {
        return INSTANCE.getSettingParams().enabled;
    }

    public final long getBannerTransitionDelay() {
        return getSettingParams().bannerTransitionDelay;
    }

    public final long getMaxAnimEntryCount() {
        return getSettingParams().maxAnimEntryCount;
    }

    public final long getToastDisplayDuration() {
        return getSettingParams().toastDisplayDuration;
    }

    public final RankingExclusiveTabParams getDEFAULT() {
        return DEFAULT;
    }
}
