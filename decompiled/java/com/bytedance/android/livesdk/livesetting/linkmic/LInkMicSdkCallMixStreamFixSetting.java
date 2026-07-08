package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_triones_call_mix_stream_fix")
public final class LInkMicSdkCallMixStreamFixSetting {
    public static final boolean DEFAULT = true;
    public static final LInkMicSdkCallMixStreamFixSetting INSTANCE = new LInkMicSdkCallMixStreamFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_triones_call_mix_stream_fix", DEFAULT);
    }
}
