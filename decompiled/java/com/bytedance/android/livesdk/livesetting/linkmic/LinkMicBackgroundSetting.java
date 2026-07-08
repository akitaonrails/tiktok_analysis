package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_linker_rust_background")
public final class LinkMicBackgroundSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicBackgroundSetting INSTANCE = new LinkMicBackgroundSetting();

    public static final boolean opt() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_linker_rust_background", DEFAULT);
    }
}
