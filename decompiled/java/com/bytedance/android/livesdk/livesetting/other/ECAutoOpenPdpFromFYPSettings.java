package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = true, value = "ttec_enter_pdp_from_fyp_live_preview")
public final class ECAutoOpenPdpFromFYPSettings {
    public static final boolean DEFAULT = false;
    public static final ECAutoOpenPdpFromFYPSettings INSTANCE = new ECAutoOpenPdpFromFYPSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttec_enter_pdp_from_fyp_live_preview", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
