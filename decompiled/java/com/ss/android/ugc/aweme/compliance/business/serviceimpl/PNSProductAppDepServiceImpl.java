package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AbstractC1387200mCc;
import X.C1518680pcg;
import X.C1906580ziK;
import X.C737910Sx3;
import Y.AfS171S0100000_2;
import android.app.Activity;
import com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAppDepService;

/* JADX INFO: loaded from: classes3.dex */
public final class PNSProductAppDepServiceImpl implements IPNSProductAppDepService {
    @Override // com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAppDepService
    public final Activity getTopActivity() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
            return null;
        }
        return C737910Sx3.LIZIZ(activityLIZIZ);
    }

    @Override // com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAppDepService
    public final void LIZ(C1518680pcg c1518680pcg) {
        C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS171S0100000_2(c1518680pcg, 0));
    }
}
