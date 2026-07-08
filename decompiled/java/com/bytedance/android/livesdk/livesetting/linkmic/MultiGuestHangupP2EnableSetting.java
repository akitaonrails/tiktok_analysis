package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_enable_hangup_phase2")
public final class MultiGuestHangupP2EnableSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestHangupP2EnableSetting INSTANCE = new MultiGuestHangupP2EnableSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_enable_hangup_phase2", DEFAULT);
    }
}
