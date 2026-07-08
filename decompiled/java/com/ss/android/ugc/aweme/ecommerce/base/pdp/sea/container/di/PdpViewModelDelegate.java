package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di;

import X.C1023203zK;
import X.C1389880mGw;
import X.C893803eS;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpViewModelDelegate implements InterfaceC494301wD {
    public SeaPdpViewModel LL;

    public final boolean LIZIZ(SeaPdpFragment seaPdpFragment) {
        SeaPdpViewModel seaPdpViewModel = this.LL;
        if (seaPdpViewModel != null && seaPdpViewModel.LLLFFI) {
            View view = seaPdpFragment.getView();
            if (view != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(view);
                c1389880mGw.LJIIIZ(view.getContext().getString(2131832572));
                c1389880mGw.LJIIJ();
            }
            return true;
        }
        return false;
    }

    public static HashMap LIZ(SeaPdpViewModel seaPdpViewModel, boolean z, boolean z2) {
        String str;
        Object obj;
        PurchaseLimit purchaseLimit;
        Map<String, Object> mapLIZ;
        SkuPrice skuPrice;
        HashMap map = new HashMap();
        map.put("pdp_unique_id", seaPdpViewModel.LLLZZIL);
        if (z) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        map.put("button_type", str);
        map.put("is_clickable", C893803eS.LIZ(z));
        SkuItem skuItemIR2 = seaPdpViewModel.IR2();
        if (skuItemIR2 == null || (skuPrice = skuItemIR2.price) == null || (obj = skuPrice.discount) == null) {
            obj = 0;
        }
        map.put("discount_percentage", obj);
        C1023203zK c1023203zK = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
        if (productPackStruct != null) {
            purchaseLimit = productPackStruct.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        String skuId = seaPdpViewModel.getSkuId();
        c1023203zK.getClass();
        map.put("is_new_user_discount_limit1", C1023203zK.LIZ(purchaseLimit, skuId));
        if (z2 && (mapLIZ = seaPdpViewModel.XR2().LIZ()) != null) {
            map.putAll(mapLIZ);
        }
        return map;
    }
}
