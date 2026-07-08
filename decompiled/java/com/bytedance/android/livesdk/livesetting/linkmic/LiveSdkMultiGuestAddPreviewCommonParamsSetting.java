package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_add_preview_common_params")
public final class LiveSdkMultiGuestAddPreviewCommonParamsSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestAddPreviewCommonParamsSetting INSTANCE = new LiveSdkMultiGuestAddPreviewCommonParamsSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_add_preview_common_params", DEFAULT);
    }
}
