package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("show_live_manager_entrance")
public final class ShowLiveManagerEntranceSetting {
    public static final boolean DEFAULT = true;
    public static final ShowLiveManagerEntranceSetting INSTANCE = new ShowLiveManagerEntranceSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("show_live_manager_entrance", DEFAULT);
    }
}
