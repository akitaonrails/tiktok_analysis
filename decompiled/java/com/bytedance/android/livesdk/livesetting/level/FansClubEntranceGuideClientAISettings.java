package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_fans_entrance_pitaya_enable")
public final class FansClubEntranceGuideClientAISettings {
    public static final boolean DEFAULT = false;
    public static final FansClubEntranceGuideClientAISettings INSTANCE = new FansClubEntranceGuideClientAISettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_entrance_pitaya_enable", DEFAULT);
    }
}
