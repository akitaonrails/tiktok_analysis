package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_capsule_message_window_focus_experiment")
public final class LiveCapsuleMessageWindowFocusExperiment {
    public static final LiveCapsuleMessageWindowFocusExperiment INSTANCE = new LiveCapsuleMessageWindowFocusExperiment();
    public static final boolean DEFAULT = true;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_capsule_message_window_focus_experiment", DEFAULT);

    public final boolean getEnable() {
        return enable;
    }
}
