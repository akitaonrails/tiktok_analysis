package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_create_channel_retry_setting")
public final class CohostCreateChannelRetrySetting {
    public static final boolean DEFAULT = false;
    public static final CohostCreateChannelRetrySetting INSTANCE = new CohostCreateChannelRetrySetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_create_channel_retry_setting", DEFAULT);
    }
}
