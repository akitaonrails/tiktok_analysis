package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_preview_batch_load")
public final class BroadcastPreviewBatchLoadSetting {
    public static final int DEFAULT = 0;
    public static final BroadcastPreviewBatchLoadSetting INSTANCE = new BroadcastPreviewBatchLoadSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_preview_batch_load", DEFAULT) > 0;
    }

    public final boolean isV2() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_preview_batch_load", DEFAULT) == 2;
    }
}
