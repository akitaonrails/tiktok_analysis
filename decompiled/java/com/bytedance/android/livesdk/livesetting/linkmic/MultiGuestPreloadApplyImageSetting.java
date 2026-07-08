package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_preload_apply_image")
public final class MultiGuestPreloadApplyImageSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPreloadApplyImageSetting INSTANCE = new MultiGuestPreloadApplyImageSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_preload_apply_image", DEFAULT);
    }
}
