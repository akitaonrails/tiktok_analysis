package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_violence_url")
public final class LiveMatureViolenceUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveMatureViolenceUrlSetting INSTANCE = new LiveMatureViolenceUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_violence_url", DEFAULT);
    }
}
