package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_show_history_list_setting")
public final class CoHostShowHistoryListSetting {
    public static final CoHostShowHistoryListSetting INSTANCE = new CoHostShowHistoryListSetting();
    public static final int DEFAULT = -1;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_cohost_show_history_list_setting", DEFAULT);

    public final boolean isEnable() {
        return value > 0;
    }

    public final boolean isGroupA() {
        return value == 1;
    }

    public final boolean isGroupB() {
        return value == 2;
    }
}
