package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_release_inner_surface_async_exp")
public final class LiveReleaseInnerSurfaceAsyncExp {
    public static final boolean DEFAULT = false;
    public static final LiveReleaseInnerSurfaceAsyncExp INSTANCE = new LiveReleaseInnerSurfaceAsyncExp();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_release_inner_surface_async_exp", DEFAULT);
    }
}
