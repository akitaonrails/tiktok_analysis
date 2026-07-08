package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_group_api_add_source")
public final class LinkMicSdkGroupApiAddSourceSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkGroupApiAddSourceSetting INSTANCE = new LinkMicSdkGroupApiAddSourceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_group_api_add_source", DEFAULT);
    }
}
