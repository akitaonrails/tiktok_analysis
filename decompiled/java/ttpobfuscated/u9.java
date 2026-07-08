package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public abstract class u9<T> extends x0 {
    public abstract T a(xc xcVar, Request.Http http);

    public T a(xc xcVar, Request.WebRouter webRouter) {
        return null;
    }

    public u9(ha haVar, List<C1507240pKE> list) {
        super(haVar, list);
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        Request request = ccVar.b;
        if (request instanceof Request.Http) {
            T tA = a(xcVar, (Request.Http) request);
            if (tA == null) {
                return tc.Undefined;
            }
            return this.m.a(tA, xcVar.a(o(), this.i, this.m.b()));
        }
        if (request instanceof Request.WebRouter) {
            T tA2 = a(xcVar, (Request.WebRouter) request);
            if (tA2 == null) {
                return tc.Undefined;
            }
            return this.m.a(tA2, xcVar.a(o(), this.i, this.m.b()));
        }
        return tc.Undefined;
    }
}
