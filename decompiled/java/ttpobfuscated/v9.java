package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public abstract class v9 extends o7 {
    public abstract tc a(xc xcVar, Request.Http http);

    public v9(ha haVar, List<C1507240pKE> list) {
        super(haVar, list);
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        Request request = ccVar.b;
        if (request instanceof Request.Http) {
            return a(xcVar, (Request.Http) request);
        }
        return tc.Undefined;
    }
}
