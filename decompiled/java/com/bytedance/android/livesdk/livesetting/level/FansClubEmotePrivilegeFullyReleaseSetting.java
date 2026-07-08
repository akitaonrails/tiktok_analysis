package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fan_club_emote_privilege_fully_release")
public final class FansClubEmotePrivilegeFullyReleaseSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubEmotePrivilegeFullyReleaseSetting INSTANCE = new FansClubEmotePrivilegeFullyReleaseSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fan_club_emote_privilege_fully_release", DEFAULT);
    }
}
