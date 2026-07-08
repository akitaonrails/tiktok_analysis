package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_friend_notice_optimize_increase")
public final class CohostNoticeStrategySettings {
    public static final int DEFAULT = 0;
    public static final CohostNoticeStrategySettings INSTANCE = new CohostNoticeStrategySettings();

    public final int getGetStickValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_friend_notice_optimize_increase", DEFAULT);
    }
}
