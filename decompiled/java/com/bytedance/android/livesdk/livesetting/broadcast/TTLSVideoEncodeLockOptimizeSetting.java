package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_video_encode_lock_optimize")
public final class TTLSVideoEncodeLockOptimizeSetting {
    public static final int DEFAULT = 0;
    public static final TTLSVideoEncodeLockOptimizeSetting INSTANCE = new TTLSVideoEncodeLockOptimizeSetting();

    public final boolean enableVideoEncodeLockOptimize() {
        return SettingsManager.INSTANCE.getIntValue("ttls_video_encode_lock_optimize", DEFAULT) == 1;
    }
}
