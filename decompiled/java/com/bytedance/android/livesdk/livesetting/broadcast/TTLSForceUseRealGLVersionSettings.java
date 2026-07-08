package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_force_use_real_gl_version")
public final class TTLSForceUseRealGLVersionSettings {
    public static final boolean DEFAULT = false;
    public static final TTLSForceUseRealGLVersionSettings INSTANCE = new TTLSForceUseRealGLVersionSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlivestreamer_force_use_real_gl_version", DEFAULT);
    }
}
