package ttpobfuscated;

import X.C1507240pKE;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class r6 extends v9 {
    public r6(List<C1507240pKE> list) {
        super(ha.HasPath, list);
    }

    @Override // ttpobfuscated.v9
    public tc a(xc xcVar, Request.Http http) {
        boolean z;
        if (((ng) http.h.getValue()).getPath().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return a(z);
    }
}
