package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_unmute_before_stop_interact")
public final class LinkMicUnmuteBeforeStopInteract {
    public static final boolean DEFAULT = true;
    public static final LinkMicUnmuteBeforeStopInteract INSTANCE = new LinkMicUnmuteBeforeStopInteract();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_unmute_before_stop_interact", DEFAULT);
    }
}
