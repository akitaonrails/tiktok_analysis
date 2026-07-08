package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_api_request_switch")
public final class FansClubApiRequestEnableSettings {
    public static final boolean DEFAULT = true;
    public static final FansClubApiRequestEnableSettings INSTANCE = new FansClubApiRequestEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_api_request_switch", DEFAULT);
    }
}
