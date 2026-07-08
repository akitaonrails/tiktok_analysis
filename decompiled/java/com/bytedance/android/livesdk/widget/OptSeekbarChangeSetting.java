package com.bytedance.android.livesdk.widget;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "opt_seekbar_change")
public final class OptSeekbarChangeSetting {
    public static final boolean DEFAULT = false;
    public static final OptSeekbarChangeSetting INSTANCE = new OptSeekbarChangeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("opt_seekbar_change", DEFAULT);
    }
}
