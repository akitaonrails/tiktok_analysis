package com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_decoration_audience_hide_native_board")
public final class LiveDecorationAudienceHideNativeBoard {
    public static final boolean DEFAULT = false;
    public static final LiveDecorationAudienceHideNativeBoard INSTANCE = new LiveDecorationAudienceHideNativeBoard();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_decoration_audience_hide_native_board", DEFAULT);
    }
}
