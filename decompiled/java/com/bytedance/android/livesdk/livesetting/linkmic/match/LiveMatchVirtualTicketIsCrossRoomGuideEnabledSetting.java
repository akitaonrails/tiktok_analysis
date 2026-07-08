package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_virtual_ticket_is_cross_room_guide_enabled")
public final class LiveMatchVirtualTicketIsCrossRoomGuideEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchVirtualTicketIsCrossRoomGuideEnabledSetting INSTANCE = new LiveMatchVirtualTicketIsCrossRoomGuideEnabledSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_virtual_ticket_is_cross_room_guide_enabled", DEFAULT);
    }

    public static final boolean isEnabled() {
        return LiveMatchVirtualTicketIsUserEnabledSetting.getValue() && getValue();
    }
}
