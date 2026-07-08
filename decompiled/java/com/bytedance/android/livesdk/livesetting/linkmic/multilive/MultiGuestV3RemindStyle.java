package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enhance_sharing_revenue_perception")
public final class MultiGuestV3RemindStyle {
    public static final int DEFAULT = 0;
    public static final MultiGuestV3RemindStyle INSTANCE = new MultiGuestV3RemindStyle();
    public static final int NOT_SHOW_WHEN_ZERO = 1;
    public static final int SHOW_ANY = 3;
    public static final int SHOW_WHEN_ZERO = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enhance_sharing_revenue_perception", DEFAULT);
    }

    public final boolean enable() {
        return getValue() > 0;
    }
}
