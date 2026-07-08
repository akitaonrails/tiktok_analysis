package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_zoom_animation_guest_layout_opt")
public final class LiveHostGuestLayoutZoomOpt {
    public static final boolean DEFAULT = true;
    public static final LiveHostGuestLayoutZoomOpt INSTANCE = new LiveHostGuestLayoutZoomOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_zoom_animation_guest_layout_opt", DEFAULT);
    }
}
