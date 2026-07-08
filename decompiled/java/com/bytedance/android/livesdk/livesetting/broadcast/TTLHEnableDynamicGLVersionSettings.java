package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_enable_dynamic_gl_version")
public final class TTLHEnableDynamicGLVersionSettings {
    public static final int DEFAULT = 0;
    public static final TTLHEnableDynamicGLVersionSettings INSTANCE = new TTLHEnableDynamicGLVersionSettings();

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_dynamic_gl_version", DEFAULT) == 1;
    }
}
