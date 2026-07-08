package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_mute_comments_list")
public final class LiveMuteCommentsListSetting {
    public static final LiveMuteCommentsListSetting INSTANCE = new LiveMuteCommentsListSetting();
    public static final double[] DEFAULT = {5.0d, 30.0d, 60.0d, 300.0d, -1.0d};

    public final double[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        double[] dArr = DEFAULT;
        double[] dArr2 = (double[]) settingsManager.getValueSafely("live_mute_comments_list", dArr);
        return dArr2 != null ? dArr2 : dArr;
    }
}
