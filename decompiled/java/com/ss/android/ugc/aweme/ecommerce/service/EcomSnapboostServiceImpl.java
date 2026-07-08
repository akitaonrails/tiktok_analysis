package com.ss.android.ugc.aweme.ecommerce.service;

import X.C13040058k;
import X.C1489405sK;
import X.C23250099c;
import X.C817503Hh;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomSnapboostServiceImpl implements IEcomSnapboostService {
    public final ConcurrentHashMap<String, Unit> LIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSnapboostService
    public final boolean LIZIZ(String str) {
        return !this.LIZ.containsKey(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSnapboostService
    public final void LIZJ(String str) {
        this.LIZ.put(str, Unit.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomSnapboostService
    public final void LIZ(long j, C1489405sK c1489405sK, String str, String str2) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C13040058k(str, str2, j, c1489405sK, null), 3);
    }
}
