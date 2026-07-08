package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_Guest_anchor_tap_fix")
public final class MultiGuestAnchorTapFixSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestAnchorTapFixSetting INSTANCE = new MultiGuestAnchorTapFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_Guest_anchor_tap_fix", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
