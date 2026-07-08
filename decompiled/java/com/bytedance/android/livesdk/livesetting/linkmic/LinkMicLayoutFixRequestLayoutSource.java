package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "layout_fix_request_layout_source")
public final class LinkMicLayoutFixRequestLayoutSource {
    public static final boolean DEFAULT = true;
    public static final LinkMicLayoutFixRequestLayoutSource INSTANCE = new LinkMicLayoutFixRequestLayoutSource();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_fix_request_layout_source", DEFAULT);
    }
}
