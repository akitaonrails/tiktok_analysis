package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class c7 extends u9<String> {
    public c7(List<C1507240pKE> list) {
        super(ha.HeaderCheck, list);
    }

    @Override // ttpobfuscated.u9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(xc xcVar, Request.Http http) {
        return ((ng) http.h.getValue()).c(d(xcVar, n()));
    }
}
