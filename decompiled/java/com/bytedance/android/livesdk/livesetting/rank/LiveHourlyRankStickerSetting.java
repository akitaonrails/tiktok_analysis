package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_hourly_rank_sticker")
public final class LiveHourlyRankStickerSetting {
    public static final int DEFAULT = 0;
    public static final LiveHourlyRankStickerSetting INSTANCE = new LiveHourlyRankStickerSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_hourly_rank_sticker", DEFAULT);
    }
}
