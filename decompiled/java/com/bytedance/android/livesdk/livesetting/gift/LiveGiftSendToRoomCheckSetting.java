package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_send_to_room_check")
public final class LiveGiftSendToRoomCheckSetting {
    public static final int DATA_CHANNEL_BLOCK_ANY = 3;
    public static final int DATA_CHANNEL_BLOCK_CHECK_ANCHOR = 2;
    public static final int DEFAULT = 0;
    public static final int GLOBAL_BLOCK_ANY = 5;
    public static final int GLOBAL_BLOCK_CHECK_ANCHOR = 4;
    public static final LiveGiftSendToRoomCheckSetting INSTANCE = new LiveGiftSendToRoomCheckSetting();
    public static final int SCAN = 1;

    public final boolean dataChannelBlockAny() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 3;
    }

    public final boolean dataChannelBlockCheckAnchor() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 2;
    }

    public final boolean globalBlockAny() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 5;
    }

    public final boolean globalBlockCheckAnchor() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 4;
    }

    public final boolean skip() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 0;
    }
}
