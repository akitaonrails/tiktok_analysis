package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_center_red_hot_id")
public final class FansClubLiveCenterRedIdSettings {
    public static final String DEFAULT = "";
    public static final FansClubLiveCenterRedIdSettings INSTANCE = new FansClubLiveCenterRedIdSettings();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_center_red_hot_id", DEFAULT);
    }
}
