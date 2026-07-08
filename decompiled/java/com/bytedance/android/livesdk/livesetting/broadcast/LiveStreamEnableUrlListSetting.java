package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_stream_enable_url_list")
public final class LiveStreamEnableUrlListSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamEnableUrlListSetting INSTANCE = new LiveStreamEnableUrlListSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_enable_url_list", DEFAULT);
    }
}
