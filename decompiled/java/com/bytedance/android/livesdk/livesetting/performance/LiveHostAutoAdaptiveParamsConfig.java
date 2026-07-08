package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostAutoAdaptiveParamsConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("detect_face_interval_ime")
    public int detectFaceIntervalTime;

    @C09CT("online_audience_rank_refresh_interval_time")
    public long onlineAudienceRankRefreshIntervalTime;

    @C09CT("public_screen_refresh_interval_time")
    public int publicScreenRefreshIntervalTime;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveHostAutoAdaptiveParamsConfig_OptTypeAdapter();
    }

    public LiveHostAutoAdaptiveParamsConfig() {
        this(100, 2000, 2L);
    }

    public final int getDetectFaceIntervalTime() {
        return this.detectFaceIntervalTime;
    }

    public final long getOnlineAudienceRankRefreshIntervalTime() {
        return this.onlineAudienceRankRefreshIntervalTime;
    }

    public final int getPublicScreenRefreshIntervalTime() {
        return this.publicScreenRefreshIntervalTime;
    }

    public final void setDetectFaceIntervalTime(int i) {
        this.detectFaceIntervalTime = i;
    }

    public final void setOnlineAudienceRankRefreshIntervalTime(long j) {
        this.onlineAudienceRankRefreshIntervalTime = j;
    }

    public final void setPublicScreenRefreshIntervalTime(int i) {
        this.publicScreenRefreshIntervalTime = i;
    }

    public LiveHostAutoAdaptiveParamsConfig(int i, int i2, long j) {
        this.detectFaceIntervalTime = i;
        this.publicScreenRefreshIntervalTime = i2;
        this.onlineAudienceRankRefreshIntervalTime = j;
    }
}
