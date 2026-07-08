package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_enable_clear_when_reject_opt")
public final class MultiGuestEnableClearWhenRejectSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestEnableClearWhenRejectSetting INSTANCE = new MultiGuestEnableClearWhenRejectSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_enable_clear_when_reject_opt", DEFAULT);
    }
}
