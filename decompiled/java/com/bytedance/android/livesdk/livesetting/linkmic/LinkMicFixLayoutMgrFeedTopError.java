package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_layout_mgr_feed_top_error")
public final class LinkMicFixLayoutMgrFeedTopError {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixLayoutMgrFeedTopError INSTANCE = new LinkMicFixLayoutMgrFeedTopError();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_layout_mgr_feed_top_error", DEFAULT);
    }
}
