package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C080U;
import X.C0W8M;
import X.C0WOT;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1798060wtI;
import X.C2097608Jq;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.i18n.region.RegionManager;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class RegionParamInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Map<String, String> mapLJ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        if (!C0W8M.LIZJ("RegionParamInterceptor", c1494590ozp.LIZJ.getUrl())) {
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        Request request = c1494590ozp.LIZJ;
        C1798060wtI c1798060wtI = C1798060wtI.LIZ;
        RegionManager regionManager = C1798060wtI.LIZJ;
        if (C1798060wtI.LIZIZ() && regionManager != null) {
            mapLJ = regionManager.LJIILIIL;
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        request.getPath();
        if (!mapLJ.isEmpty()) {
            ArrayList arrayList = new ArrayList(request.getHeaders());
            for (Map.Entry<String, String> entry : mapLJ.entrySet()) {
                arrayList.add(new C080U(entry.getKey(), entry.getValue()));
            }
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ = arrayList;
            Request requestLIZ = c0xmbNewBuilder.LIZ();
            C0WOT.LIZ(requestLIZ, c1494590ozp.LIZJ, "RegionParamInterceptor");
            return c1494590ozp.LIZ(requestLIZ);
        }
        C0WOT.LIZ(request, c1494590ozp.LIZJ, "RegionParamInterceptor");
        return c1494590ozp.LIZ(request);
    }
}
