package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_poll_container_bg_color")
public final class LivePollContainerBgColorSetting {
    public static final String DEFAULT = "";
    public static final LivePollContainerBgColorSetting INSTANCE = new LivePollContainerBgColorSetting();

    public final String getColor() {
        return SettingsManager.INSTANCE.getStringValue("live_poll_container_bg_color", DEFAULT);
    }
}
