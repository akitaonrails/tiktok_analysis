package ttpobfuscated;

import X.AnonymousClass0957;
import X.C01GW;
import X.C1507240pKE;
import java.util.List;
import ttpobfuscated.z5;

/* JADX INFO: loaded from: classes24.dex */
public final class u6 extends o7 {
    public final C01GW<AnonymousClass0957<jg>> m;

    public final String d(xc xcVar) {
        return " \"" + c(xcVar) + '\"';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u6(List<C1507240pKE> list, C01GW<? extends AnonymousClass0957<jg>> c01gw) {
        super(ha.HasProperty, list);
        this.m = c01gw;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) throws Throwable {
        String strA;
        String strC = c(xcVar);
        z5.d dVar = z5.a;
        v3.s.getClass();
        z5 z5VarA = dVar.a(strC, v3.u, ccVar, this.m);
        if (z5VarA != null) {
            strA = z5VarA.a();
        } else {
            strA = null;
        }
        return a(strA);
    }
}
