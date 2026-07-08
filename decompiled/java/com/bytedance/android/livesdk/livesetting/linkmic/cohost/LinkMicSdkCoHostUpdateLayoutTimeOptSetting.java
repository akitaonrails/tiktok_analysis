package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_sdk_co_host_update_layout_time_opt")
public final class LinkMicSdkCoHostUpdateLayoutTimeOptSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicSdkCoHostUpdateLayoutTimeOptSetting INSTANCE = new LinkMicSdkCoHostUpdateLayoutTimeOptSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_sdk_co_host_update_layout_time_opt", DEFAULT);
    }

    public final boolean isOpt() {
        return getValue() == 1;
    }
}
