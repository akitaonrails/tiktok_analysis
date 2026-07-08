package com.bytedance.android.livesdk.layer;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_fix_pad_multi_guest_ps_height")
public final class LiveFixPadMultiGuestPsHeightSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFixPadMultiGuestPsHeightSetting INSTANCE = new LiveFixPadMultiGuestPsHeightSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fix_pad_multi_guest_ps_height", DEFAULT);
    }
}
