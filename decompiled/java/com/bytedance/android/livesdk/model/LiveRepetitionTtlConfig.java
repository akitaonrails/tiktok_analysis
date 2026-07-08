package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRepetitionTtlConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("ttlive_close_page_recommend_ttl")
    public long closePage;

    @C09CT("ttlive_default_ttl")
    public long defaultTtl;

    @C09CT("ttlive_drawer_one_ttl")
    public long drawerOneTtl;

    @C09CT("ttlive_drawer_two_ttl")
    public long drawerTwoTtl;

    @C09CT("enable_live_petition_show")
    public long enableLivePetitionShow;

    @C09CT("ttlive_foru_card_ttl")
    public long foruCardTtl;

    @C09CT("ttlive_foru_head_ttl")
    public long foruHeadTtl;

    @C09CT("ttlive_live_bottom_tab_ttl")
    public long liveBottomTabTtl;

    @C09CT("ttlive_live_square_ttl")
    public long liveSquareTtl;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveRepetitionTtlConfig_OptTypeAdapter();
    }
}
