package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "mg_rust_tracker_setup")
public final class RustBaseTrackerSetup {
    public static final boolean DEFAULT = true;
    public static final RustBaseTrackerSetup INSTANCE = new RustBaseTrackerSetup();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_rust_tracker_setup", DEFAULT);
    }
}
