package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_enable_copy_oes_process")
public final class LiveEnableCopyOesSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEnableCopyOesSetting INSTANCE = new LiveEnableCopyOesSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_copy_oes_process", DEFAULT);
    }
}
