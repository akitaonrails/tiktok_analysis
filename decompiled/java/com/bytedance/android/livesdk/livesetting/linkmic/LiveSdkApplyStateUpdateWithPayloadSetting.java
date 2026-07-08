package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_apply_state_update_with_payload")
public final class LiveSdkApplyStateUpdateWithPayloadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkApplyStateUpdateWithPayloadSetting INSTANCE = new LiveSdkApplyStateUpdateWithPayloadSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_apply_state_update_with_payload", DEFAULT);
    }
}
