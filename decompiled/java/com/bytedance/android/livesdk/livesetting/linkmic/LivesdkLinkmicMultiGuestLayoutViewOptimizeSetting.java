package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_multi_guest_layout_view_optimize")
public final class LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting INSTANCE = new LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_multi_guest_layout_view_optimize", DEFAULT);
    }
}
