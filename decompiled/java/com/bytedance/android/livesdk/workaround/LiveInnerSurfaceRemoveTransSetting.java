package com.bytedance.android.livesdk.workaround;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_surfaceview_remove_trans")
public final class LiveInnerSurfaceRemoveTransSetting {
    public static final boolean DEFAULT = false;
    public static final LiveInnerSurfaceRemoveTransSetting INSTANCE = new LiveInnerSurfaceRemoveTransSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_surfaceview_remove_trans", DEFAULT);
    }
}
