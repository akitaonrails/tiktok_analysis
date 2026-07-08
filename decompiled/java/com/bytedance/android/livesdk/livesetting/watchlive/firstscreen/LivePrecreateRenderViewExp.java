package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_precreate_renderview_exp")
public final class LivePrecreateRenderViewExp {
    public static final int ALL = 3;
    public static final int DEFAULT = 0;
    public static final LivePrecreateRenderViewExp INSTANCE = new LivePrecreateRenderViewExp();
    public static final int PREVIEW_CARD = 1;
    public static final int ROOM = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_precreate_renderview_exp", DEFAULT);
    }

    public final boolean enablePreviewCard() {
        return (getValue() & 1) == 1;
    }

    public final boolean enableRoom() {
        return (getValue() & 2) == 2;
    }
}
