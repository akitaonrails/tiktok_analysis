package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("viewer_wishes_fix_multi_layout_setting")
public final class LiveViewerWishesFixMultiLayoutSetting {
    public static final LiveViewerWishesFixMultiLayoutSetting INSTANCE = new LiveViewerWishesFixMultiLayoutSetting();
    public static final boolean DEFAULT = true;

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("viewer_wishes_fix_multi_layout_setting", DEFAULT);
    }
}
