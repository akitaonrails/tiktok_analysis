package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_ranking_downgrade_service_setting")
public final class LiveCreatorRankingDowngradeServiceSetting {
    public static final LiveCreatorRankingDowngradeServiceSetting INSTANCE = new LiveCreatorRankingDowngradeServiceSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_ranking_downgrade_service_setting", DEFAULT);
    }
}
