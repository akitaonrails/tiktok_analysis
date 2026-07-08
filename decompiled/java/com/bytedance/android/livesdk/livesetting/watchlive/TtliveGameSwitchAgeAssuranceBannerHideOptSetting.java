package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, value = "ttlive_game_switch_age_assurance_banner_hide_opt")
public final class TtliveGameSwitchAgeAssuranceBannerHideOptSetting {
    public static final boolean DEFAULT = true;
    public static final TtliveGameSwitchAgeAssuranceBannerHideOptSetting INSTANCE = new TtliveGameSwitchAgeAssuranceBannerHideOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_switch_age_assurance_banner_hide_opt", DEFAULT);
    }
}
