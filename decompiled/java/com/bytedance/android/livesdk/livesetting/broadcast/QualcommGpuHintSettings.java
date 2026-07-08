package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.EnumC1083230eIL;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("webcast_broadcast_qualcomm_gpu_hint_opt")
public final class QualcommGpuHintSettings {
    public static final QualcommGpuHintSettings INSTANCE = new QualcommGpuHintSettings();
    public static final GpuHintSettings DEFAULT = new GpuHintSettings(false, 0, 0);

    public final int getTime() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GpuHintSettings gpuHintSettings = DEFAULT;
        GpuHintSettings gpuHintSettings2 = (GpuHintSettings) settingsManager.getValueSafely("webcast_broadcast_qualcomm_gpu_hint_opt", gpuHintSettings);
        if (gpuHintSettings2 != null) {
            gpuHintSettings = gpuHintSettings2;
        }
        return gpuHintSettings.gpuHintDuration;
    }

    public final EnumC1083230eIL getType() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GpuHintSettings gpuHintSettings = DEFAULT;
        GpuHintSettings gpuHintSettings2 = (GpuHintSettings) settingsManager.getValueSafely("webcast_broadcast_qualcomm_gpu_hint_opt", gpuHintSettings);
        if (gpuHintSettings2 != null) {
            gpuHintSettings = gpuHintSettings2;
        }
        int i = gpuHintSettings.gpuHintType;
        return i != -1 ? i != 1 ? i != 2 ? EnumC1083230eIL.DEFAULT : EnumC1083230eIL.HIGH : EnumC1083230eIL.LOW : EnumC1083230eIL.DISABLE;
    }

    public final boolean isEnable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GpuHintSettings gpuHintSettings = DEFAULT;
        GpuHintSettings gpuHintSettings2 = (GpuHintSettings) settingsManager.getValueSafely("webcast_broadcast_qualcomm_gpu_hint_opt", gpuHintSettings);
        if (gpuHintSettings2 != null) {
            gpuHintSettings = gpuHintSettings2;
        }
        return gpuHintSettings.enable;
    }

    public static final class GpuHintSettings {
        public static final TypeAdapter ADAPTER = new QualcommGpuHintSettings_GpuHintSettings_OptTypeAdapter(NormalGson.singleton());

        @C09CT("webcast_broadcast_qualcomm_gpu_hint_enable")
        public boolean enable;

        @C09CT("webcast_broadcast_qualcomm_gpu_hint_duration")
        public int gpuHintDuration;

        @C09CT("webcast_broadcast_qualcomm_gpu_hint_type")
        public int gpuHintType;

        public GpuHintSettings() {
            this(false, 0, 0);
        }

        public GpuHintSettings(boolean z, int i, int i2) {
            this.enable = z;
            this.gpuHintType = i;
            this.gpuHintDuration = i2;
        }
    }
}
