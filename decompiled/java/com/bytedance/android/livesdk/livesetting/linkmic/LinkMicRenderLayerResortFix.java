package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_render_layer_resort_fix")
public final class LinkMicRenderLayerResortFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicRenderLayerResortFix INSTANCE = new LinkMicRenderLayerResortFix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_render_layer_resort_fix", DEFAULT);
    }
}
