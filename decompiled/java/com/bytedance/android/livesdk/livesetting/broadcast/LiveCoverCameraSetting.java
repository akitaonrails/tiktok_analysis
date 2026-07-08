package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cover_camera_compliance")
public final class LiveCoverCameraSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoverCameraSetting INSTANCE = new LiveCoverCameraSetting();
    public static final int SETTING1 = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cover_camera_compliance", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1;
    }
}
