package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_fans_community_gift_new_label_expression")
public final class LiveFansCommunityGiftNewLabelExpressionSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansCommunityGiftNewLabelExpressionSetting INSTANCE = new LiveFansCommunityGiftNewLabelExpressionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_community_gift_new_label_expression", DEFAULT);
    }
}
