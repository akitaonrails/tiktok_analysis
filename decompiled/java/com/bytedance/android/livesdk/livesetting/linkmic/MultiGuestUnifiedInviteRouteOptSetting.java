package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_unified_invite_route_opt")
public final class MultiGuestUnifiedInviteRouteOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestUnifiedInviteRouteOptSetting INSTANCE = new MultiGuestUnifiedInviteRouteOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_unified_invite_route_opt", DEFAULT);
    }
}
