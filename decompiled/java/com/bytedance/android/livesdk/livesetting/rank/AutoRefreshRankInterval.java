package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class AutoRefreshRankInterval {
    public static final TypeAdapter ADAPTER;

    @C09CT("hourly_ranklist_interval")
    public int hourly_rank;

    @C09CT("weekly_ranklist_interval")
    public int weekly_rank;

    static {
        NormalGson.singleton();
        ADAPTER = new AutoRefreshRankInterval_OptTypeAdapter();
    }

    public AutoRefreshRankInterval() {
        this(5, 5);
    }

    public AutoRefreshRankInterval(int i, int i2) {
        this.hourly_rank = i;
        this.weekly_rank = i2;
    }
}
