package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_stream_enable_sdk_params")
public final class LiveStreamEnableSdkParamsSetting {
    public static final boolean DEFAULT = false;
    public static final LiveStreamEnableSdkParamsSetting INSTANCE = new LiveStreamEnableSdkParamsSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_enable_sdk_params", DEFAULT);
    }
}
