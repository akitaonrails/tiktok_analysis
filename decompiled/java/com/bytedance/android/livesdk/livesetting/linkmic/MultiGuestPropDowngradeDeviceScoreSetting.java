package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("multiguest_prop_downgrade_score")
public final class MultiGuestPropDowngradeDeviceScoreSetting {
    public static final float DEFAULT = 5.0f;
    public static final MultiGuestPropDowngradeDeviceScoreSetting INSTANCE = new MultiGuestPropDowngradeDeviceScoreSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("multiguest_prop_downgrade_score", DEFAULT);
    }
}
