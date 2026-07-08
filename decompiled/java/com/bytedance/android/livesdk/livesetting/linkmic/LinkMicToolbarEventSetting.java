package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_toolbar_event")
public final class LinkMicToolbarEventSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicToolbarEventSetting INSTANCE = new LinkMicToolbarEventSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_toolbar_event", DEFAULT);
    }
}
