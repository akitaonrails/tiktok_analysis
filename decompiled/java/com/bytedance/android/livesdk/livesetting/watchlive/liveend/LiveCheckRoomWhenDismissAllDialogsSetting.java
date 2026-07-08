package com.bytedance.android.livesdk.livesetting.watchlive.liveend;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_check_room_when_dismiss_all_dialogs")
public final class LiveCheckRoomWhenDismissAllDialogsSetting {
    public static final LiveCheckRoomWhenDismissAllDialogsSetting INSTANCE = new LiveCheckRoomWhenDismissAllDialogsSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_check_room_when_dismiss_all_dialogs", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
