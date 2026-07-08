package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_fans_club_anim_margin_fix")
public final class LiveFansClubAnimMarginFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubAnimMarginFixSetting INSTANCE = new LiveFansClubAnimMarginFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_anim_margin_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
