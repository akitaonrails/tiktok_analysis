package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C480800ItK;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_fps_adapter_opt")
public final class AnchorFpsAdapterOptABSetting {
    public static final int DEFAULT = 0;
    public static final AnchorFpsAdapterOptABSetting INSTANCE = new AnchorFpsAdapterOptABSetting();

    private final boolean isLibOne() {
        return SettingsManager.INSTANCE.getIntValue("anchor_fps_adapter_opt", DEFAULT) == 1;
    }

    private final boolean isLibThree() {
        return SettingsManager.INSTANCE.getIntValue("anchor_fps_adapter_opt", DEFAULT) == 3;
    }

    private final boolean isLibTwo() {
        return SettingsManager.INSTANCE.getIntValue("anchor_fps_adapter_opt", DEFAULT) == 2;
    }

    public final boolean isEnable() {
        if (isLibOne() && C480800ItK.LIZ) {
            return true;
        }
        return (isLibTwo() && C480800ItK.LIZIZ) || isLibThree();
    }
}
