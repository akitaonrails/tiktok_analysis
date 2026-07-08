package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_custom_watch_fix_list")
public final class LinkMicCustomWatchEnableList {
    public static final LinkMicCustomWatchEnableList INSTANCE = new LinkMicCustomWatchEnableList();
    public static final String[] DEFAULT = new String[0];

    public final boolean enable(String str) {
        return C13LQ.LJIILLIIL(str, SettingsManager.INSTANCE.getStringArrayValue("link_mic_custom_watch_fix_list", DEFAULT));
    }
}
