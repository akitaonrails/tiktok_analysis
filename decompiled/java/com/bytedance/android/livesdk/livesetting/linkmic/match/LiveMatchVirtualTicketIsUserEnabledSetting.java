package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_virtual_ticket_is_user_enabled")
public final class LiveMatchVirtualTicketIsUserEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchVirtualTicketIsUserEnabledSetting INSTANCE = new LiveMatchVirtualTicketIsUserEnabledSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_virtual_ticket_is_user_enabled", DEFAULT);
    }

    public static final boolean isEnabled() {
        return getValue();
    }
}
