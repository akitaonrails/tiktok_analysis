package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_creator_hub_url")
public final class LiveCreatorHubUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveCreatorHubUrlSetting INSTANCE = new LiveCreatorHubUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_creator_hub_url", DEFAULT);
    }
}
