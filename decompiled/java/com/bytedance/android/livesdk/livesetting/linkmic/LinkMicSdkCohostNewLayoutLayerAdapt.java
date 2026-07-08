package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_enable_cross_room_new_layout")
public final class LinkMicSdkCohostNewLayoutLayerAdapt {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkCohostNewLayoutLayerAdapt INSTANCE = new LinkMicSdkCohostNewLayoutLayerAdapt();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_enable_cross_room_new_layout", DEFAULT);
    }
}
