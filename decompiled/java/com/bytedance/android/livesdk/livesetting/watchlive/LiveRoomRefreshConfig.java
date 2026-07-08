package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRoomRefreshConfig {
    public static final TypeAdapter ADAPTER = new LiveRoomRefreshConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("check_distance")
    public int distance;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_enhance")
    public boolean enableEnhance;

    @C09CT("enable_nr")
    public boolean enableNR;

    @C09CT("enable_mark_del_opt")
    public boolean enableNoStreamMark;

    @C09CT("enable_poll_check")
    public boolean enablePoll;

    @C09CT("enable_reg_opt")
    public boolean enableRegisterOpt;

    @C09CT("end_index")
    public int endIndex;

    @C09CT("start_index")
    public int startIndex;

    public LiveRoomRefreshConfig() {
        this(40, 20, false, 1, true, false, true, false, true);
    }

    public LiveRoomRefreshConfig(int i, int i2, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.startIndex = i;
        this.endIndex = i2;
        this.enable = z;
        this.distance = i3;
        this.enablePoll = z2;
        this.enableNR = z3;
        this.enableNoStreamMark = z4;
        this.enableRegisterOpt = z5;
        this.enableEnhance = z6;
    }
}
