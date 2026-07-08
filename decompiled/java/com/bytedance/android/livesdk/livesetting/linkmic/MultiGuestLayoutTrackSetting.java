package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_layout_track")
public final class MultiGuestLayoutTrackSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestLayoutTrackSetting INSTANCE = new MultiGuestLayoutTrackSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_layout_track", DEFAULT);
    }

    public final boolean isTrackEnable() {
        return getValue();
    }
}
