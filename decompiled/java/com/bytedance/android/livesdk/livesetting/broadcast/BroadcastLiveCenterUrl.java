package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_anchor_center_lynx_url")
public final class BroadcastLiveCenterUrl {
    public static final String DEFAULT = "";
    public static final BroadcastLiveCenterUrl INSTANCE = new BroadcastLiveCenterUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_anchor_center_lynx_url", DEFAULT);
    }
}
