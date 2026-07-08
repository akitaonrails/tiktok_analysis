package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_layout_leak_fix")
public final class MultiGuestLayoutLeakFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestLayoutLeakFixSetting INSTANCE = new MultiGuestLayoutLeakFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_layout_leak_fix", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
