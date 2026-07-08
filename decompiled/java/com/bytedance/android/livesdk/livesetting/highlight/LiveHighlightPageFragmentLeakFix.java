package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_highlight_page_fragment_leak_fix")
public final class LiveHighlightPageFragmentLeakFix {
    public static final boolean DEFAULT = true;
    public static final LiveHighlightPageFragmentLeakFix INSTANCE = new LiveHighlightPageFragmentLeakFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_highlight_page_fragment_leak_fix", DEFAULT);
    }
}
