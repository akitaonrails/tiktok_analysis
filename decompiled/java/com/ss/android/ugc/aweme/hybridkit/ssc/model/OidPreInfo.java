package com.ss.android.ugc.aweme.hybridkit.ssc.model;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class OidPreInfo {

    @C09CT("from_pv_ratio")
    public final Double fromPvRatio;

    @C09CT("from_uv_ratio")
    public final Double fromUvRatio;

    @C09CT("oid")
    public final String oid;

    @C09CT("to_pv_ratio")
    public final Double toPvRatio;

    @C09CT("to_uv_ratio")
    public final Double toUvRatio;

    public OidPreInfo(String str, Double d, Double d2, Double d3, Double d4) {
        this.oid = str;
        this.fromPvRatio = d;
        this.fromUvRatio = d2;
        this.toPvRatio = d3;
        this.toUvRatio = d4;
    }
}
