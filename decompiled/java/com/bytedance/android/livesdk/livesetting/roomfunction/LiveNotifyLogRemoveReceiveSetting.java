package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_notify_log_remove_receive")
public final class LiveNotifyLogRemoveReceiveSetting {
    public static final LiveNotifyLogRemoveReceiveSetting INSTANCE = new LiveNotifyLogRemoveReceiveSetting();
    public static final boolean DEFAULT = true;

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_notify_log_remove_receive", DEFAULT);
    }
}
