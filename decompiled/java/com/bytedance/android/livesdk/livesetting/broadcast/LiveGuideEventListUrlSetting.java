package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_guide_event_list_url")
public final class LiveGuideEventListUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveGuideEventListUrlSetting INSTANCE = new LiveGuideEventListUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_guide_event_list_url", DEFAULT);
    }
}
