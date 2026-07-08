package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_sharebg_flick_setting")
public final class MultiGuestSharedBgFlickConfigSetting {
    public static final MultiGuestSharedBgFlickConfigSetting INSTANCE = new MultiGuestSharedBgFlickConfigSetting();
    public static final FlickConfig DEFAULT = new FlickConfig(0, 10, 10800000, false, true, false, true, true);

    public final FlickConfig getValue() {
        return (FlickConfig) SettingsManager.INSTANCE.getValueSafely("multi_guest_sharebg_flick_setting", DEFAULT);
    }
}
