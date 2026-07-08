package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_co_host_create_channel_retry")
public final class LinkmicCoHostCreateChannelRetrySetting {
    public static final long DEFAULT = 5;
    public static final LinkmicCoHostCreateChannelRetrySetting INSTANCE = new LinkmicCoHostCreateChannelRetrySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("linkmic_co_host_create_channel_retry", DEFAULT);
    }
}
