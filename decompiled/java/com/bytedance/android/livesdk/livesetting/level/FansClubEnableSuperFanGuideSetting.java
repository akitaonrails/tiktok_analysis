package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_enable_super_fan_guide")
public final class FansClubEnableSuperFanGuideSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubEnableSuperFanGuideSetting INSTANCE = new FansClubEnableSuperFanGuideSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_enable_super_fan_guide", DEFAULT);
    }
}
