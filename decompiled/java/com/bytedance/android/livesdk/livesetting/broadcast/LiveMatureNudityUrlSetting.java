package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_nudity_url")
public final class LiveMatureNudityUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveMatureNudityUrlSetting INSTANCE = new LiveMatureNudityUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_nudity_url", DEFAULT);
    }
}
