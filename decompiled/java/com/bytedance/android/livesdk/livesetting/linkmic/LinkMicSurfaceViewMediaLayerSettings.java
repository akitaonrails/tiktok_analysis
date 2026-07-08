package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_surface_view_media_layer_setting")
public final class LinkMicSurfaceViewMediaLayerSettings {
    public static final boolean DEFAULT = true;
    public static final LinkMicSurfaceViewMediaLayerSettings INSTANCE = new LinkMicSurfaceViewMediaLayerSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_surface_view_media_layer_setting", DEFAULT);
    }
}
