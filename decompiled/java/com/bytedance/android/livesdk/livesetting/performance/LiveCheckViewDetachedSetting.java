package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_check_view_detached")
public final class LiveCheckViewDetachedSetting {
    public static final LiveCheckViewDetachedSetting INSTANCE = new LiveCheckViewDetachedSetting();
    public static final boolean DEFAULT = true;

    public final boolean getEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_check_view_detached", DEFAULT);
    }
}
