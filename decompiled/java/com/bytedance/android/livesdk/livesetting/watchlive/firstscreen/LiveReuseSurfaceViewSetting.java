package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_reuse_surface_view")
public final class LiveReuseSurfaceViewSetting {
    public static final boolean DEFAULT = false;
    public static final LiveReuseSurfaceViewSetting INSTANCE = new LiveReuseSurfaceViewSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_reuse_surface_view", DEFAULT);
    }
}
