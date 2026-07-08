package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_live_stream_init")
public final class LiveHostLiveStreamInitSetting {
    public static final boolean DEFAULT = true;
    public static final LiveHostLiveStreamInitSetting INSTANCE = new LiveHostLiveStreamInitSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_live_stream_init", DEFAULT);
    }
}
