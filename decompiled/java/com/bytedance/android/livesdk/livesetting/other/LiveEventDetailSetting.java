package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_event_detail")
public final class LiveEventDetailSetting {
    public static final String DEFAULT = "";
    public static final LiveEventDetailSetting INSTANCE = new LiveEventDetailSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_event_detail", DEFAULT);
    }
}
