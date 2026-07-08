package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_water_mark_fix")
public final class MultiGuestWaterMarkFixSetting {
    public static final MultiGuestWaterMarkFixSetting INSTANCE = new MultiGuestWaterMarkFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_water_mark_fix", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
