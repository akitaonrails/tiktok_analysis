package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_community_gameplay_enable")
public final class FansClubGameplayCommunityEnableSetting {
    public static final boolean DEFAULT = false;
    public static final FansClubGameplayCommunityEnableSetting INSTANCE = new FansClubGameplayCommunityEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_community_gameplay_enable", DEFAULT);
    }
}
