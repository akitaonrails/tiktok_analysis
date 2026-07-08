package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_force_render_view_layout_count")
public final class LinkMicForceRenderViewLayoutCount {
    public static final int DEFAULT = 10;
    public static final LinkMicForceRenderViewLayoutCount INSTANCE = new LinkMicForceRenderViewLayoutCount();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("livesdk_linkmic_force_render_view_layout_count", DEFAULT);
    }
}
