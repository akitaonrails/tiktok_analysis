package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes21.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_rust_assert_opt")
public final class LinkMicAssertSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicAssertSetting INSTANCE = new LinkMicAssertSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_assert_opt", DEFAULT);
    }
}
