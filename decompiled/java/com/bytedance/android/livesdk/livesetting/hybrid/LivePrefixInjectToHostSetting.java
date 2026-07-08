package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes24.dex */
@SettingsKey("mt_live_spark_inject_prefix_to_host")
public final class LivePrefixInjectToHostSetting {
    public static final boolean DEFAULT = true;
    public static final LivePrefixInjectToHostSetting INSTANCE = new LivePrefixInjectToHostSetting();

    public final boolean getValue() {
        if (C486960J7u.LIZ()) {
            return false;
        }
        return SettingsManager.INSTANCE.getBooleanValue("mt_live_spark_inject_prefix_to_host", DEFAULT);
    }
}
