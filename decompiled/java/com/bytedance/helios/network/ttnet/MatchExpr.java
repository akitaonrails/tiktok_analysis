package com.bytedance.helios.network.ttnet;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class MatchExpr {

    @C09CT("allow")
    public boolean allow;

    @C09CT("exprs")
    public String[] exprs;

    @C09CT("match")
    public int match;

    @C09CT("scope")
    public int scope;

    public MatchExpr(int i, String[] strArr, int i2, boolean z) {
        this.scope = i;
        this.exprs = strArr;
        this.match = i2;
        this.allow = z;
    }
}
