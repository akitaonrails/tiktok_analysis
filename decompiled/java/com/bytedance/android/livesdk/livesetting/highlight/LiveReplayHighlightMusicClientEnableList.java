package com.bytedance.android.livesdk.livesetting.highlight;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_highlight_music_client_enable")
public final class LiveReplayHighlightMusicClientEnableList {
    public static final String[] DEFAULT;
    public static final LiveReplayHighlightMusicClientEnableList INSTANCE = new LiveReplayHighlightMusicClientEnableList();
    public static final String[] value;

    static {
        String[] strArr = {"1", "2", "3", "4", "5"};
        DEFAULT = strArr;
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue("live_replay_highlight_music_client_enable", strArr);
        if (stringArrayValue != null) {
            strArr = stringArrayValue;
        }
        value = strArr;
    }

    public static final boolean enable(int i) {
        return C13LQ.LJIILLIIL(String.valueOf(i), value);
    }
}
