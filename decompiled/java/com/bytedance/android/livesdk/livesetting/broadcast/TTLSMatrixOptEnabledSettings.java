package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_matrix_opt")
public final class TTLSMatrixOptEnabledSettings {
    public static final boolean DEFAULT = false;
    public static final TTLSMatrixOptEnabledSettings INSTANCE = new TTLSMatrixOptEnabledSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlivestreamer_matrix_opt", DEFAULT);
    }
}
