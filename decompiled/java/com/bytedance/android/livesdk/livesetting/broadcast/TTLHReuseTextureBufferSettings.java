package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_reuse_texture_buffer")
public final class TTLHReuseTextureBufferSettings {
    public static final boolean DEFAULT = false;
    public static final TTLHReuseTextureBufferSettings INSTANCE = new TTLHReuseTextureBufferSettings();

    public final boolean value() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlh_reuse_texture_buffer", DEFAULT);
    }
}
