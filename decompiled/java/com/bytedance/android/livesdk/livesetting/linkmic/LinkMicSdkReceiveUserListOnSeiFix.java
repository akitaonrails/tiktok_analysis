package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_receive_user_list_on_sei_fix")
public final class LinkMicSdkReceiveUserListOnSeiFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicSdkReceiveUserListOnSeiFix INSTANCE = new LinkMicSdkReceiveUserListOnSeiFix();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_receive_user_list_on_sei_fix", DEFAULT);
    }
}
