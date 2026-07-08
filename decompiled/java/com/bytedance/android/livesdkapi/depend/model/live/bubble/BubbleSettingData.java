package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class BubbleSettingData implements Serializable {
    public static final TypeAdapter ADAPTER;

    @C09CT("cache_interval")
    public long cacheInterval;

    @C09CT("show_interval")
    public long showInterval;

    @C09CT("stay_interval")
    public long stayInterval;

    static {
        NormalGson.singleton();
        ADAPTER = new BubbleSettingData_OptTypeAdapter();
    }

    public BubbleSettingData() {
        this(0L, 0L, 0L);
    }

    public final long getCacheInterval() {
        return this.cacheInterval;
    }

    public final long getShowInterval() {
        return this.showInterval;
    }

    public final long getStayInterval() {
        return this.stayInterval;
    }

    public final void setCacheInterval(long j) {
        this.cacheInterval = j;
    }

    public final void setShowInterval(long j) {
        this.showInterval = j;
    }

    public final void setStayInterval(long j) {
        this.stayInterval = j;
    }

    public BubbleSettingData(long j, long j2, long j3) {
        this.showInterval = j;
        this.stayInterval = j2;
        this.cacheInterval = j3;
    }
}
