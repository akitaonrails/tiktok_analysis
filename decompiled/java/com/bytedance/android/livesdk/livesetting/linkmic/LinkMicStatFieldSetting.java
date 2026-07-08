package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_tracker_new_field")
public final class LinkMicStatFieldSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicStatFieldSetting INSTANCE = new LinkMicStatFieldSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_tracker_new_field", DEFAULT);
    }
}
