package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multilive_guest_linkmic_route_apply")
public final class MultiliveGuestLinkmicRouteApplySetting {
    public static final int DEFAULT = 1;
    public static final int GUEST_LINKMIC_ROUTE_APPLY_AUDIO = 2;
    public static final int GUEST_LINKMIC_ROUTE_APPLY_VIDEO = 1;
    public static final MultiliveGuestLinkmicRouteApplySetting INSTANCE = new MultiliveGuestLinkmicRouteApplySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multilive_guest_linkmic_route_apply", DEFAULT);
    }
}
