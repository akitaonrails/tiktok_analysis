package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_creator_ranking_banner_fix_setting")
public final class LiveCreatorRankingBannerFixSetting {
    public static final LiveCreatorRankingBannerFixSetting INSTANCE = new LiveCreatorRankingBannerFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_ranking_banner_fix_setting", DEFAULT);
    }
}
