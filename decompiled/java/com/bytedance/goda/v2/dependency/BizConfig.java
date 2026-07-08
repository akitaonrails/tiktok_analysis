package com.bytedance.goda.v2.dependency;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BizConfig {
    public static final BizConfig LIZ = new BizConfig("none", "none", 0, null);

    @C09CT("basic_track_params")
    public final n basicTrackParams;

    @C09CT("biz")
    public final String biz;

    @C09CT("btm_track_mode")
    public final Integer btmTrackMode;

    @C09CT("container")
    public final String container;

    public BizConfig(String str, String str2, Integer num, n nVar) {
        this.biz = str;
        this.container = str2;
        this.btmTrackMode = num;
        this.basicTrackParams = nVar;
    }
}
