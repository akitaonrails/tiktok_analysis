package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_media_debug")
public final class LinkMicMediaDebugSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicMediaDebugSetting INSTANCE = new LinkMicMediaDebugSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_media_debug", DEFAULT);
    }
}
