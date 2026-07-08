package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = true, value = "anchor_global_props_cache")
public final class AnchorGlobalPropsCacheABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorGlobalPropsCacheABSetting INSTANCE = new AnchorGlobalPropsCacheABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_global_props_cache", DEFAULT) == 1;
    }
}
