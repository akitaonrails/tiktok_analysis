package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveInnerPrePullStreamConfigData {
    public static final TypeAdapter ADAPTER;

    @C09CT("alive_time_for_pre_pull_stream")
    public int aliveTimeForPrePullStream;

    @C09CT("alive_time_for_pre_pull_stream_of_first_room")
    public int aliveTimeForPrePullStreamOfFirstRoom;

    @C09CT("delay_time_for_pre_pull_stream")
    public int delayTimeForPrePullStream;

    @C09CT("delay_time_for_pre_pull_stream_of_first_room")
    public int delayTimeForPrePullStreamOfFirstRoom;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveInnerPrePullStreamConfigData_OptTypeAdapter();
    }

    public LiveInnerPrePullStreamConfigData() {
        this(-1, -1, -1, -1);
    }

    public LiveInnerPrePullStreamConfigData(int i, int i2, int i3, int i4) {
        this.delayTimeForPrePullStream = i;
        this.delayTimeForPrePullStreamOfFirstRoom = i2;
        this.aliveTimeForPrePullStream = i3;
        this.aliveTimeForPrePullStreamOfFirstRoom = i4;
    }
}
