package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_zoom_v2_zoom_map")
public final class LinkMicFixZoomV2ZoomMap {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixZoomV2ZoomMap INSTANCE = new LinkMicFixZoomV2ZoomMap();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_zoom_v2_zoom_map", DEFAULT);
    }
}
