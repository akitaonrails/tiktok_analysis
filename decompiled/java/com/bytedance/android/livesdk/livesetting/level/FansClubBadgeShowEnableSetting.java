package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_level_badge_switch")
public final class FansClubBadgeShowEnableSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubBadgeShowEnableSetting INSTANCE = new FansClubBadgeShowEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_level_badge_switch", DEFAULT);
    }
}
