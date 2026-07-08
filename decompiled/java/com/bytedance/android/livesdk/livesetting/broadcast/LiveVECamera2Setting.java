package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ve_camera2_setting")
public final class LiveVECamera2Setting {
    public static final boolean DEFAULT = true;
    public static final LiveVECamera2Setting INSTANCE = new LiveVECamera2Setting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_ve_camera2_setting", DEFAULT);
    }
}
