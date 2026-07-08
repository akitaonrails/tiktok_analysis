package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_fix_stream_adaption")
public final class LiveFixStreamAdaptionSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFixStreamAdaptionSetting INSTANCE = new LiveFixStreamAdaptionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fix_stream_adaption", DEFAULT);
    }
}
