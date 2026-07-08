package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class ub extends u9<Integer> {
    public ub(List<C1507240pKE> list) {
        super(ha.QueryParamCount, list);
    }

    @Override // ttpobfuscated.u9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(xc xcVar, Request.Http http) {
        return Integer.valueOf(((ng) http.h.getValue()).i());
    }
}
