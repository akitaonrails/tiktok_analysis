package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_replay_highlight_refactor_v2")
public final class LiveReplayHighlightPageRefactorSetting {
    public static final int DEFAULT = 0;
    public static final LiveReplayHighlightPageRefactorSetting INSTANCE = new LiveReplayHighlightPageRefactorSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_highlight_refactor_v2", DEFAULT) > 0;
    }

    public final boolean isV1() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_highlight_refactor_v2", DEFAULT) == 1;
    }

    public final boolean isV2() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_highlight_refactor_v2", DEFAULT) == 2;
    }

    public final boolean isV3() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_highlight_refactor_v2", DEFAULT) == 3;
    }
}
