package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_gift_list_watch_n_sec_opt_fix")
public final class LiveGiftListWatchNSecOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGiftListWatchNSecOptSetting INSTANCE = new LiveGiftListWatchNSecOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_list_watch_n_sec_opt_fix", DEFAULT);
    }
}
