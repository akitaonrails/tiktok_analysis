package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_community_gameplay_guide_anim_cache_expire_duration")
public final class FansClubGameplayUpgradeFrequencyExpireDurationSetting {
    public static final long DEFAULT = 86400000;
    public static final FansClubGameplayUpgradeFrequencyExpireDurationSetting INSTANCE = new FansClubGameplayUpgradeFrequencyExpireDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_fans_club_community_gameplay_guide_anim_cache_expire_duration", DEFAULT);
    }
}
