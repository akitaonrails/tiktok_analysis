package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_stream_fix_resolution_override_enable")
public final class OverrideCaptureResolutionFixSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final OverrideCaptureResolutionFixSetting INSTANCE = new OverrideCaptureResolutionFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_fix_resolution_override_enable", DEFAULT);
    }
}
