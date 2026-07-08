package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_enable_anchor_super_fan_guide")
public final class FansClubEnableAnchorSuperFanGuideSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubEnableAnchorSuperFanGuideSetting INSTANCE = new FansClubEnableAnchorSuperFanGuideSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_enable_anchor_super_fan_guide", DEFAULT);
    }
}
