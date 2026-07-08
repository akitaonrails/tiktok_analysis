package com.ss.android.ugc.aweme.service;

import X.C1556040qaw;
import X.C1574320r4Q;
import X.C1574580r4q;
import X.C1574690r51;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaJSBServiceImpl implements IDramaJSBService {
    @Override // com.ss.android.ugc.aweme.service.IDramaJSBService
    public final void LIZ(Map<String, ? extends Object> map) {
        String str;
        C1574320r4Q.LIZ.getClass();
        try {
            Object obj = ((HashMap) map).get("uniqueKey");
            if ((obj instanceof String) && (str = (String) obj) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Start syncing data for key=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C1574690r51.LIZ.getClass();
                if (C1574690r51.LIZ()) {
                    C1574580r4q.LIZIZ.LJFF(new C1556040qaw(str));
                    C1574320r4Q.LIZIZ(str, map);
                    C1574320r4Q.LIZLLL(str, map);
                } else {
                    C1574320r4Q.LIZ(str, map);
                    C1574320r4Q.LIZJ(str, map);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
