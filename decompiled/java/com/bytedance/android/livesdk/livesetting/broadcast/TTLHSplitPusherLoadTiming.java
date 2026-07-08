package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_split_pusher_load_timing")
public final class TTLHSplitPusherLoadTiming {
    public static final int DEFAULT = 0;
    public static final TTLHSplitPusherLoadTiming INSTANCE = new TTLHSplitPusherLoadTiming();

    public final int pusherLoadTime() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_split_pusher_load_timing", DEFAULT);
    }
}
