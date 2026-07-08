package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_live_stream")
public final class LiveCenterLiveStreamSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCenterLiveStreamSetting INSTANCE = new LiveCenterLiveStreamSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_center_live_stream", DEFAULT);
    }
}
