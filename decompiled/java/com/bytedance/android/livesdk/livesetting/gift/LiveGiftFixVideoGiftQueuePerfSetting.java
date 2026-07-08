package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_fix_video_gift_queue_perf")
public final class LiveGiftFixVideoGiftQueuePerfSetting {
    public static final LiveGiftFixVideoGiftQueuePerfSetting INSTANCE = new LiveGiftFixVideoGiftQueuePerfSetting();
    public static final boolean DEFAULT = true;
    public static final boolean isEnabled = SettingsManager.INSTANCE.getBooleanValue("live_gift_fix_video_gift_queue_perf", DEFAULT);

    public final boolean isEnabled() {
        return isEnabled;
    }
}
