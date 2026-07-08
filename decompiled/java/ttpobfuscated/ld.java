package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class ld extends u9<String> {
    public ld(List<C1507240pKE> list) {
        super(ha.SchemeCheck, list);
    }

    @Override // ttpobfuscated.u9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(xc xcVar, Request.Http http) {
        return ((ng) http.h.getValue()).k();
    }

    @Override // ttpobfuscated.u9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(xc xcVar, Request.WebRouter webRouter) {
        return ((ng) webRouter.g.getValue()).k();
    }
}
