package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_surface_view_layer_fix")
public final class LinkMicSdkSurfaceViewLayerFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkSurfaceViewLayerFix INSTANCE = new LinkMicSdkSurfaceViewLayerFix();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_surface_view_layer_fix", DEFAULT);
    }
}
