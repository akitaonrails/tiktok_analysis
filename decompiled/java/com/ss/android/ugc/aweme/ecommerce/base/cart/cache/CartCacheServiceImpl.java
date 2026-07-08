package com.ss.android.ugc.aweme.ecommerce.base.cart.cache;

import X.C04TD;
import X.C1742190vRB;
import com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CartCacheServiceImpl implements ICartCacheService {
    public static ICartCacheService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ICartCacheService.class, false);
        if (objLIZ != null) {
            return (ICartCacheService) objLIZ;
        }
        if (C04TD.LLLZLL == null) {
            synchronized (ICartCacheService.class) {
                if (C04TD.LLLZLL == null) {
                    C04TD.LLLZLL = new CartCacheServiceImpl();
                }
            }
        }
        return C04TD.LLLZLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService
    public final String LIZIZ() {
        C1742190vRB.LIZ.getClass();
        return C1742190vRB.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService
    public final void LIZ(String str) {
        C1742190vRB.LIZ.getClass();
        C1742190vRB.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService
    public final boolean LIZJ(String str) {
        return Intrinsics.LJFF(str, "cart_cache");
    }
}
