package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class n6 extends v9 {
    public n6(List<C1507240pKE> list) {
        super(ha.HasFragment, list);
    }

    @Override // ttpobfuscated.v9
    public tc a(xc xcVar, Request.Http http) {
        boolean z;
        if (((ng) http.h.getValue()).f().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return a(z);
    }
}
