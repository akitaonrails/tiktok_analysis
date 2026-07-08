package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_high_traffic_output_message_delay_interval")
public final class GiftHighTrafficOutputMessageDelaySetting {
    public static final long DEFAULT = 0;
    public static final GiftHighTrafficOutputMessageDelaySetting INSTANCE = new GiftHighTrafficOutputMessageDelaySetting();

    public final long getDelayInterval() {
        return SettingsManager.INSTANCE.getLongValue("gift_high_traffic_output_message_delay_interval", DEFAULT);
    }

    public final boolean enable() {
        return getDelayInterval() > 0;
    }
}
