package com.ss.android.ugc.aweme.ecommerce.ug.landing;

import X.C1315005Cq;
import X.C23250099c;
import X.C817503Hh;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgLandingService implements IEcUgLandingService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.landing.IEcUgLandingService
    public final void LIZ() {
        if (!Intrinsics.LJFF(LandMallProtocol.LLILLJJLI, Boolean.TRUE) || LandMallProtocol.LLILLL) {
            return;
        }
        LandMallProtocol.LLILLL = true;
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1315005Cq(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.landing.IEcUgLandingService
    public final boolean LIZIZ() {
        return Intrinsics.LJFF(LandMallProtocol.LLILLJJLI, Boolean.TRUE);
    }
}
