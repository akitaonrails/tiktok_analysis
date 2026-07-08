package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_effect_observe_live_room_event_setting")
public final class GiftEffectObserveLiveRoomEventSetting {
    public static final GiftEffectObserveLiveRoomEventSetting INSTANCE = new GiftEffectObserveLiveRoomEventSetting();
    public static final int DEFAULT = 3;
    public static final int value = SettingsManager.INSTANCE.getIntValue("gift_effect_observe_live_room_event_setting", 3);

    public final boolean enable() {
        return value > 0;
    }

    public final boolean isEnableAnchorSide() {
        return (value & 1) == 1;
    }

    public final boolean isEnableViewerSide() {
        return (value & 2) == 2;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
