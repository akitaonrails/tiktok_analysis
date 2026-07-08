package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("mt_anchor_center_lynx_url")
public final class CreatorToolsLiveCenterUrl {
    public static final String DEFAULT = "";
    public static final CreatorToolsLiveCenterUrl INSTANCE = new CreatorToolsLiveCenterUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("mt_anchor_center_lynx_url", DEFAULT);
    }
}
