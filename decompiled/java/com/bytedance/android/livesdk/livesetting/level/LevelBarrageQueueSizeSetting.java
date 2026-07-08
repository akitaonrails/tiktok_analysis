package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("level_barrage_message_queue_size")
public final class LevelBarrageQueueSizeSetting {
    public static final int DEFAULT = 10;
    public static final LevelBarrageQueueSizeSetting INSTANCE = new LevelBarrageQueueSizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("level_barrage_message_queue_size", DEFAULT);
    }
}
