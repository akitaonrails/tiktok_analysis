package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("display_vw_in_fyp")
public final class LiveViewerWishesBillboardFeedEnableSetting {
    public static final LiveViewerWishesBillboardFeedEnableSetting INSTANCE = new LiveViewerWishesBillboardFeedEnableSetting();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("display_vw_in_fyp", DEFAULT);
    }
}
