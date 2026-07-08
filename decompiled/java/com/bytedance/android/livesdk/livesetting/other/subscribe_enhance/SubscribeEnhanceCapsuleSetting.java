package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_subscription_enhance_capsule")
public final class SubscribeEnhanceCapsuleSetting {
    public static final boolean DEFAULT = false;
    public static final SubscribeEnhanceCapsuleSetting INSTANCE = new SubscribeEnhanceCapsuleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_subscription_enhance_capsule", DEFAULT);
    }
}
