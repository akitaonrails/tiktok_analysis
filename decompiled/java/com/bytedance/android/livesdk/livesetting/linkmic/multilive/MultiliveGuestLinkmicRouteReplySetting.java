package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_sdk_multilive_guest_linkmic_route_reply")
public final class MultiliveGuestLinkmicRouteReplySetting {
    public static final int DEFAULT = 1;
    public static final int GUEST_LINKMIC_ROUTE_REPLY_AUDIO = 2;
    public static final int GUEST_LINKMIC_ROUTE_REPLY_VIDEO = 1;
    public static final MultiliveGuestLinkmicRouteReplySetting INSTANCE = new MultiliveGuestLinkmicRouteReplySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multilive_guest_linkmic_route_reply", DEFAULT);
    }
}
