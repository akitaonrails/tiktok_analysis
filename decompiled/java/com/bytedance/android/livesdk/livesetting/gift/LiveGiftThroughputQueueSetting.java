package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_receiving_throughput_metrics")
public final class LiveGiftThroughputQueueSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveGiftThroughputQueueSetting INSTANCE = new LiveGiftThroughputQueueSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_receiving_throughput_metrics", DEFAULT);
    }
}
