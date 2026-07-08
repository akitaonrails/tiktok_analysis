package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class l6 extends v9 {
    public l6(List<C1507240pKE> list) {
        super(ha.HasCookieName, list);
    }

    @Override // ttpobfuscated.v9
    public tc a(xc xcVar, Request.Http http) {
        return a(((ng) http.h.getValue()).b(c(xcVar)));
    }
}
