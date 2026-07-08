package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_ranking_settlement_countdown_impl_setting")
public final class LiveRankingSettlementCountdownImplSetting {
    public static final LiveRankingSettlementCountdownImplSetting INSTANCE = new LiveRankingSettlementCountdownImplSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ranking_settlement_countdown_impl_setting", DEFAULT);
    }
}
