package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LikeConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("digg_params")
public final class DiggParamsSetting {
    public static final DiggParamsSetting INSTANCE = new DiggParamsSetting();
    public static final LikeConfig DEFAULT = LikeConfig.LIZ();

    public final LikeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LikeConfig likeConfig = DEFAULT;
        LikeConfig likeConfig2 = (LikeConfig) settingsManager.getValueSafely("digg_params", likeConfig);
        return likeConfig2 != null ? likeConfig2 : likeConfig;
    }
}
