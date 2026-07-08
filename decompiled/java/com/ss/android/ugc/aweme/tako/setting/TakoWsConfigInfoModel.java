package com.ss.android.ugc.aweme.tako.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoWsConfigInfoModel {

    @C09CT("enable_ws_connected")
    public final boolean enableConnection;

    @C09CT("keep_alive_time_interval")
    public final long keepAliveTimeInterval;

    public TakoWsConfigInfoModel() {
        this(false, 0L);
    }

    public TakoWsConfigInfoModel(boolean z, long j) {
        this.enableConnection = z;
        this.keepAliveTimeInterval = j;
    }
}
