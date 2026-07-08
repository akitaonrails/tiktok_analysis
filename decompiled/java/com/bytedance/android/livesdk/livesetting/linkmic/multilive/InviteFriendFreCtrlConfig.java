package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class InviteFriendFreCtrlConfig {
    public static final TypeAdapter ADAPTER = new InviteFriendFreCtrlConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("room_window")
    public RoomWindow roomWindow;

    @C09CT("friend_window")
    public long singleUserTimeWindow;

    public InviteFriendFreCtrlConfig() {
        this(new RoomWindow(3600L, 100L), 180L);
    }

    public InviteFriendFreCtrlConfig(RoomWindow roomWindow, long j) {
        this.roomWindow = roomWindow;
        this.singleUserTimeWindow = j;
    }
}
