package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_surface_view_reuse_setting")
public final class LiveCohostSurfaceViewReuseSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostSurfaceViewReuseSetting INSTANCE = new LiveCohostSurfaceViewReuseSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_surface_view_reuse_setting", DEFAULT);
    }

    public final boolean isDisable() {
        return !getValue();
    }

    public final boolean isEnable() {
        return getValue();
    }
}
