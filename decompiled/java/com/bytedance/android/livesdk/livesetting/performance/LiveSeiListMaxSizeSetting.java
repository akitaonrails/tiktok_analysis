package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_sei_list_max_size")
public final class LiveSeiListMaxSizeSetting {
    public static final LiveSeiListMaxSizeSetting INSTANCE = new LiveSeiListMaxSizeSetting();
    public static final int DEFAULT = 40;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_sei_list_max_size", 40);

    public final int maxSize() {
        return value;
    }
}
