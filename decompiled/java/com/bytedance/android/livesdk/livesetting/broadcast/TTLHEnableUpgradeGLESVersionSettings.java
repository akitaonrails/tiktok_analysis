package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_upgrade_gles_version")
public final class TTLHEnableUpgradeGLESVersionSettings {
    public static final int DEFAULT = 0;
    public static final TTLHEnableUpgradeGLESVersionSettings INSTANCE = new TTLHEnableUpgradeGLESVersionSettings();

    public final boolean value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_upgrade_gles_version", DEFAULT) == 1;
    }
}
