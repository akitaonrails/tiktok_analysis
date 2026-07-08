package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveSdkMultiGuestMonitorConfig {
    public static final TypeAdapter ADAPTER = new LiveSdkMultiGuestMonitorConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("compatible_version")
    public int compatibleVersion;

    @C09CT("enable_android")
    public boolean enable;

    @C09CT("exception_room_msg_gap")
    public int exceptionRoomMsgGap;

    @C09CT("time_out")
    public long timeOUt;

    public LiveSdkMultiGuestMonitorConfig() {
        this(true, 60L, 2650, 3);
    }

    public LiveSdkMultiGuestMonitorConfig(boolean z, long j, int i, int i2) {
        this.enable = z;
        this.timeOUt = j;
        this.compatibleVersion = i;
        this.exceptionRoomMsgGap = i2;
    }
}
