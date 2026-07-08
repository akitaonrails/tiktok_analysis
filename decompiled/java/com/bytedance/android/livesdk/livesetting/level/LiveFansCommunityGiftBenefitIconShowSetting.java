package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fans_community_gift_benefit_icon_show")
public final class LiveFansCommunityGiftBenefitIconShowSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFansCommunityGiftBenefitIconShowSetting INSTANCE = new LiveFansCommunityGiftBenefitIconShowSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_community_gift_benefit_icon_show", DEFAULT);
    }
}
