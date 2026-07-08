package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_mic_room_has_moderator_ability")
public final class MultiGuestMicRoomHasModeratorAbilitySetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestMicRoomHasModeratorAbilitySetting INSTANCE = new MultiGuestMicRoomHasModeratorAbilitySetting();

    public final boolean noAbility(boolean z) {
        if (z && !SettingsManager.INSTANCE.getBooleanValue("multi_guest_mic_room_has_moderator_ability", DEFAULT)) {
            return true;
        }
        return false;
    }
}
