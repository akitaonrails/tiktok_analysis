package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_finish_other_page")
public final class LiveBroadcastFinishOtherPageSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastFinishOtherPageSetting INSTANCE = new LiveBroadcastFinishOtherPageSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_finish_other_page", DEFAULT);
    }
}
