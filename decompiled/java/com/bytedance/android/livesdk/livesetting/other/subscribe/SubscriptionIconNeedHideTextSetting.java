package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("sub_icon_need_hide_text")
public final class SubscriptionIconNeedHideTextSetting {
    public static final boolean DEFAULT = true;
    public static final SubscriptionIconNeedHideTextSetting INSTANCE = new SubscriptionIconNeedHideTextSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("sub_icon_need_hide_text", DEFAULT);
    }
}
