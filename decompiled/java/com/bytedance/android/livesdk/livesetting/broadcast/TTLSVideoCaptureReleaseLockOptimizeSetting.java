package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_video_capture_release_lock_optimize")
public final class TTLSVideoCaptureReleaseLockOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final TTLSVideoCaptureReleaseLockOptimizeSetting INSTANCE = new TTLSVideoCaptureReleaseLockOptimizeSetting();

    public final boolean enableVideoCaptureReleaseLockOptimize() {
        return SettingsManager.INSTANCE.getIntValue("ttls_video_capture_release_lock_optimize", DEFAULT) == 1;
    }
}
