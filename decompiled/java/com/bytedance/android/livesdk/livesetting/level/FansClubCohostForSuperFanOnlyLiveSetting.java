package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_enable_cohost_for_super_fan_only_live")
public final class FansClubCohostForSuperFanOnlyLiveSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubCohostForSuperFanOnlyLiveSetting INSTANCE = new FansClubCohostForSuperFanOnlyLiveSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_cohost_for_super_fan_only_live", DEFAULT);
    }
}
