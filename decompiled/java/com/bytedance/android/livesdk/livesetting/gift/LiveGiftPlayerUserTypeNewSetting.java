package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_player_user_type_new")
public final class LiveGiftPlayerUserTypeNewSetting {
    public static final int DEFAULT = 4;
    public static final LiveGiftPlayerUserTypeNewSetting INSTANCE = new LiveGiftPlayerUserTypeNewSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_player_user_type_new", DEFAULT);
    }
}
