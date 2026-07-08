package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_level")
public final class FansClubSettings {
    public static final FansClubSettings INSTANCE = new FansClubSettings();
    public static final FansClubConfig DEFAULT = new FansClubConfig(new ArrayList(), new FansClubDynamicConfig(10, false, 4000, 1), new ArrayList(), new ArrayList(), new GeckoResourceDownloadConfig(null), new FansClubLottieConfig("", "", ""));

    public final FansClubConfig getFansClubConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        FansClubConfig fansClubConfig = DEFAULT;
        FansClubConfig fansClubConfig2 = (FansClubConfig) settingsManager.getValueSafely("live_fans_club_level", fansClubConfig);
        return fansClubConfig2 != null ? fansClubConfig2 : fansClubConfig;
    }

    public final FansClubConfig getDEFAULT() {
        return DEFAULT;
    }
}
