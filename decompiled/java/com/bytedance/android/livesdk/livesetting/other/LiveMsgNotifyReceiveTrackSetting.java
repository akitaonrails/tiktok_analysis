package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_notify_receive_track")
public final class LiveMsgNotifyReceiveTrackSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMsgNotifyReceiveTrackSetting INSTANCE = new LiveMsgNotifyReceiveTrackSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_notify_receive_track", DEFAULT);
    }
}
