package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_cancel_end_dialog_request_server")
public final class LiveHostCancelEndDialogRequestServer {
    public static final LiveHostCancelEndDialogRequestServer INSTANCE = new LiveHostCancelEndDialogRequestServer();
    public static final boolean DEFAULT = true;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_host_cancel_end_dialog_request_server", true);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
