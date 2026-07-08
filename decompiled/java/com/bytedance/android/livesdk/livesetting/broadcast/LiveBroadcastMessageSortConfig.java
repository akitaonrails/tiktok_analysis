package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBroadcastMessageSortConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("sort_priority")
    public String sortPriority;

    @C09CT("sort_type")
    public int sortType;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveBroadcastMessageSortConfig_OptTypeAdapter();
    }

    public LiveBroadcastMessageSortConfig() {
        this(0, "");
    }

    public final String getSortPriority() {
        return this.sortPriority;
    }

    public final int getSortType() {
        return this.sortType;
    }

    public final void setSortPriority(String str) {
        this.sortPriority = str;
    }

    public final void setSortType(int i) {
        this.sortType = i;
    }

    public LiveBroadcastMessageSortConfig(int i, String str) {
        this.sortType = i;
        this.sortPriority = str;
    }
}
