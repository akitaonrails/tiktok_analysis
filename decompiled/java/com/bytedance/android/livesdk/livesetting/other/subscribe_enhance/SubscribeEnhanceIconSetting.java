package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_subscription_enhance_icon")
public final class SubscribeEnhanceIconSetting {
    public static final boolean DEFAULT = false;
    public static final SubscribeEnhanceIconSetting INSTANCE = new SubscribeEnhanceIconSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_subscription_enhance_icon", DEFAULT);
    }
}
