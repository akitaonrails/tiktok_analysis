package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "mix_stream_server_control_param")
public final class MixStreamServerControlParamSetting {
    public static final MixStreamServerControlParamSetting INSTANCE = new MixStreamServerControlParamSetting();
    public static final VolumeMixStreamConfig DEFAULT = new VolumeMixStreamConfig(0.5f, true, 25, true, 1);

    public final VolumeMixStreamConfig getValue() {
        return (VolumeMixStreamConfig) SettingsManager.INSTANCE.getValueSafely("mix_stream_server_control_param", DEFAULT);
    }
}
