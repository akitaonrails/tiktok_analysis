package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_advanced_message_queue_with_gap")
public final class LiveAdvanceMessageQueueWithGapSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAdvanceMessageQueueWithGapSetting INSTANCE = new LiveAdvanceMessageQueueWithGapSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_advanced_message_queue_with_gap", DEFAULT);
    }
}
