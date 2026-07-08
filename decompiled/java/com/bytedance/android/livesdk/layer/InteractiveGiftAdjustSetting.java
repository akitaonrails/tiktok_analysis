package com.bytedance.android.livesdk.layer;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("livesdk_interactive_gift_adjust_enable")
public final class InteractiveGiftAdjustSetting {
    public static final InteractiveGiftAdjustSetting INSTANCE = new InteractiveGiftAdjustSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_interactive_gift_adjust_enable", DEFAULT);
    }
}
