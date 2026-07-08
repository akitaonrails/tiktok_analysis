package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_link_control_lifecycle")
public final class LiveCohostLinkControlLifecycleSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostLinkControlLifecycleSetting INSTANCE = new LiveCohostLinkControlLifecycleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_link_control_lifecycle", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
