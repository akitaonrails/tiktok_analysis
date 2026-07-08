package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_signaling_fix_concurrent_modify")
public final class LiveSignalingFixConcurrentModify {
    public static final boolean DEFAULT = true;
    public static final LiveSignalingFixConcurrentModify INSTANCE = new LiveSignalingFixConcurrentModify();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_signaling_fix_concurrent_modify", DEFAULT);
    }
}
