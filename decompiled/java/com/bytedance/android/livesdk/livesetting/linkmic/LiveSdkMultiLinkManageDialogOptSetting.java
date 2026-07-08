package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_link_manage_dialog_opt")
public final class LiveSdkMultiLinkManageDialogOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiLinkManageDialogOptSetting INSTANCE = new LiveSdkMultiLinkManageDialogOptSetting();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_link_manage_dialog_opt", DEFAULT);
    }
}
