package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class c2 extends u9<String> {
    public c2(List<C1507240pKE> list) {
        super(ha.CookieCheck, list);
    }

    @Override // ttpobfuscated.u9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(xc xcVar, Request.Http http) {
        return ((ng) http.h.getValue()).b(d(xcVar, n()));
    }
}
