package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_real_time_config")
public final class LiveGiftRealTimeApiSettings {
    public static final LiveGiftRealTimeApiSettings INSTANCE = new LiveGiftRealTimeApiSettings();
    public static final LiveGiftRealTimeTimeoutParams DEFAULT = new LiveGiftRealTimeTimeoutParams(false, 30, 1000, 3, 60);

    private final LiveGiftRealTimeTimeoutParams getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGiftRealTimeTimeoutParams liveGiftRealTimeTimeoutParams = DEFAULT;
        LiveGiftRealTimeTimeoutParams liveGiftRealTimeTimeoutParams2 = (LiveGiftRealTimeTimeoutParams) settingsManager.getValueSafely("live_gift_real_time_config", liveGiftRealTimeTimeoutParams);
        return liveGiftRealTimeTimeoutParams2 != null ? liveGiftRealTimeTimeoutParams2 : liveGiftRealTimeTimeoutParams;
    }

    public final long blockAfterSendSec() {
        return getValue().blockAfterSendSec;
    }

    public final boolean enableRealTimeApiRequest() {
        return getValue().realTimeRequestEnabled;
    }

    public final long realTimeUpdateTimeoutMs() {
        return getValue().realTimeUpdateTimeout;
    }

    public final long reasonBlockDays() {
        return getValue().reasonBlockDays;
    }

    public final long reasonMaxShowCounts() {
        return getValue().reasonMaxShowCounts;
    }

    public final LiveGiftRealTimeTimeoutParams getDEFAULT() {
        return DEFAULT;
    }
}
