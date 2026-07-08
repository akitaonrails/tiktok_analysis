package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "virtual_sexual_model_offload_opt")
public final class VirtualSexualModelOffloadOptSetting {
    public static final boolean DEFAULT = false;
    public static final VirtualSexualModelOffloadOptSetting INSTANCE = new VirtualSexualModelOffloadOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("virtual_sexual_model_offload_opt", DEFAULT);
    }
}
