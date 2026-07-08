package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_enable_watch_cohost_report")
public final class LinkMicEnableWatchCohostReport {
    public static final boolean DEFAULT = true;
    public static final LinkMicEnableWatchCohostReport INSTANCE = new LinkMicEnableWatchCohostReport();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_enable_watch_cohost_report", DEFAULT);
    }
}
