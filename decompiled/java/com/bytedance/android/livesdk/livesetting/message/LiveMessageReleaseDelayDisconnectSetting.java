package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_im_ws_delay_disconnect_interval")
public final class LiveMessageReleaseDelayDisconnectSetting {
    public static final LiveMessageReleaseDelayDisconnectSetting INSTANCE = new LiveMessageReleaseDelayDisconnectSetting();
    public static final long DEFAULT = 30000;

    public final long releaseDelayDisconnectTime() {
        return SettingsManager.INSTANCE.getLongValue("live_im_ws_delay_disconnect_interval", DEFAULT);
    }
}
