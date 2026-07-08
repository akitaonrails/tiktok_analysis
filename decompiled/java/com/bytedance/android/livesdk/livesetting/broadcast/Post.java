package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class Post {
    public static final TypeAdapter ADAPTER;

    @C09CT("interval")
    public int interval;

    @C09CT("max_count")
    public int maxCount;

    static {
        NormalGson.singleton();
        ADAPTER = new Post_OptTypeAdapter();
    }

    public Post() {
        this(0, 0);
    }

    public final int getInterval() {
        return this.interval;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final void setMaxCount(int i) {
        this.maxCount = i;
    }

    public Post(int i, int i2) {
        this.maxCount = i;
        this.interval = i2;
    }
}
