package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_hourly_rank_query_entrance_delay")
public final class LiveHourlyRankQueryEntranceDelaySetting {
    public static final int DEFAULT = 3000;
    public static final LiveHourlyRankQueryEntranceDelaySetting INSTANCE = new LiveHourlyRankQueryEntranceDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_hourly_rank_query_entrance_delay", DEFAULT);
    }
}
