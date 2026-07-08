package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_fix_rtmp_error_code")
public final class LiveHostFixRtmpErrorCode {
    public static final boolean DEFAULT = true;
    public static final LiveHostFixRtmpErrorCode INSTANCE = new LiveHostFixRtmpErrorCode();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_fix_rtmp_error_code", DEFAULT);
    }
}
