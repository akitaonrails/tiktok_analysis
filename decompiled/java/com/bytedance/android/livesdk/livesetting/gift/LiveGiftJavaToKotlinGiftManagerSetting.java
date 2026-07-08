package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_java_to_kotlin_giftmanager")
public final class LiveGiftJavaToKotlinGiftManagerSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLED = true;
    public static final LiveGiftJavaToKotlinGiftManagerSetting INSTANCE = new LiveGiftJavaToKotlinGiftManagerSetting();

    public static /* synthetic */ void isEnabled$annotations() {
    }

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_java_to_kotlin_giftmanager", DEFAULT);
    }
}
