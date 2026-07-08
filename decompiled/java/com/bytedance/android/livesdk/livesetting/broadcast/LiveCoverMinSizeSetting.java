package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cover_min_size")
public final class LiveCoverMinSizeSetting {
    public static final int DEFAULT = 250;
    public static final LiveCoverMinSizeSetting INSTANCE = new LiveCoverMinSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cover_min_size", DEFAULT);
    }
}
