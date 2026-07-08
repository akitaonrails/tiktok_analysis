package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_top_one_opt")
public final class LiveFansClubTopOneOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubTopOneOptSetting INSTANCE = new LiveFansClubTopOneOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_top_one_opt", DEFAULT);
    }
}
