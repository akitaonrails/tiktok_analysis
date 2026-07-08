package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceInvitingConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("game_dual_device_inviting_interval")
    public int gameDualDeviceInvitingInterval;

    @C09CT("game_dual_device_inviting_time")
    public int gameDualDeviceInvitingTime;

    static {
        NormalGson.singleton();
        ADAPTER = new GameDualDeviceInvitingConfig_OptTypeAdapter();
    }

    public GameDualDeviceInvitingConfig() {
        this(5, 30);
    }

    public GameDualDeviceInvitingConfig(int i, int i2) {
        this.gameDualDeviceInvitingInterval = i;
        this.gameDualDeviceInvitingTime = i2;
    }
}
