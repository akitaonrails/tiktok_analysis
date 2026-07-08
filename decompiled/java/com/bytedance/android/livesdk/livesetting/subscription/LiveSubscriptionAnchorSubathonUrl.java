package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_anchor_subathon_url")
public final class LiveSubscriptionAnchorSubathonUrl {
    public static final LiveSubscriptionAnchorSubathonUrl INSTANCE = new LiveSubscriptionAnchorSubathonUrl();
    public static final LiveSubscriptionAnchorSubathonUrlConfig DEFAULT = new LiveSubscriptionAnchorSubathonUrlConfig("", "", "", "", "", "");

    public final LiveSubscriptionAnchorSubathonUrlConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig = DEFAULT;
        LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig2 = (LiveSubscriptionAnchorSubathonUrlConfig) settingsManager.getValueSafely("live_subscription_anchor_subathon_url", liveSubscriptionAnchorSubathonUrlConfig);
        return liveSubscriptionAnchorSubathonUrlConfig2 != null ? liveSubscriptionAnchorSubathonUrlConfig2 : liveSubscriptionAnchorSubathonUrlConfig;
    }

    public final LiveSubscriptionAnchorSubathonUrlConfig getDEFAULT() {
        return DEFAULT;
    }
}
