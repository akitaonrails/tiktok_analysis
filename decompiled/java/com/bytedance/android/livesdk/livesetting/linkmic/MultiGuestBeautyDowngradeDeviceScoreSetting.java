package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("multiguest_beauty_downgrade_score")
public final class MultiGuestBeautyDowngradeDeviceScoreSetting {
    public static final float DEFAULT = 5.0f;
    public static final MultiGuestBeautyDowngradeDeviceScoreSetting INSTANCE = new MultiGuestBeautyDowngradeDeviceScoreSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("multiguest_beauty_downgrade_score", DEFAULT);
    }
}
