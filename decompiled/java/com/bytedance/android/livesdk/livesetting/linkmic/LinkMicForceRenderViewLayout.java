package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_force_render_view_layout")
public final class LinkMicForceRenderViewLayout {
    public static final boolean DEFAULT = true;
    public static final LinkMicForceRenderViewLayout INSTANCE = new LinkMicForceRenderViewLayout();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_force_render_view_layout", DEFAULT);
    }
}
