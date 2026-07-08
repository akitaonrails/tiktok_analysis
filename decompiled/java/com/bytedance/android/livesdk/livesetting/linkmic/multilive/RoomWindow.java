package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class RoomWindow {
    public static final TypeAdapter ADAPTER;

    @C09CT("times")
    public long allUsersTimeWindow;

    @C09CT("count")
    public long totalMaxTimes;

    static {
        NormalGson.singleton();
        ADAPTER = new RoomWindow_OptTypeAdapter();
    }

    public RoomWindow() {
        this(3600L, 100L);
    }

    public RoomWindow(long j, long j2) {
        this.allUsersTimeWindow = j;
        this.totalMaxTimes = j2;
    }
}
