package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceRtcParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("msg_strategy_delay_release_timer")
    public long msgStrategyDelayReleaseTimer;

    @C09CT("msg_strategy_heart_beat_time_out")
    public long msgStrategyHeartBeatTimeOut;

    @C09CT("msg_strategy_heart_beat_timer")
    public long msgStrategyHeartBeatTimer;

    @C09CT("msg_strategy_resend_time_out")
    public long msgStrategyResendTimeOut;

    @C09CT("sei_timer")
    public long seiTimer;

    static {
        NormalGson.singleton();
        ADAPTER = new GameDualDeviceRtcParams_OptTypeAdapter();
    }

    public GameDualDeviceRtcParams() {
        this(15L, 3L, 6L, 5L, 3L);
    }

    public GameDualDeviceRtcParams(long j, long j2, long j3, long j4, long j5) {
        this.msgStrategyHeartBeatTimeOut = j;
        this.msgStrategyResendTimeOut = j2;
        this.msgStrategyDelayReleaseTimer = j3;
        this.msgStrategyHeartBeatTimer = j4;
        this.seiTimer = j5;
    }
}
