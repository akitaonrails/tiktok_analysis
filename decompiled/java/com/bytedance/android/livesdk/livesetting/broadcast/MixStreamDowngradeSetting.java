package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("mix_stream_downgrade_setting")
public final class MixStreamDowngradeSetting {
    public static final boolean DEFAULT = false;
    public static final MixStreamDowngradeSetting INSTANCE = new MixStreamDowngradeSetting();
    public static boolean requestSuccess;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("mix_stream_downgrade_setting", DEFAULT);
    }

    public final boolean getRequestSuccess() {
        return requestSuccess;
    }

    public final void setRequestSuccess(boolean z) {
        requestSuccess = z;
    }
}
