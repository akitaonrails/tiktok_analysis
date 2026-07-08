package com.ss.ugc.clientai.core.api.meta.ttm.rule;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes36.dex */
public final class EliminationRule {

    @C09CT("eliminationName")
    public final String eliminationName;

    @C09CT("lastN")
    public final int lastN;

    @C09CT("lastTime")
    public final long lastTime;

    @C09CT("natureDay")
    public final boolean natureDay;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        int iY2 = ((((this.lastN * 31) + C786410Ut5.Y2(this.lastTime)) * 31) + this.eliminationName.hashCode()) * 31;
        boolean z = this.natureDay;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iY2 + r0;
    }

    public EliminationRule(int i, long j, String str, boolean z) {
        this.lastN = i;
        this.lastTime = j;
        this.eliminationName = str;
        this.natureDay = z;
    }
}
