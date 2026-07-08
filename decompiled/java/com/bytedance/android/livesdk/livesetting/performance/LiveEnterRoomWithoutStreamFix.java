package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_enter_room_without_stream_fix")
public final class LiveEnterRoomWithoutStreamFix {
    public static final boolean DEFAULT = false;
    public static final LiveEnterRoomWithoutStreamFix INSTANCE = new LiveEnterRoomWithoutStreamFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enter_room_without_stream_fix", DEFAULT);
    }
}
