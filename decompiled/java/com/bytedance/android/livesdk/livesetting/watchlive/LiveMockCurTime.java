package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_slide_up_mock_time")
public final class LiveMockCurTime {
    public static final long DEFAULT = -1;
    public static final LiveMockCurTime INSTANCE = new LiveMockCurTime();

    public final long getCurTime() {
        return SettingsManager.INSTANCE.getLongValue("live_slide_up_mock_time", DEFAULT);
    }
}
