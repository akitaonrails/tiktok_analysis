package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_score_fixed_key")
public final class FansClubScoreFixedEnableSettings {
    public static final boolean DEFAULT = true;
    public static final FansClubScoreFixedEnableSettings INSTANCE = new FansClubScoreFixedEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_score_fixed_key", DEFAULT);
    }
}
