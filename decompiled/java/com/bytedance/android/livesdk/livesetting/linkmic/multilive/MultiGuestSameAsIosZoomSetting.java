package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_same_as_ios_zoom")
public final class MultiGuestSameAsIosZoomSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestSameAsIosZoomSetting INSTANCE = new MultiGuestSameAsIosZoomSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_same_as_ios_zoom", DEFAULT);
    }
}
