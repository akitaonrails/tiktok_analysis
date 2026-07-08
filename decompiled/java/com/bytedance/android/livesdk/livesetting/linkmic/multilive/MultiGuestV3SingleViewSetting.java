package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("single_view_render_optimize")
public final class MultiGuestV3SingleViewSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3SingleViewSetting INSTANCE = new MultiGuestV3SingleViewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("single_view_render_optimize", DEFAULT);
    }
}
