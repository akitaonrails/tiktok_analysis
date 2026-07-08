package com.ss.android.ugc.aweme.checkout.service;

import X.C04TD;
import X.C1385505bZ;
import X.InterfaceC1364105Vn;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.checkout.model.ShopifyCheckoutTokenResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ShopifyCheckoutTokenService implements IShopifyCheckoutTokenService {
    public static IShopifyCheckoutTokenService LIZ() {
        Object objLIZ = C04TD.LIZ(IShopifyCheckoutTokenService.class, false);
        if (objLIZ != null) {
            return (IShopifyCheckoutTokenService) objLIZ;
        }
        if (C04TD.LLJI == null) {
            synchronized (IShopifyCheckoutTokenService.class) {
                if (C04TD.LLJI == null) {
                    C04TD.LLJI = new ShopifyCheckoutTokenService();
                }
            }
        }
        return C04TD.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.checkout.service.IShopifyCheckoutTokenService
    public final Object getShopifyCheckoutToken(String str, InterfaceC1364105Vn<? super ShopifyCheckoutTokenResponse> interfaceC1364105Vn) {
        ShopifyCheckoutTokenApi.LIZ.getClass();
        return ((ShopifyCheckoutTokenApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1385505bZ.LIZIZ).build().retrofit.LIZ(ShopifyCheckoutTokenApi.class)).getShopifyCheckoutToken(str, interfaceC1364105Vn);
    }
}
