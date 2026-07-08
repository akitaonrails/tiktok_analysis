package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_preview_card_mpd_entrances")
public final class LivePreviewMPDEntranceSetting {
    public static final LivePreviewMPDEntranceSetting INSTANCE = new LivePreviewMPDEntranceSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getEntrances() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_preview_card_mpd_entrances", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isContains(String str) {
        return C13LQ.LJIILLIIL(str, getEntrances());
    }
}
