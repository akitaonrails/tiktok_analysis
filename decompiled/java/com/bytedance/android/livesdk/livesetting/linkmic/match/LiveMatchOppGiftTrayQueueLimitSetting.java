package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_multi_match_opposite_gift_tray_queue_limit")
public final class LiveMatchOppGiftTrayQueueLimitSetting {
    public static final int DEFAULT = 0;
    public static final LiveMatchOppGiftTrayQueueLimitSetting INSTANCE = new LiveMatchOppGiftTrayQueueLimitSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_multi_match_opposite_gift_tray_queue_limit", DEFAULT);
    }
}
