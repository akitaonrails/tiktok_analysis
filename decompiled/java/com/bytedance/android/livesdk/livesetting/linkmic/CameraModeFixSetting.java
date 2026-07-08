package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("camera_mode_fix_setting")
public final class CameraModeFixSetting {
    public static final boolean DEFAULT = true;
    public static final CameraModeFixSetting INSTANCE = new CameraModeFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("camera_mode_fix_setting", DEFAULT);
    }
}
