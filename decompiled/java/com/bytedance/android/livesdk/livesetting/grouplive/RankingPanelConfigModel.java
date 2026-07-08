package com.bytedance.android.livesdk.livesetting.grouplive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class RankingPanelConfigModel {
    public static final TypeAdapter ADAPTER;

    @C09CT("max_visible_members")
    public int maxVisibleMembers;

    @C09CT("throttle_interval_duration")
    public long throttleIntervalDuration;

    static {
        NormalGson.singleton();
        ADAPTER = new RankingPanelConfigModel_OptTypeAdapter();
    }

    public RankingPanelConfigModel() {
        this(3, -1L);
    }

    public RankingPanelConfigModel(int i, long j) {
        this.maxVisibleMembers = i;
        this.throttleIntervalDuration = j;
    }
}
