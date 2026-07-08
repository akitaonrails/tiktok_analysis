package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_follow_page_preview_guide")
public final class LiveFollowingPagePreviewGuideExp {
    public static final long DEFAULT = 0;
    public static final LiveFollowingPagePreviewGuideExp INSTANCE = new LiveFollowingPagePreviewGuideExp();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_follow_page_preview_guide", DEFAULT);
    }
}
