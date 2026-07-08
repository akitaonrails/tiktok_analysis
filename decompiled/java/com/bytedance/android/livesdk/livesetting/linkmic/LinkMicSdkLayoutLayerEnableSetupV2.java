package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_layout_layer_setup_v2")
public final class LinkMicSdkLayoutLayerEnableSetupV2 {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkLayoutLayerEnableSetupV2 INSTANCE = new LinkMicSdkLayoutLayerEnableSetupV2();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_layout_layer_setup_v2", DEFAULT);
    }

    public final boolean isEnable() {
        return LinkMicSdkCohostNewLayoutLayerAdapt.INSTANCE.getValue() && getValue();
    }
}
