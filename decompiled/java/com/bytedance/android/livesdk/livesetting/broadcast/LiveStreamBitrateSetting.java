package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_stream_bitrate")
public final class LiveStreamBitrateSetting {
    public static final LiveStreamBitrateSetting INSTANCE = new LiveStreamBitrateSetting();
    public static final int[] DEFAULT = new int[0];

    public final int[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int[] iArr = DEFAULT;
        int[] iArr2 = (int[]) settingsManager.getValueSafely("live_stream_bitrate", iArr);
        return iArr2 != null ? iArr2 : iArr;
    }
}
