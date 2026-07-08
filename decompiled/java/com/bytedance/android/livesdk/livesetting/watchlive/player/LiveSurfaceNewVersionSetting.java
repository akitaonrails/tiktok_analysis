package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_surface_new_version_setting")
public final class LiveSurfaceNewVersionSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSurfaceNewVersionSetting INSTANCE = new LiveSurfaceNewVersionSetting();
    public static final boolean ENABLE = true;

    public final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_surface_new_version_setting", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getENABLE() {
        return ENABLE;
    }
}
