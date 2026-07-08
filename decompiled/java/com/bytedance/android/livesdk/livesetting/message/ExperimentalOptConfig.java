package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class ExperimentalOptConfig {
    public static final TypeAdapter ADAPTER = new ExperimentalOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enter_room_limit_dispatch_duration")
    public EnterRoomLimitDispatchDurationConfig enterRoomLimitDispatchDuration = new EnterRoomLimitDispatchDurationConfig();

    @C09CT("enter_room_change_window_time")
    public EnterRoomChangeWindowTimeConfig enterRoomChangeWindowTime = new EnterRoomChangeWindowTimeConfig();

    public final EnterRoomChangeWindowTimeConfig getEnterRoomChangeWindowTime() {
        return this.enterRoomChangeWindowTime;
    }

    public final EnterRoomLimitDispatchDurationConfig getEnterRoomLimitDispatchDuration() {
        return this.enterRoomLimitDispatchDuration;
    }

    public final void setEnterRoomChangeWindowTime(EnterRoomChangeWindowTimeConfig enterRoomChangeWindowTimeConfig) {
        this.enterRoomChangeWindowTime = enterRoomChangeWindowTimeConfig;
    }

    public final void setEnterRoomLimitDispatchDuration(EnterRoomLimitDispatchDurationConfig enterRoomLimitDispatchDurationConfig) {
        this.enterRoomLimitDispatchDuration = enterRoomLimitDispatchDurationConfig;
    }
}
