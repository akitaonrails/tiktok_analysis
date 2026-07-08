package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_items_sample_rate")
public final class LiveMessageItemsSampleRateSetting {
    public static final double DEFAULT = 0.0d;
    public static final LiveMessageItemsSampleRateSetting INSTANCE = new LiveMessageItemsSampleRateSetting();

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_message_items_sample_rate", DEFAULT);
    }
}
