package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("subscription_anchor_faq_for_gb")
public final class LiveSubscribeAnchorFaqGBSetting {
    public static final String DEFAULT = "";
    public static final LiveSubscribeAnchorFaqGBSetting INSTANCE = new LiveSubscribeAnchorFaqGBSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("subscription_anchor_faq_for_gb", DEFAULT);
    }
}
