package com.bytedance.touchpoint.data.interceptor;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C01U6;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1619720sFe;
import X.C1893930zNv;
import X.C20484080s;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.touchpoint.data.experiment.AppInstalledAssembleInfo;
import com.bytedance.touchpoint.data.experiment.IncentiveDiversionAppInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS152S1100000_3;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class DiversionOtherAppInstalledInfo implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        AbstractC1896090zRP abstractC1896090zRP;
        Context contextLJIIJJI;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        IncentiveDiversionAppInfo incentiveDiversionAppInfo = C1893930zNv.LIZ;
        String path = requestLIZ.getPath();
        if (path != null && path.length() != 0) {
            C01GW c01gw = C1893930zNv.LIZIZ;
            List<String> list = ((IncentiveDiversionAppInfo) c01gw.getValue()).pathList;
            if (list != null && !list.isEmpty()) {
                Iterator<String> it2 = ((IncentiveDiversionAppInfo) c01gw.getValue()).pathList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (a0.LJJIIZI(path, it2.next(), false)) {
                        C01GW c01gw2 = C1893930zNv.LIZIZ;
                        Map<String, String> map = ((IncentiveDiversionAppInfo) c01gw2.getValue()).config;
                        if (map != null && !map.isEmpty() && (abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0)) != null && (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) != null) {
                            ArrayList arrayList = new ArrayList();
                            Map<String, String> map2 = ((IncentiveDiversionAppInfo) c01gw2.getValue()).config;
                            if (map2 != null) {
                                for (Map.Entry<String, String> entry : map2.entrySet()) {
                                    arrayList.add(new AppInstalledAssembleInfo(entry.getKey(), ((Boolean) C01U6.LJ(new AwS152S1100000_3(contextLJIIJJI, entry.getValue(), 10), Boolean.FALSE)).booleanValue() ? 1 : 0));
                                }
                            }
                            String strLIZJ = C20484080s.LIZJ(arrayList);
                            if (strLIZJ != null && strLIZJ.length() != 0) {
                                String url = requestLIZ.getUrl();
                                try {
                                    url = UriProtector.parse(url).buildUpon().appendQueryParameter("app_installed", strLIZJ).toString();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
                                c0xmbNewBuilder.LIZJ(url);
                                requestLIZ = c0xmbNewBuilder.LIZ();
                            }
                        }
                    }
                }
            }
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
