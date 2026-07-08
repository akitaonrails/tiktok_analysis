package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_subscription_expire_remind_hour")
public final class SubscriptionExpireRemindHourSetting {
    public static final int DEFAULT = 72;
    public static final SubscriptionExpireRemindHourSetting INSTANCE = new SubscriptionExpireRemindHourSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_subscription_expire_remind_hour", DEFAULT);
    }
}
