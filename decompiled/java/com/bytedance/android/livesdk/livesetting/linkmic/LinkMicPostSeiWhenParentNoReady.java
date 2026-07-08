package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_post_sei_when_parent_no_ready")
public final class LinkMicPostSeiWhenParentNoReady {
    public static final boolean DEFAULT = true;
    public static final LinkMicPostSeiWhenParentNoReady INSTANCE = new LinkMicPostSeiWhenParentNoReady();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_post_sei_when_parent_no_ready", DEFAULT);
    }
}
