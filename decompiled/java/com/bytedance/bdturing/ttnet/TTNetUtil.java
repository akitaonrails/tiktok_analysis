package com.bytedance.bdturing.ttnet;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494230ozF;
import X.C1494590ozp;
import X.C1515120pWw;
import X.InterfaceC1494070oyz;
import X.InterfaceC1904907d9;
import X.InterfaceC2202708k5;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class TTNetUtil {
    public static void LIZ() {
        final HashMap map = new HashMap();
        map.put("x-vc-bdturing-sdk-version", "2.4.2.i18n");
        C1515120pWw.LIZIZ(new InterfaceC1904907d9() { // from class: com.bytedance.bdturing.ttnet.TTNetUtil.1
            @Override // X.InterfaceC1904907d9
            public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
                C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
                Request request = c1494590ozp.LIZJ;
                LinkedList linkedList = new LinkedList();
                linkedList.addAll(request.getHeaders());
                for (String str : map.keySet()) {
                    linkedList.add(new C080U(str, (String) map.get(str)));
                }
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ = linkedList;
                return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
            }
        });
    }

    public static void LIZIZ() {
        InterfaceC2202708k5 interfaceC2202708k5 = new InterfaceC2202708k5() { // from class: X.08k4
        };
        InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
        synchronized (C1494230ozF.class) {
            C1494230ozF.LJIILLIIL = interfaceC2202708k5;
        }
    }

    public static List<C080U> LIZJ(Map<String, String> map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (String str : map.keySet()) {
                linkedList.add(new C080U(str, map.get(str)));
            }
        }
        return linkedList;
    }

    public static Map<String, String> LIZLLL(List<C080U> list) {
        HashMap map = new HashMap();
        for (C080U c080u : list) {
            map.put(c080u.LIZ, c080u.LIZIZ);
        }
        return map;
    }
}
