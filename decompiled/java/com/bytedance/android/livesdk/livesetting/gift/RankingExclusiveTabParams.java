package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class RankingExclusiveTabParams {
    public static final TypeAdapter ADAPTER = new RankingExclusiveTabParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("banner_transition_delay")
    public long bannerTransitionDelay;

    @C09CT("enable_sectioned_layout")
    public boolean enabled;

    @C09CT("max_anim_entry_count")
    public long maxAnimEntryCount;

    @C09CT("toast_display_duration")
    public long toastDisplayDuration;

    public RankingExclusiveTabParams() {
        this(false, 3L, 3L, 3L);
    }

    public RankingExclusiveTabParams(boolean z, long j, long j2, long j3) {
        this.enabled = z;
        this.maxAnimEntryCount = j;
        this.toastDisplayDuration = j2;
        this.bannerTransitionDelay = j3;
    }
}
