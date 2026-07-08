package com.ss.android.ugc.aweme.ecommerce.sec;

import X.C01GW;
import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C13LP;
import X.C1494590ozp;
import X.C19304810fm;
import X.C20163213uw;
import X.C20163313ux;
import X.C20163513uz;
import X.C452501pT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomSecInterceptor implements InterfaceC1904907d9 {
    public String LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C20163213uw());

    public static void LIZ(LinkedList linkedList) {
        if (C20163313ux.LIZ.abBtm) {
            String str = C20163513uz.LIZIZ.LIZJ.get();
            if (str.length() <= 0) {
                C20163513uz.LIZ.getClass();
                if (C20163513uz.LIZJ.length() > 0) {
                    str = C20163513uz.LIZJ;
                } else {
                    str = "";
                }
            }
            linkedList.add(new C080U("OEC-CS-EGL", str));
        }
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        C19304810fm.LIZ.getClass();
        EcomCsSdkModel ecomCsSdkModel = C19304810fm.LIZIZ;
        if (ecomCsSdkModel.csInterceptorMode == 1) {
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            Request request = c1494590ozp.LIZJ;
            Uri uri = UriProtector.parse(request.getUrl());
            String host = uri.getHost();
            String path = uri.getPath();
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(request.getHeaders());
            if (!ecomCsSdkModel.csPreInit) {
                linkedList.add(new C080U("oec-cs-si-a", "1"));
            } else {
                linkedList.add(new C080U("oec-cs-si-a", "2"));
            }
            String str = this.LL;
            if (str == null || str.length() == 0) {
                this.LL = C20163513uz.LIZJ();
            }
            linkedList.add(new C080U("oec-cs-sdk-version", this.LL));
            if (ecomCsSdkModel.allSigned) {
                linkedList.add(new C080U("x-tt-oec-opaque-enable", "1"));
                linkedList.add(new C080U("oec-cs-si-b", "1"));
                LIZ(linkedList);
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ = linkedList;
                return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
            }
            Object obj = ((Map) this.LLILLJJLI.getValue()).get("*");
            if ((obj instanceof Map) && (map4 = (Map) obj) != null && LIZIZ(path, map4)) {
                linkedList.add(new C080U("x-tt-oec-opaque-enable", "1"));
                linkedList.add(new C080U("oec-cs-si-b", "1"));
                LIZ(linkedList);
                C0XMB c0xmbNewBuilder2 = request.newBuilder();
                c0xmbNewBuilder2.LIZJ = linkedList;
                return c1494590ozp.LIZ(c0xmbNewBuilder2.LIZ());
            }
            Object obj2 = ((Map) this.LLILLJJLI.getValue()).get(host);
            if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null && LIZIZ(path, map3)) {
                linkedList.add(new C080U("x-tt-oec-opaque-enable", "1"));
                linkedList.add(new C080U("oec-cs-si-b", "1"));
                LIZ(linkedList);
                C0XMB c0xmbNewBuilder3 = request.newBuilder();
                c0xmbNewBuilder3.LIZJ = linkedList;
                return c1494590ozp.LIZ(c0xmbNewBuilder3.LIZ());
            }
            C0XMB c0xmbNewBuilder4 = request.newBuilder();
            c0xmbNewBuilder4.LIZJ = linkedList;
            return c1494590ozp.LIZ(c0xmbNewBuilder4.LIZ());
        }
        C1494590ozp c1494590ozp2 = (C1494590ozp) interfaceC841770X0l;
        Request request2 = c1494590ozp2.LIZJ;
        Uri uri2 = UriProtector.parse(request2.getUrl());
        String host2 = uri2.getHost();
        String path2 = uri2.getPath();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAll(request2.getHeaders());
        linkedList2.add(new C080U("x-tt-oec-opaque-enable", "1"));
        C0XMB c0xmbNewBuilder5 = request2.newBuilder();
        c0xmbNewBuilder5.LIZJ = linkedList2;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20163513uz.LIZIZ(101, e.getClass().getSimpleName());
        }
        if (ecomCsSdkModel.allSigned) {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(c0xmbNewBuilder5.LIZ());
        }
        Object obj3 = ecomCsSdkModel.whitelist.get("*");
        if ((obj3 instanceof Map) && (map2 = (Map) obj3) != null && LIZIZ(path2, map2)) {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(c0xmbNewBuilder5.LIZ());
        }
        Object obj4 = ecomCsSdkModel.whitelist.get(host2);
        if ((obj4 instanceof Map) && (map = (Map) obj4) != null && LIZIZ(path2, map)) {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(c0xmbNewBuilder5.LIZ());
        }
        return c1494590ozp2.LIZ(request2);
    }

    public static boolean LIZIZ(String str, Map map) {
        Number number;
        List list;
        try {
            Object obj = map.get("signed_type");
            Set setLLIIJI = null;
            if (obj instanceof Number) {
                number = (Number) obj;
            } else {
                number = null;
            }
            Object obj2 = map.get("signed_path");
            if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof String) {
                        arrayList.add(obj3);
                    }
                }
                setLLIIJI = C13LP.LLIIJI(arrayList);
            }
            if (number != null) {
                int iIntValue = number.intValue();
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        if (iIntValue == 3 && setLLIIJI != null && !C13LP.LJJJJ(str, setLLIIJI)) {
                            return true;
                        }
                        return false;
                    }
                    if (setLLIIJI == null || !C13LP.LJJJJ(str, setLLIIJI)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20163513uz.LIZIZ(103, th.getClass().getSimpleName());
            return false;
        }
    }
}
