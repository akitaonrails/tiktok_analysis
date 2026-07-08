package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C13LQ;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_inner_feed_load_more_preload")
public final class LiveInnerFeedLoadMorePreload {
    public static final boolean DEFAULT = false;
    public static final boolean EXPERIMENT = true;
    public static final LiveInnerFeedLoadMorePreload INSTANCE = new LiveInnerFeedLoadMorePreload();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inner_feed_load_more_preload", DEFAULT);
    }

    public final boolean isSupport(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!getValue() || !C13LQ.LJIILLIIL(strLIZIZ, LiveInnerFeedLoadMorePreloadEntrances.INSTANCE.getValue())) {
            return false;
        }
        return true;
    }
}
