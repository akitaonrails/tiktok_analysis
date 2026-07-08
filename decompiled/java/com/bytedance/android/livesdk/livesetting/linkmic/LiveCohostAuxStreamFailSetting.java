package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_aux_stream_fail")
public final class LiveCohostAuxStreamFailSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostAuxStreamFailSetting INSTANCE = new LiveCohostAuxStreamFailSetting();

    public static final boolean isEnable() {
        return INSTANCE.getValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_aux_stream_fail", DEFAULT);
    }
}
