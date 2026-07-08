package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_enable_sticky_send_gift_event")
public final class LiveGiftEnableStickySendGiftEvent {
    public static final int DEFAULT = 0;
    public static final LiveGiftEnableStickySendGiftEvent INSTANCE = new LiveGiftEnableStickySendGiftEvent();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_enable_sticky_send_gift_event", DEFAULT);
    }

    public final boolean isEnsureGiftWidgetLoadedEnabled() {
        return (getValue() & 2) == 2;
    }

    public final boolean isStickyEventEnabled() {
        return (getValue() & 1) == 1;
    }
}
