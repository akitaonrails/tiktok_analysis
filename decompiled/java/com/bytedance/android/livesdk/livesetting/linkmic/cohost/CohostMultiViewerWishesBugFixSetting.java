package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_multi_viewer_wishes_bug_fix_setting")
public final class CohostMultiViewerWishesBugFixSetting {
    public static final boolean DEFAULT = true;
    public static final CohostMultiViewerWishesBugFixSetting INSTANCE = new CohostMultiViewerWishesBugFixSetting();

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_multi_viewer_wishes_bug_fix_setting", DEFAULT);
    }
}
