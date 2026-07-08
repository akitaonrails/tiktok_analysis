package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.C1008603wy;
import X.C1507790pL7;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class EcommerceStoreTechLogServiceImpl implements IEcommerceStoreTechLogService {
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService
    public final void LIZ(String str, String str2, String str3, Map map, boolean z) throws JSONException {
        map.put("is_self", Integer.valueOf(z ? 1 : 0));
        C1008603wy.LIZIZ(map, "author_id", str);
        C1008603wy.LIZIZ(map, "enter_from", str2);
        map.put("subpage_name", str3);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZ("rd_tiktokec_enter_page", map);
    }
}
