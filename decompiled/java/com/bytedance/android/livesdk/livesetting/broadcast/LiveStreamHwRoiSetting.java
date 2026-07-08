package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_stream_hw_roi")
public final class LiveStreamHwRoiSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamHwRoiSetting INSTANCE = new LiveStreamHwRoiSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_hw_roi", DEFAULT);
    }
}
