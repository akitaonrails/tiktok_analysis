package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_epi_dynamic_engine_enable")
public final class LiveFansClubEpiDynamicEngineEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubEpiDynamicEngineEnableSetting INSTANCE = new LiveFansClubEpiDynamicEngineEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_epi_dynamic_engine_enable", DEFAULT);
    }
}
