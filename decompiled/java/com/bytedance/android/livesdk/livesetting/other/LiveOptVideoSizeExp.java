package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_opt_video_size_exp")
public final class LiveOptVideoSizeExp {
    public static final int DEFAULT = 0;
    public static final LiveOptVideoSizeExp INSTANCE = new LiveOptVideoSizeExp();

    public static final boolean isOptPerf() {
        return SettingsManager.INSTANCE.getIntValue("live_opt_video_size_exp", DEFAULT) == 1;
    }

    public static final boolean isOptPic() {
        return SettingsManager.INSTANCE.getIntValue("live_opt_video_size_exp", DEFAULT) == 2;
    }
}
