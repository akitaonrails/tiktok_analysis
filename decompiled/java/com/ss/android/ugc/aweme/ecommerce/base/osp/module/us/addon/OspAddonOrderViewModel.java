package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon;

import X.C00HV;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OspAddonOrderViewModel extends AssemViewModel<C00HV> {
    public final Map<String, Map<String, Object>> LL = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C00HV(0);
    }

    public final void vQ2(String str, HashMap map) {
        String string;
        Map map2 = (Map) ((LinkedHashMap) this.LL).get(str);
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                map.put(key, string);
            }
        }
    }
}
