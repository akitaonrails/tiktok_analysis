package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("sub_icon_hide_text_minimum_dimension")
public final class SubscriptionIconHideTextMinimumDimensionSetting {
    public static final int DEFAULT = 390;
    public static final SubscriptionIconHideTextMinimumDimensionSetting INSTANCE = new SubscriptionIconHideTextMinimumDimensionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("sub_icon_hide_text_minimum_dimension", DEFAULT);
    }
}
