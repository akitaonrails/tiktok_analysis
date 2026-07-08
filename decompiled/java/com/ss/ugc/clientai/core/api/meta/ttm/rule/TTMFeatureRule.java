package com.ss.ugc.clientai.core.api.meta.ttm.rule;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class TTMFeatureRule {

    @C09CT("aggregatedId")
    public final String aggregatedId;

    @C09CT("aggregatedParamAlias")
    public final String aggregatedParamAlias;

    @C09CT("cacheType")
    public final String cacheType;

    @C09CT("diskCacheInternal")
    public final int diskCacheInternal;

    @C09CT("elimination")
    public final EliminationRule elimination;

    @C09CT("forceUpdate")
    public final boolean forceUpdate;

    @C09CT("streams")
    public final List<EventRule> streams;

    @C09CT("uidOpen")
    public final boolean uidOpen;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public final int hashCode() {
        int iHashCode = ((((((((this.aggregatedId.hashCode() * 31) + this.elimination.hashCode()) * 31) + this.streams.hashCode()) * 31) + this.cacheType.hashCode()) * 31) + this.diskCacheInternal) * 31;
        String str = this.aggregatedParamAlias;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.forceUpdate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((iHashCode2 + r0) * 31) + (this.uidOpen ? 1 : 0);
    }

    public TTMFeatureRule(String str, EliminationRule eliminationRule, List<EventRule> list, String str2, int i, String str3, boolean z, boolean z2) {
        this.aggregatedId = str;
        this.elimination = eliminationRule;
        this.streams = list;
        this.cacheType = str2;
        this.diskCacheInternal = i;
        this.aggregatedParamAlias = str3;
        this.forceUpdate = z;
        this.uidOpen = z2;
    }
}
