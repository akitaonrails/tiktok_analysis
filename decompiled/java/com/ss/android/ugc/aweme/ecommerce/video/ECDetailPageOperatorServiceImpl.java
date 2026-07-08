package com.ss.android.ugc.aweme.ecommerce.video;

import X.C1768506wF;
import X.InterfaceC1255404vg;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.ecommerce.video.settings.ECVideoListOperatorWhiteList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ECDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        C1768506wF c1768506wF = new C1768506wF(5);
        map.put("from_ttmall_homepage", c1768506wF);
        map.put("from_order_center", c1768506wF);
        map.put("from_ecom_search", c1768506wF);
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig = ECVideoListOperatorWhiteList.LIZ;
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig2 = (ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_video_list_operator_white_list", ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig.class, eCVideoListOperatorWhiteListConfig);
        if (eCVideoListOperatorWhiteListConfig2 != null) {
            eCVideoListOperatorWhiteListConfig = eCVideoListOperatorWhiteListConfig2;
        }
        Iterator<String> it2 = eCVideoListOperatorWhiteListConfig.fromWhiteList.iterator();
        while (it2.hasNext()) {
            map.put(it2.next(), c1768506wF);
        }
        return map;
    }
}
