package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_ranking_integration_fix_setting")
public final class LiveCreatorRankingEntranceIntegrationFixSetting {
    public static final LiveCreatorRankingEntranceIntegrationFixSetting INSTANCE = new LiveCreatorRankingEntranceIntegrationFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_creator_ranking_integration_fix_setting", DEFAULT);
    }
}
