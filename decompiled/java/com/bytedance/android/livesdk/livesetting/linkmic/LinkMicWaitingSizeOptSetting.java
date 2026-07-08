package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_waiting_size_opt")
public final class LinkMicWaitingSizeOptSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicWaitingSizeOptSetting INSTANCE = new LinkMicWaitingSizeOptSetting();

    public final boolean optimize() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_dispose_opt", LinkMicDestroyOptSetting.DEFAULT);
    }
}
