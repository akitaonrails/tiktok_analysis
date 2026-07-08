package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchLayoutIds {
    public static final TypeAdapter ADAPTER;

    @C09CT("1vn")
    public long match1vNLayoutId;

    @C09CT("nv1")
    public long matchNv1LayoutId;

    @C09CT("nvn_crop")
    public long matchNvNCropLayoutId;

    @C09CT("nvn")
    public long matchNvNLayoutId;

    static {
        NormalGson.singleton();
        ADAPTER = new MatchLayoutIds_OptTypeAdapter();
    }

    public MatchLayoutIds() {
        this(2002L, 200201L, 2030L, 2031L);
    }

    public MatchLayoutIds(long j, long j2, long j3, long j4) {
        this.matchNvNLayoutId = j;
        this.matchNvNCropLayoutId = j2;
        this.match1vNLayoutId = j3;
        this.matchNv1LayoutId = j4;
    }
}
