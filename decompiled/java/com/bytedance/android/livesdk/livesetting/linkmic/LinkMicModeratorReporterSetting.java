package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_moderator_report_event")
public final class LinkMicModeratorReporterSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicModeratorReporterSetting INSTANCE = new LinkMicModeratorReporterSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_moderator_report_event", DEFAULT);
    }
}
