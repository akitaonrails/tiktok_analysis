package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_quiz_container_optimize")
public final class LiveQuizContainerOptSetting {
    public static final LiveQuizContainerOptSetting INSTANCE = new LiveQuizContainerOptSetting();
    public static final LiveQuizContainerOpt DEFAULT = new LiveQuizContainerOpt(false, null, new ArrayList(), new ArrayList(), true);

    public final LiveQuizContainerOpt getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveQuizContainerOpt liveQuizContainerOpt = DEFAULT;
        LiveQuizContainerOpt liveQuizContainerOpt2 = (LiveQuizContainerOpt) settingsManager.getValueSafely("live_quiz_container_optimize", liveQuizContainerOpt);
        return liveQuizContainerOpt2 != null ? liveQuizContainerOpt2 : liveQuizContainerOpt;
    }
}
