package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_switch_spot_pass_through_double_tap")
public final class MultiGuestSwitchSpotPassThroughDoubleTapSetting {
    public static final int DEFAULT = 1;
    public static final MultiGuestSwitchSpotPassThroughDoubleTapSetting INSTANCE = new MultiGuestSwitchSpotPassThroughDoubleTapSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_switch_spot_pass_through_double_tap", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
