package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_anchor_quick_connect")
public final class MultiGuestAnchorQuickConnectSetting {
    public static final int TYPE_NO_QUICK_CONNECT = 0;
    public static final MultiGuestAnchorQuickConnectSetting INSTANCE = new MultiGuestAnchorQuickConnectSetting();
    public static final MultiGuestAnchorQuickConnectConfig DEFAULT = new MultiGuestAnchorQuickConnectConfig(0, 120);
    public static final int TYPE_QUICK_CONNECT_WITH_LIMIT_TIME = 1;
    public static final int TYPE_QUICK_CONNECT_IN_WHOLE_ROOM = 2;

    private final MultiGuestAnchorQuickConnectConfig getValue() {
        MultiGuestAnchorQuickConnectConfig multiGuestAnchorQuickConnectConfig = (MultiGuestAnchorQuickConnectConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestAnchorQuickConnectSetting.class);
        return multiGuestAnchorQuickConnectConfig == null ? DEFAULT : multiGuestAnchorQuickConnectConfig;
    }

    public final long getTimeInSecond() {
        return getValue().time;
    }

    public final boolean isEnable() {
        return getValue().type != TYPE_NO_QUICK_CONNECT;
    }

    public final boolean isEnableAndLimitTime() {
        return getValue().type == TYPE_QUICK_CONNECT_WITH_LIMIT_TIME;
    }

    public final boolean isEnableAndNoLimitTime() {
        return getValue().type == TYPE_QUICK_CONNECT_IN_WHOLE_ROOM;
    }
}
