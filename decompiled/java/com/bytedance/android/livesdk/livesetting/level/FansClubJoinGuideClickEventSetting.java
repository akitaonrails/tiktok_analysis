package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fan_club_join_guide_event")
public final class FansClubJoinGuideClickEventSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubJoinGuideClickEventSetting INSTANCE = new FansClubJoinGuideClickEventSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fan_club_join_guide_event", DEFAULT);
    }
}
