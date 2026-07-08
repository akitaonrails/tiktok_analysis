package com.ss.android.ugc.aweme.ecommerce.mall.customdot.state;

import X.EnumC1768940w8K;

/* JADX INFO: loaded from: classes27.dex */
public final class FetchReachCfgFlag {
    public final Boolean ignoreTabShow;
    public final String lastReachFailReason;
    public final boolean needFetch;
    public final EnumC1768940w8K reachRequestReason;

    public FetchReachCfgFlag(boolean z, EnumC1768940w8K enumC1768940w8K, String str, Boolean bool) {
        this.needFetch = z;
        this.reachRequestReason = enumC1768940w8K;
        this.lastReachFailReason = str;
        this.ignoreTabShow = bool;
    }
}
