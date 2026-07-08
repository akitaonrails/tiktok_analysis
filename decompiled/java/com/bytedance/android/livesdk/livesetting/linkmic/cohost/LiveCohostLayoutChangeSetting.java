package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_layout_change")
public final class LiveCohostLayoutChangeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostLayoutChangeSetting INSTANCE = new LiveCohostLayoutChangeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_layout_change", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
