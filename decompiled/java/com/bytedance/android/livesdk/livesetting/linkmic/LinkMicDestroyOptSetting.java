package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_rust_dispose_opt")
public final class LinkMicDestroyOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicDestroyOptSetting INSTANCE = new LinkMicDestroyOptSetting();

    public final boolean optimize() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_dispose_opt", DEFAULT);
    }
}
