package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class ScientificLongAdapter implements j<Long> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.j
    public final Long deserialize(k kVar, Type type, i iVar) {
        String string;
        Long l;
        if (!(kVar instanceof m)) {
            try {
                string = kVar.LJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                string = kVar.toString();
            }
            try {
                Long lValueOf = Long.valueOf(new BigDecimal(string).longValue());
                C189200o6.m2constructorimpl(lValueOf);
                l = lValueOf;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C098200Yq c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
                l = c098200Yq;
            }
            if (!C189200o6.m7isFailureimpl(l)) {
                return l;
            }
        }
        return 0L;
    }
}
