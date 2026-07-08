package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fans_club_enable_guide_container")
public final class FansClubEnableGuideContainerizationSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubEnableGuideContainerizationSetting INSTANCE = new FansClubEnableGuideContainerizationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_enable_guide_container", DEFAULT);
    }
}
