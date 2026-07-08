package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_capsule_style_viewer_enabled")
public final class LiveCapsuleStyleViewerEnabledSetting {
    public static final LiveCapsuleStyleViewerEnabledSetting INSTANCE = new LiveCapsuleStyleViewerEnabledSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_capsule_style_viewer_enabled", DEFAULT);
    }
}
