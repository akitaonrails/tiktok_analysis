package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_cohost_enable_independent_mix_stream_params")
public final class LiveCoHostEnableIndependentMixStreamParams {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostEnableIndependentMixStreamParams INSTANCE = new LiveCoHostEnableIndependentMixStreamParams();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_enable_independent_mix_stream_params", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
