package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_room_slide_out_tracker_sample_rate")
public final class LiveViewPagerSlideLogSetting {
    public static final boolean DEFAULT = false;
    public static final LiveViewPagerSlideLogSetting INSTANCE = new LiveViewPagerSlideLogSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_room_slide_out_tracker_sample_rate", DEFAULT);
    }
}
