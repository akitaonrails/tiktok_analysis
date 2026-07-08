package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_subscription_toolbar_entrance")
public final class LiveAnchorSubscriptionToolbarEntrance {
    public static final int DEFAULT = 0;
    public static final LiveAnchorSubscriptionToolbarEntrance INSTANCE = new LiveAnchorSubscriptionToolbarEntrance();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_subscription_toolbar_entrance", DEFAULT);
    }

    public final boolean isControlGroup() {
        return getValue() == 0;
    }

    public final boolean isExperimentGroup() {
        return getValue() == 1;
    }
}
