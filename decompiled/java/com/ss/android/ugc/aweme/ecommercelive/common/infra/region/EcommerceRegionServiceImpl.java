package com.ss.android.ugc.aweme.ecommercelive.common.infra.region;

import X.C21192217wW;
import X.C2222691Bz1;
import X.EnumC21186317vZ;
import X.EnumC21189117w1;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class EcommerceRegionServiceImpl implements IEcommerceRegionService {
    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService
    public final boolean isUS() {
        IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
        return (iECommerceRegionService == null || !iECommerceRegionService.LIZLLL()) ? C21192217wW.LIZ().usRegions.contains(C2222691Bz1.LIZ().toLowerCase(Locale.getDefault())) : Intrinsics.LJFF(iECommerceRegionService.LIZJ(Boolean.TRUE), EnumC21186317vZ.US.getValue());
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService
    public final EnumC21189117w1 region() {
        IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
        return (iECommerceRegionService == null || !iECommerceRegionService.isEnable()) ? isUS() ? EnumC21189117w1.US : EnumC21189117w1.SEA : isUS() ? EnumC21189117w1.US : LIZIZ(Boolean.TRUE) ? EnumC21189117w1.SEA : EnumC21189117w1.US;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService
    public final boolean LIZ() {
        return C21192217wW.LIZ().f64switch;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService
    public final String LIZJ() {
        return C2222691Bz1.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService
    public final boolean LIZIZ(Boolean bool) {
        IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
        if (iECommerceRegionService != null && iECommerceRegionService.LIZLLL()) {
            return Intrinsics.LJFF(iECommerceRegionService.LIZJ(bool), EnumC21186317vZ.SEA.getValue());
        }
        return C21192217wW.LIZ().seaRegions.contains(C2222691Bz1.LIZ().toLowerCase(Locale.getDefault()));
    }
}
