package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("revenue_interaction_gift_guide_fix_enable_setting")
public final class RevenueInteractionGiftGuideFixEnableSetting {
    public static final boolean DEFAULT = true;
    public static final RevenueInteractionGiftGuideFixEnableSetting INSTANCE = new RevenueInteractionGiftGuideFixEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("revenue_interaction_gift_guide_fix_enable_setting", DEFAULT);
    }
}
