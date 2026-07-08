package com.ss.android.ugc.aweme.compliance.common.serviceimpl;

import X.C01GW;
import X.C0TVF;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C824560WWg;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.HydrogenInterceptor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class HydrogenServiceImpl implements IHydrogenService {
    public boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(107));

    @Override // com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService
    public final void LIZ(List<? extends C0TVF> list) {
        if (!this.LIZ) {
            this.LIZIZ.getValue().getClass();
            for (C0TVF c0tvf : list) {
                HashMap<String, String> map = C824560WWg.LIZ;
                Map<String, String> config = c0tvf.getConfig();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(config.size()));
                Iterator<T> it2 = config.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://hyd_action/");
                    sbLIZ.append((String) entry.getKey());
                    linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
                }
                map.putAll(linkedHashMap);
            }
            HydrogenInterceptor hydrogenInterceptor = new HydrogenInterceptor();
            hydrogenInterceptor.setRewriteMap(C824560WWg.LIZ);
            SmartRouter.addInterceptor(hydrogenInterceptor);
            this.LIZ = true;
        }
    }
}
