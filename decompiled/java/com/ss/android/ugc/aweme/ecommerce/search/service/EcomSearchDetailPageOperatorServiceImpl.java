package com.ss.android.ugc.aweme.ecommerce.search.service;

import X.C0R4K;
import X.InterfaceC1255404vg;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        map.put("goods_search", new C0R4K(6));
        map.put("from_top_products_card", new C0R4K(7));
        map.put("from_ecom_search_inflow_v2", new C0R4K(8));
        return map;
    }
}
