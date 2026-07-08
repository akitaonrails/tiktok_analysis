package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveMessageSampleRatio {
    public static final TypeAdapter ADAPTER;

    @C09CT("base_ratio")
    public long baseRatio;

    @C09CT("device_ratio")
    public long deviceRatio;

    @C09CT("msg_ratio")
    public long msgRatio;

    @C09CT("user_ratio")
    public long userRatio;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMessageSampleRatio_OptTypeAdapter();
    }

    public LiveMessageSampleRatio() {
        this(0L, 0L, 0L, 1000L);
    }

    public final long getBaseRatio() {
        return this.baseRatio;
    }

    public final long getDeviceRatio() {
        return this.deviceRatio;
    }

    public final long getMsgRatio() {
        return this.msgRatio;
    }

    public final long getUserRatio() {
        return this.userRatio;
    }

    public final void setBaseRatio(long j) {
        this.baseRatio = j;
    }

    public final void setDeviceRatio(long j) {
        this.deviceRatio = j;
    }

    public final void setMsgRatio(long j) {
        this.msgRatio = j;
    }

    public final void setUserRatio(long j) {
        this.userRatio = j;
    }

    public LiveMessageSampleRatio(long j, long j2, long j3, long j4) {
        this.msgRatio = j;
        this.deviceRatio = j2;
        this.userRatio = j3;
        this.baseRatio = j4;
    }
}
