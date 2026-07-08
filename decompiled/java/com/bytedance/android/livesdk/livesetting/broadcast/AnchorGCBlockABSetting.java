package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_gc_block")
public final class AnchorGCBlockABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorGCBlockABSetting INSTANCE = new AnchorGCBlockABSetting();

    public final boolean isV1() {
        return SettingsManager.INSTANCE.getIntValue("anchor_gc_block", DEFAULT) == 1;
    }

    public final boolean isV2() {
        return SettingsManager.INSTANCE.getIntValue("anchor_gc_block", DEFAULT) == 2;
    }

    public final boolean isV3() {
        return SettingsManager.INSTANCE.getIntValue("anchor_gc_block", DEFAULT) == 3;
    }

    public final boolean enable() {
        return isV1() || isV2() || isV3();
    }
}
