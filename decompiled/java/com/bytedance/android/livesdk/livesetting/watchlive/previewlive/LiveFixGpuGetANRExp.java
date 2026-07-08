package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fix_gpu_get_anr_exp")
public final class LiveFixGpuGetANRExp {
    public static final int DEFAULT = 0;
    public static final LiveFixGpuGetANRExp INSTANCE = new LiveFixGpuGetANRExp();

    public static final boolean isASync() {
        return SettingsManager.INSTANCE.getIntValue("live_fix_gpu_get_anr_exp", DEFAULT) == 2;
    }

    public static final boolean isSync() {
        return SettingsManager.INSTANCE.getIntValue("live_fix_gpu_get_anr_exp", DEFAULT) == 1;
    }
}
