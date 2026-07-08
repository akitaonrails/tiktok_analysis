package com.bytedance.android.livesdk.livesetting;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_suspend_support_pb_white_list")
public final class LiveSuspendSupportPbWhiteListSetting {
    public static final LiveSuspendSupportPbWhiteListSetting INSTANCE = new LiveSuspendSupportPbWhiteListSetting();
    public static final String[] DEFAULT = {"/webcast/anchor/golive/playbook/"};

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_suspend_support_pb_white_list", DEFAULT);
    }

    public final boolean supportPb(String str) {
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
