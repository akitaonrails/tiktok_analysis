package ttpobfuscated;

import X.C13LP;
import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class tb extends u9<String> {
    public tb(List<C1507240pKE> list) {
        super(ha.QueryParamCheck, list);
    }

    @Override // ttpobfuscated.u9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(xc xcVar, Request.Http http) {
        List<String> listA = ((ng) http.h.getValue()).a(d(xcVar, n()));
        if (listA != null) {
            return (String) C13LP.LJJJLL(listA);
        }
        return null;
    }
}
