package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_resolution_demand_preserve_baseline_on_disabled_layout")
public final class LinkMicResolutionDemandPreserveBaselineOnDisabledLayout {
    public static final boolean DEFAULT = true;
    public static final LinkMicResolutionDemandPreserveBaselineOnDisabledLayout INSTANCE = new LinkMicResolutionDemandPreserveBaselineOnDisabledLayout();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_resolution_demand_preserve_baseline_on_disabled_layout", DEFAULT);
    }
}
