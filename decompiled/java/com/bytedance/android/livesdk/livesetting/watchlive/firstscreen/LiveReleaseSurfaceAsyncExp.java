package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_release_surface_async_exp")
public final class LiveReleaseSurfaceAsyncExp {
    public static final boolean DEFAULT = false;
    public static final LiveReleaseSurfaceAsyncExp INSTANCE = new LiveReleaseSurfaceAsyncExp();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_release_surface_async_exp", DEFAULT);
    }
}
