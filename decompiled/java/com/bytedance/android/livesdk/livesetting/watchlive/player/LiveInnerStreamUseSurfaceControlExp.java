package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_inner_stream_use_surface_control_exp")
public final class LiveInnerStreamUseSurfaceControlExp {
    public static final boolean DEFAULT = false;
    public static final LiveInnerStreamUseSurfaceControlExp INSTANCE = new LiveInnerStreamUseSurfaceControlExp();

    public static final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_stream_use_surface_control_exp", DEFAULT);
    }

    public static final boolean disable() {
        return !getEnable();
    }
}
