package com.ss.android.ugc.aweme.main.preload;

import X.AbstractC738140SxQ;
import X.InterfaceC725550Sd7;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;

/* JADX INFO: loaded from: classes25.dex */
public final class ShopDotAssemPreloader implements InterfaceC725550Sd7<AbstractC738140SxQ> {
    @Override // X.InterfaceC725550Sd7
    public final AbstractC738140SxQ LIZ() {
        IShopIconService iShopIconServiceLIZ;
        IMallServiceManager iMallServiceManagerLIZIZ = MallServiceManager.LIZIZ();
        if (iMallServiceManagerLIZIZ == null || (iShopIconServiceLIZ = iMallServiceManagerLIZIZ.LIZ()) == null) {
            return null;
        }
        return iShopIconServiceLIZ.LIZ();
    }
}
