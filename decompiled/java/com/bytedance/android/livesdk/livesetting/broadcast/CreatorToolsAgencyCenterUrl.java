package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_agency_center_scheme")
public final class CreatorToolsAgencyCenterUrl {
    public static final String DEFAULT = "";
    public static final CreatorToolsAgencyCenterUrl INSTANCE = new CreatorToolsAgencyCenterUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_agency_center_scheme", DEFAULT);
    }
}
