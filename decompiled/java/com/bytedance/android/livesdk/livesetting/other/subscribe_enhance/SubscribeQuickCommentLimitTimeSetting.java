package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_new_sub_notify_time_limit")
public final class SubscribeQuickCommentLimitTimeSetting {
    public static final int DEFAULT = 30;
    public static final SubscribeQuickCommentLimitTimeSetting INSTANCE = new SubscribeQuickCommentLimitTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_new_sub_notify_time_limit", DEFAULT);
    }
}
