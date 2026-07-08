package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_run_on_rust_when_dispose")
public final class LinkMicRunOnRustWhenDispose {
    public static final boolean DEFAULT = true;
    public static final LinkMicRunOnRustWhenDispose INSTANCE = new LinkMicRunOnRustWhenDispose();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_run_on_rust_when_dispose", DEFAULT);
    }
}
