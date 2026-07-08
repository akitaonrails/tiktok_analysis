package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("subscription_anchor_faq_for_non_gb")
public final class LiveSubscribeAnchorFaqNonGBSetting {
    public static final String DEFAULT = "";
    public static final LiveSubscribeAnchorFaqNonGBSetting INSTANCE = new LiveSubscribeAnchorFaqNonGBSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscription_anchor_faq_for_non_gb", DEFAULT);
    }
}
