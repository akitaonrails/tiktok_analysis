package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "mg_enable_audience_full_seat_accept_invite")
public final class MultiGuestInvitePreApproveSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestInvitePreApproveSetting INSTANCE = new MultiGuestInvitePreApproveSetting();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_enable_audience_full_seat_accept_invite", DEFAULT);
    }
}
