package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_enable_surface_state_tracker")
public final class LinkMicEnableSurfaceStateTracker {
    public static final boolean DEFAULT = true;
    public static final LinkMicEnableSurfaceStateTracker INSTANCE = new LinkMicEnableSurfaceStateTracker();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_enable_surface_state_tracker", DEFAULT);
    }
}
