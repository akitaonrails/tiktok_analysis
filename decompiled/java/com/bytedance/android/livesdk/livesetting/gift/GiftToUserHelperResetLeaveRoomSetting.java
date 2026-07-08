package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_to_user_helper_reset_leave_room")
public final class GiftToUserHelperResetLeaveRoomSetting {
    public static final boolean DEFAULT = true;
    public static final GiftToUserHelperResetLeaveRoomSetting INSTANCE = new GiftToUserHelperResetLeaveRoomSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_to_user_helper_reset_leave_room", DEFAULT);
    }
}
