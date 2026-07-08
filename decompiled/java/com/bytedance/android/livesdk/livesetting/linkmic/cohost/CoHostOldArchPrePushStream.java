package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "co_host_old_arch_not_pre_push_stream")
public final class CoHostOldArchPrePushStream {
    public static final boolean DEFAULT = false;
    public static final CoHostOldArchPrePushStream INSTANCE = new CoHostOldArchPrePushStream();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("co_host_old_arch_not_pre_push_stream", DEFAULT);
    }
}
