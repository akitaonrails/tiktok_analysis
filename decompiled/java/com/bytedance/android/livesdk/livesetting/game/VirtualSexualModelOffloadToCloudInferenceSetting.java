package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "virtual_sexual_model_offload_to_cloud_inference")
public final class VirtualSexualModelOffloadToCloudInferenceSetting {
    public static final boolean DEFAULT = false;
    public static final VirtualSexualModelOffloadToCloudInferenceSetting INSTANCE = new VirtualSexualModelOffloadToCloudInferenceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("virtual_sexual_model_offload_to_cloud_inference", DEFAULT);
    }
}
