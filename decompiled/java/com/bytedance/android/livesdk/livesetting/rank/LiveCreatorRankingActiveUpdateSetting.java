package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_ranking_active_update_setting")
public final class LiveCreatorRankingActiveUpdateSetting {
    public static final LiveCreatorRankingActiveUpdateSetting INSTANCE = new LiveCreatorRankingActiveUpdateSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_ranking_active_update_setting", DEFAULT);
    }
}
