package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_fix_camera_turn_on")
public final class LinkMicFixCameraTurnOn {
    public static final LinkMicFixCameraTurnOn INSTANCE = new LinkMicFixCameraTurnOn();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_fix_camera_turn_on", DEFAULT);
    }
}
