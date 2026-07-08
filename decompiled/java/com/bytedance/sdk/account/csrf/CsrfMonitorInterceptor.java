package com.bytedance.sdk.account.csrf;

import X.C01GW;
import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.C1974107oJ;
import X.C2188811AlT;
import X.C452501pT;
import X.C837540WtM;
import X.C838780WvM;
import X.C838810WvP;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class CsrfMonitorInterceptor implements InterfaceC1904907d9 {
    public static final CsrfMonitorInterceptor LL = new CsrfMonitorInterceptor();
    public static final HashMap<String, String> LLILLJJLI = new HashMap<>();
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C838810WvP());

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String str;
        String str2;
        boolean z;
        String str3;
        Method method;
        String name;
        boolean zLJFF;
        String str4;
        boolean z2;
        String str5;
        String str6;
        Class<?> declaringClass;
        C080U c080u;
        String str7;
        C080U c080u2;
        C080U c080u3;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        String path = UriProtector.parse(request.getUrl()).getPath();
        if (path != null && a0.LJJIIZI(path, "/passport/", false) && ((Boolean) LLILLL.getValue()).booleanValue()) {
            Uri uri = UriProtector.parse(request.getUrl());
            HashMap<String, String> map = LLILLJJLI;
            map.clear();
            map.put("host", uri.getHost());
            map.put("path", uri.getPath());
            List<C080U> listHeaders = request.headers("Referer");
            String str8 = "";
            if (listHeaders == null || (c080u3 = (C080U) ListProtector.get(listHeaders, 0)) == null || (str = c080u3.LIZIZ) == null) {
                str = "";
            }
            map.put("request_referer", str);
            List<C080U> listHeaders2 = request.headers("User-Agent");
            if (listHeaders2 == null || (c080u2 = (C080U) ListProtector.get(listHeaders2, 0)) == null || (str2 = c080u2.LIZIZ) == null) {
                str2 = "";
            }
            map.put("request_user_agent", str2);
            List<C080U> listHeaders3 = request.headers("x-tt-passport-csrf-token");
            if (listHeaders3 != null && (c080u = (C080U) ListProtector.get(listHeaders3, 0)) != null && (str7 = c080u.LIZIZ) != null) {
                str8 = str7;
            }
            if (str8.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            String str9 = "1";
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("has_csrf_in_header", str3);
            C1974107oJ c1974107oJ = (C1974107oJ) request.tag(C1974107oJ.class);
            String name2 = null;
            if (c1974107oJ != null) {
                method = c1974107oJ.LIZ;
            } else {
                method = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (method != null && (declaringClass = method.getDeclaringClass()) != null) {
                name = declaringClass.getName();
            } else {
                name = null;
            }
            sbLIZ.append(name);
            sbLIZ.append('#');
            if (method != null) {
                name2 = method.getName();
            }
            sbLIZ.append(name2);
            map.put("invocation_name", C2188811AlT.LIZIZ(sbLIZ));
            if (Intrinsics.LJFF(request.getMethod(), "GET")) {
                try {
                    zLJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "account_sdk_source"), "app");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    zLJFF = false;
                }
            } else {
                List<?> list = c1974107oJ.LIZIZ;
                if (list != null) {
                    Iterator<?> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (next instanceof Map) {
                            if (next != null) {
                                zLJFF = Intrinsics.LJFF(((HashMap) next).get("account_sdk_source"), "app");
                            }
                        }
                    }
                    zLJFF = false;
                } else {
                    zLJFF = false;
                }
            }
            HashMap<String, String> map2 = LLILLJJLI;
            if (zLJFF) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("from_accountsdk", str4);
            C0X52<?> c0x52LIZ = c1494590ozp.LIZ(request);
            List<C080U> list2 = c0x52LIZ.LIZ.LIZLLL;
            ArrayList<C080U> arrayList = new ArrayList();
            for (C080U c080u4 : list2) {
                if (Intrinsics.LJFF(c080u4.LIZ, "set-cookie")) {
                    arrayList.add(c080u4);
                }
            }
            for (C080U c080u5 : arrayList) {
                if (a0.LJJIIZI(c080u5.LIZIZ, "passport_csrf_token", false) || a0.LJJIIZI(c080u5.LIZIZ, "passport_csrf_token_default", false)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            HashMap<String, String> map3 = LLILLJJLI;
            if (z2) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            map3.put("has_csrf_in_set_cookie", str5);
            String strLIZ = C838780WvM.LIZ(request.getUrl(), "CsrfMonitorInterceptor");
            if (strLIZ.length() > 0) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            map3.put("has_csrf_in_cookie", str6);
            boolean zLJFF2 = Intrinsics.LJFF(str8, strLIZ);
            if (!zLJFF2) {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            map3.put("request_csrf_token_match", str9);
            if (!zLJFF) {
                TTAccountInit.LIZ().getClass();
                new C837540WtM().LIZ("passport_request_bypassed_sdk", new JSONObject(map3));
            }
            if (z2) {
                TTAccountInit.LIZ().getClass();
                new C837540WtM().LIZ("passport_csrf_token_update", new JSONObject(map3));
            } else if (!zLJFF2 || str8.length() == 0) {
                TTAccountInit.LIZ().getClass();
                new C837540WtM().LIZ("passport_csrf_token_error", new JSONObject(map3));
            }
            TTAccountInit.LIZ().getClass();
            new C837540WtM().LIZ("passport_request", new JSONObject(map3));
            return c0x52LIZ;
        }
        return c1494590ozp.LIZ(request);
    }
}
