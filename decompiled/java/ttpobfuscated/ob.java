package ttpobfuscated;

import X.AnonymousClass0957;
import X.C01GW;
import X.C1507240pKE;
import java.util.List;
import ttpobfuscated.z5;

/* JADX INFO: loaded from: classes24.dex */
public final class ob extends x0 {
    public final C01GW<AnonymousClass0957<jg>> n;

    /* JADX WARN: Multi-variable type inference failed */
    public ob(List<C1507240pKE> list, C01GW<? extends AnonymousClass0957<jg>> c01gw) {
        super(ha.PropertyCheck, list);
        this.n = c01gw;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) throws Throwable {
        String strA;
        String strD = d(xcVar, n());
        z5.d dVar = z5.a;
        v3.s.getClass();
        z5 z5VarA = dVar.a(strD, v3.u, ccVar, this.n);
        if (z5VarA != null && (strA = z5VarA.a()) != null) {
            return this.m.a(strA, xcVar.a(o(), this.i, this.m.b()));
        }
        return tc.Undefined;
    }
}
