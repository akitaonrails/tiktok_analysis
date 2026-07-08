package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_decoration_type")
public final class MultiGuestDecorationSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestDecorationSetting INSTANCE = new MultiGuestDecorationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_decoration_type", DEFAULT);
    }

    public final boolean adjustSettingOrder() {
        return getValue() >= 2;
    }

    public final boolean enable() {
        return getValue() > 0;
    }

    public final boolean removeSettings() {
        return getValue() >= 1;
    }
}
