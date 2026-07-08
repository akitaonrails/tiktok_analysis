package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_online_rank_dialog_height_ratio")
public final class LiveOnlineRankDialogHeightSetting {
    public static final LiveOnlineRankDialogHeightSetting INSTANCE = new LiveOnlineRankDialogHeightSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_online_rank_dialog_height_ratio", DEFAULT);
    }
}
