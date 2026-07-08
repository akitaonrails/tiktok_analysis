package com.bytedance.android.livesdk.broadcast.video;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "fix_green_screen_resume")
public final class FixGreenScreenResumeSetting {
    public static final boolean DEFAULT = false;
    public static final FixGreenScreenResumeSetting INSTANCE = new FixGreenScreenResumeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("fix_green_screen_resume", DEFAULT);
    }
}
