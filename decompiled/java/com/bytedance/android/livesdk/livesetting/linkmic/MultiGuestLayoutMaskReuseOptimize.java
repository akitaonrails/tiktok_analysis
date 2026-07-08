package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multiguest_layout_mask_reuse_optimize_enabled")
public final class MultiGuestLayoutMaskReuseOptimize {
    public static final boolean DEFAULT = true;
    public static final MultiGuestLayoutMaskReuseOptimize INSTANCE = new MultiGuestLayoutMaskReuseOptimize();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_layout_mask_reuse_optimize_enabled", DEFAULT);
    }
}
