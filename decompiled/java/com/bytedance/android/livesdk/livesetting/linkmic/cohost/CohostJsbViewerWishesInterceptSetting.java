package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("cohost_jsb_viewer_wishes_intercept_setting")
public final class CohostJsbViewerWishesInterceptSetting {
    public static final boolean DEFAULT = true;
    public static final CohostJsbViewerWishesInterceptSetting INSTANCE = new CohostJsbViewerWishesInterceptSetting();

    public static final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_jsb_viewer_wishes_intercept_setting", DEFAULT);
    }
}
