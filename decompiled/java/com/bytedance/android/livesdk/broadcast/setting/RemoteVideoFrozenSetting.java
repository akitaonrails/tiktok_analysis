package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_stream_linkmic_remote_video_frozen")
public final class RemoteVideoFrozenSetting {
    public static final int DEFAULT = 200;
    public static final RemoteVideoFrozenSetting INSTANCE = new RemoteVideoFrozenSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_stream_linkmic_remote_video_frozen", DEFAULT);
    }
}
