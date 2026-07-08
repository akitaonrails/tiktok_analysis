package com.ss.android.ugc.aweme.ecommerce.ug.service;

import X.C1059860dge;
import X.C1529870puj;
import X.C1741890vQh;
import X.C1766550w4T;
import X.C1AF0;
import X.C2188811AlT;
import X.C2211621BhA;
import X.C2211641BhC;
import X.C2513009t2;
import X.InterfaceC1052500dUm;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEComRouterHandlerInternalService;
import com.ss.android.ugc.aweme.ecommerce.ug.settings.XOpenHookConfigModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgXOpenHandler implements IEComRouterHandlerInternalService {
    public static void LIZIZ(C1059860dge c1059860dge, String str) {
        List<String> list;
        InterfaceC1052500dUm interfaceC1052500dUm;
        String strLIZ;
        View view;
        C2211621BhA.LIZ.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LJ;
        if (c2211641BhC != null && c2211641BhC.LJJIIZ) {
            XOpenHookConfigModel xOpenHookConfigModel = C1766550w4T.LIZ;
            String strLIZIZ = c2211641BhC.LIZIZ();
            List<String> list2 = C1766550w4T.LIZ.btmPageCodeList;
            if (list2 != null && list2.contains(strLIZIZ)) {
                return;
            }
        }
        if (C2513009t2.LIZ && (list = C1766550w4T.LIZ.schemaAllowList) != null && !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(str, it2.next(), false)) {
                    if (c1059860dge != null && (interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class)) != null && (strLIZ = interfaceC1052500dUm.LIZ()) != null) {
                        C1529870puj.LIZ.getClass();
                        Object objLJFF = C1529870puj.LJFF(strLIZ);
                        String strLJIIIIZZ = null;
                        if ((objLJFF instanceof View) && (view = (View) objLJFF) != null) {
                            C2211621BhA.LIZ.getClass();
                            C2211641BhC c2211641BhCLIZLLL = C2211621BhA.LIZLLL(view, null);
                            if (c2211641BhCLIZLLL != null && c2211641BhCLIZLLL.LJJIIZ) {
                                XOpenHookConfigModel xOpenHookConfigModel2 = C1766550w4T.LIZ;
                                String strLIZIZ2 = c2211641BhCLIZLLL.LIZIZ();
                                List<String> list3 = C1766550w4T.LIZ.btmPageCodeList;
                                if (list3 != null && list3.contains(strLIZIZ2)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("hookBtmForAutoOpen: ");
                                    ConcurrentHashMap<String, String> concurrentHashMap = c2211641BhCLIZLLL.LJJJ;
                                    if (concurrentHashMap != null) {
                                        strLJIIIIZZ = C1741890vQh.LJIIIIZZ(concurrentHashMap);
                                    }
                                    sbLIZ.append(strLJIIIIZZ);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    C2211621BhA.LJ = c2211641BhCLIZLLL;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComRouterHandlerInternalService
    public final void LIZ(String str, Context context, C1059860dge c1059860dge) {
        try {
            LIZIZ(c1059860dge, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcUgXOpenHandler.handle error: ");
            sbLIZ.append(th.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
