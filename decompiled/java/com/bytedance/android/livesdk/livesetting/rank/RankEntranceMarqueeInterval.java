package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_rank_entrance_marquee_interval")
public final class RankEntranceMarqueeInterval {
    public static final RankEntranceMarqueeInterval INSTANCE = new RankEntranceMarqueeInterval();
    public static final long DEFAULT = 20000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_rank_entrance_marquee_interval", DEFAULT);
    }
}
