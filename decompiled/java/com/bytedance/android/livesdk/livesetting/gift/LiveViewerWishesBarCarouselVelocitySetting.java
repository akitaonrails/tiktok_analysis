package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("viewer_wishes_bar_carousel_velocity")
public final class LiveViewerWishesBarCarouselVelocitySetting {
    public static final int DEFAULT = 0;
    public static final LiveViewerWishesBarCarouselVelocitySetting INSTANCE = new LiveViewerWishesBarCarouselVelocitySetting();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("viewer_wishes_bar_carousel_velocity", DEFAULT) > 0;
    }

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("viewer_wishes_bar_carousel_velocity", DEFAULT);
    }
}
