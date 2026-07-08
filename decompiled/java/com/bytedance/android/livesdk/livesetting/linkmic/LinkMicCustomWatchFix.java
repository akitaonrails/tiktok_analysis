package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_custom_watch_fix")
public final class LinkMicCustomWatchFix {
    public static final boolean DEFAULT = false;
    public static final LinkMicCustomWatchFix INSTANCE = new LinkMicCustomWatchFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_custom_watch_fix", DEFAULT);
    }
}
