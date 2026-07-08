package com.ss.android.ugc.aweme.ecommercelive.common.infra.region.network;

import X.C098200Yq;
import X.C0XLO;
import X.C0XS7;
import X.C1336330ksZ;
import X.C1499330p7T;
import X.C189200o6;
import X.C718040SEo;
import X.EnumC21192017wU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.IEcomResponseHandler;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public final class ECRegionSyncHandler implements IEcomResponseHandler {
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        try {
            C0XLO c0xlo = c0xs7.LIZIZ;
            if (!C1336330ksZ.LIZLLL(c0xlo.LIZLLL, c0xlo.LJFF.LIZ())) {
                return;
            }
            IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
            if (iECommerceRegionService != null && iECommerceRegionService.isEnable() && c0xs7.LIZIZ()) {
                String strLIZ = c0xs7.LIZIZ.LJFF.LIZ();
                String strLIZJ = c0xs7.LJ.LIZJ("x-ttec-content-code-region");
                String strLIZJ2 = c0xs7.LJ.LIZJ("X-Tt-Logid");
                if (strLIZJ != null) {
                    iECommerceRegionService.LJI(EnumC21192017wU.ECOM_API, strLIZJ, strLIZJ2, strLIZ);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
