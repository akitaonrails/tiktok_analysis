package com.bytedance.helios.network.okhttp.impl;

import X.AbstractC842510X3h;
import X.AbstractC842530X3j;
import X.C098200Yq;
import X.C0WSW;
import X.C0WSX;
import X.C0X00;
import X.C0X0K;
import X.C0X0P;
import X.C0X0W;
import X.C0X0X;
import X.C0X1U;
import X.C0X1V;
import X.C0X33;
import X.C0XLP;
import X.C0XLQ;
import X.C0XLX;
import X.C0XLY;
import X.C13LQ;
import X.C1495510p1J;
import X.C1496660p3A;
import X.C1496670p3B;
import X.C1496690p3D;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import X.C259800zU;
import X.C823280WRi;
import X.C840660WyO;
import X.C840710WyT;
import X.C840750WyX;
import X.C840760WyY;
import X.C840970Wyt;
import X.EnumC847200XLi;
import X.InterfaceC1495580p1Q;
import X.InterfaceC1496620p36;
import X.InterfaceC836900WsK;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.consumer.OperateHistory;
import com.bytedance.helios.network.api.consumer.OperatePairs;
import com.bytedance.helios.network.api.service.IOkHttpService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.helios.network.okhttp.OkHttpMonitorInterceptor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS162S1100000_13;
import kotlin.jvm.internal.AwS414S0200000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public final class OkHttpServiceImpl implements IOkHttpService {
    public static final C0X0K Companion = new Object() { // from class: X.0X0K
    };
    public static final LruCache<String, Map<String, List<String>>> queryLruCache = new LruCache<>(100);
    public static final LruCache<String, Map<String, String>> cookieLruCache = new LruCache<>(100);

    private final Request getRequestObj(C840660WyO c840660WyO) {
        Object obj;
        C840710WyT c840710WyT = c840660WyO.LIZ;
        Object[] objArr = c840710WyT.LIZ.LJFF;
        if (objArr != null) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        C840970Wyt c840970Wyt = c840710WyT.LJJIFFI;
        if (c840970Wyt.LIZJ) {
            Object obj2 = c840970Wyt.LJ;
            if (obj2 instanceof Request) {
                return (Request) obj2;
            }
        }
        if (!(obj instanceof C0X0W)) {
            return null;
        }
        return ((C0X0W) obj).request();
    }

    private final C0XLY getResponseObj(C840660WyO c840660WyO) {
        Object objLJJIIZ;
        Object[] objArr = c840660WyO.LIZ.LIZ.LJFF;
        if (objArr != null) {
            objLJJIIZ = C13LQ.LJJIIZ(1, objArr);
        } else {
            objLJJIIZ = null;
        }
        if (!(objLJJIIZ instanceof C0XLY)) {
            return null;
        }
        return (C0XLY) objLJJIIZ;
    }

    private final boolean shouldReadReqBody(C0X0P c0x0p) {
        if (c0x0p == null) {
            return false;
        }
        String str = c0x0p.LIZIZ;
        String str2 = c0x0p.LIZJ;
        if ((!Intrinsics.LJFF(str, "application") || (!Intrinsics.LJFF(str2, "json") && !Intrinsics.LJFF(str2, "x-www-form-urlencoded"))) && (!Intrinsics.LJFF(str, "text") || !Intrinsics.LJFF(str2, "plain"))) {
            return false;
        }
        return true;
    }

    private final boolean shouldReadResBody(C0X0P c0x0p) {
        if (c0x0p == null) {
            return false;
        }
        String str = c0x0p.LIZIZ;
        String str2 = c0x0p.LIZJ;
        if (!Intrinsics.LJFF(str, "application") || !Intrinsics.LJFF(str2, "json")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void copyResponseBody(C840660WyO c840660WyO) {
        AbstractC842510X3h abstractC842510X3h;
        AbstractC842510X3h abstractC842510X3hCreate;
        C0XLY responseObj = getResponseObj(c840660WyO);
        if (responseObj != null && (abstractC842510X3h = responseObj.LLIZ) != null && shouldReadResBody(abstractC842510X3h.contentType())) {
            C0XLY responseObj2 = getResponseObj(c840660WyO);
            if (responseObj2 != null) {
                InterfaceC1496620p36 interfaceC1496620p36Source = responseObj2.LLIZ.source();
                interfaceC1496620p36Source.request(Long.MAX_VALUE);
                C1496690p3D c1496690p3DClone = interfaceC1496620p36Source.buffer().clone();
                if (c1496690p3DClone.LLILLJJLI > Long.MAX_VALUE) {
                    C1496690p3D c1496690p3D = new C1496690p3D();
                    c1496690p3D.LLFF(c1496690p3DClone, Long.MAX_VALUE);
                    c1496690p3DClone.LIZ();
                    c1496690p3DClone = c1496690p3D;
                }
                abstractC842510X3hCreate = AbstractC842510X3h.create(responseObj2.LLIZ.contentType(), c1496690p3DClone.LLILLJJLI, c1496690p3DClone);
            } else {
                abstractC842510X3hCreate = null;
            }
            c840660WyO.LJIILL = abstractC842510X3hCreate;
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getContentSubType(C840660WyO c840660WyO) {
        AbstractC842530X3j abstractC842530X3jBody;
        C0X0P c0x0pLIZIZ;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (abstractC842530X3jBody = requestObj.body()) != null && (c0x0pLIZIZ = abstractC842530X3jBody.LIZIZ()) != null) {
            return c0x0pLIZIZ.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getContentType(C840660WyO c840660WyO) {
        AbstractC842530X3j abstractC842530X3jBody;
        C0X0P c0x0pLIZIZ;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (abstractC842530X3jBody = requestObj.body()) != null && (c0x0pLIZIZ = abstractC842530X3jBody.LIZIZ()) != null) {
            return c0x0pLIZIZ.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, String> getCookies(C840660WyO c840660WyO) {
        String strHeader;
        HashMap map = new HashMap();
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (strHeader = requestObj.header("cookie")) != null) {
            Map<String, String> map2 = cookieLruCache.get(strHeader);
            if (map2 != null) {
                map.putAll(map2);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13((Map) map2, (Map<String, String>) strHeader, (String) 0), 2, null);
            } else {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strHeader, new String[]{";"}, 0, 6);
                HashMap map3 = new HashMap();
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    String[] strArr = (String[]) a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (strArr.length > 1) {
                        map3.put(strArr[0], strArr[1]);
                    }
                }
                cookieLruCache.put(strHeader, map3);
                map.putAll(map3);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13(strHeader, map3, 1), 2, null);
                return map;
            }
        }
        return map;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getDomain(C840660WyO c840660WyO) {
        C0XLQ c0xlqUrl;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (c0xlqUrl = requestObj.url()) != null) {
            return c0xlqUrl.LIZLLL;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getHeaders(C840660WyO c840660WyO) {
        C0X1V c0x1vHeaders;
        Map<String, List<String>> mapLJIIIZ;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null || (c0x1vHeaders = requestObj.headers()) == null || (mapLJIIIZ = c0x1vHeaders.LJIIIZ()) == null) {
            return new HashMap();
        }
        return mapLJIIIZ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getMethod(C840660WyO c840660WyO) {
        String strMethod;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (strMethod = requestObj.method()) != null) {
            return strMethod;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.IOkHttpService
    public Object getOkHttpCall(C840750WyX c840750WyX) {
        Object[] objArr = c840750WyX.LJFF;
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof C0X0W) {
                return ((C0X0W) obj).call();
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getPath(C840660WyO c840660WyO) {
        C0XLQ c0xlqUrl;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (c0xlqUrl = requestObj.url()) != null) {
            return c0xlqUrl.LJFF();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getQueries(C840660WyO c840660WyO) {
        C0XLQ c0xlqUrl;
        String str;
        List<String> list;
        Object obj;
        Map<String, List<String>> map;
        HashMap map2 = new HashMap();
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            c0xlqUrl = requestObj.url();
        } else {
            c0xlqUrl = null;
        }
        if (c0xlqUrl != null) {
            String str2 = c0xlqUrl.LJIIIIZZ;
            if (str2 != null && (map = queryLruCache.get(str2)) != null) {
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13((Map) map, (Map<String, String>) str2, (String) 2), 2, null);
                return map;
            }
            if (c0xlqUrl != null && (list = c0xlqUrl.LJI) != null) {
                int size = list.size() / 2;
                for (int i = 0; i < size; i++) {
                    if (c0xlqUrl != null) {
                        List<String> list2 = c0xlqUrl.LJI;
                        if (list2 != null) {
                            obj = ListProtector.get(list2, i * 2);
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        obj = null;
                    }
                    Object obj2 = "";
                    if (obj == null) {
                        obj = "";
                    }
                    if (c0xlqUrl != null) {
                        List<String> list3 = c0xlqUrl.LJI;
                        if (list3 != null) {
                            Object obj3 = ListProtector.get(list3, (i * 2) + 1);
                            if (obj3 != null) {
                                obj2 = obj3;
                            }
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    }
                    List arrayList = (List) map2.get(obj);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(obj2);
                    map2.put(obj, arrayList);
                }
            }
        }
        LruCache<String, Map<String, List<String>>> lruCache = queryLruCache;
        if (c0xlqUrl != null) {
            str = c0xlqUrl.LJIIIIZZ;
        } else {
            str = null;
        }
        lruCache.put(str, map2);
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
        C0WSW.LIZ("Helios:Network-Service", new AwS414S0200000_13(map2, (HashMap<String, List<String>>) c0xlqUrl, (C0XLQ) 1), 2, null);
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getRequestBody(X.C840660WyO r4) {
        /*
            r3 = this;
            okhttp3.Request r0 = r3.getRequestObj(r4)
            if (r0 == 0) goto L33
            X.0X3j r2 = r0.body()
            if (r2 == 0) goto L33
            X.0X0P r1 = r2.LIZIZ()
            boolean r0 = r3.shouldReadReqBody(r1)
            if (r0 == 0) goto L33
            if (r1 == 0) goto L22
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = X.C841650Wzz.LIZ
            java.nio.charset.Charset r0 = X.C841650Wzz.LIZIZ
            java.nio.charset.Charset r1 = r1.LIZ(r0)
            if (r1 != 0) goto L26
        L22:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = X.C841650Wzz.LIZ
            java.nio.charset.Charset r1 = X.C841650Wzz.LIZIZ
        L26:
            X.0p3D r0 = new X.0p3D
            r0.<init>()
            r2.LJ(r0)
            java.lang.String r0 = r0.LJJLIIIJILLIZJL(r1)
            return r0
        L33:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl.getRequestBody(X.0WyO):java.lang.String");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getRequestBodyBase64(C840660WyO c840660WyO) {
        Request requestObj;
        AbstractC842530X3j abstractC842530X3jBody;
        if (NetworkComponent.INSTANCE.isOfflineEnv() && (requestObj = getRequestObj(c840660WyO)) != null && (abstractC842530X3jBody = requestObj.body()) != null) {
            C1496690p3D c1496690p3D = new C1496690p3D();
            abstractC842530X3jBody.LJ(c1496690p3D);
            return Base64.encodeToString(c1496690p3D.LJZL(), 0);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public k getRequestBodyStruct(C840660WyO c840660WyO) {
        AbstractC842530X3j abstractC842530X3jBody;
        Object c098200Yq;
        k qVar;
        k qVar2;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (abstractC842530X3jBody = requestObj.body()) != null) {
            try {
                C0X0P c0x0pLIZIZ = abstractC842530X3jBody.LIZIZ();
                if (shouldReadReqBody(c0x0pLIZIZ)) {
                    if (Intrinsics.LJFF(c0x0pLIZIZ.LIZJ, "json")) {
                        C1496690p3D c1496690p3D = new C1496690p3D();
                        abstractC842530X3jBody.LJ(c1496690p3D);
                        return C0X00.LIZ(0, GsonProtectorUtils.parse(C0X00.LIZ, c1496690p3D.LJJIZ()));
                    }
                    if (Intrinsics.LJFF(c0x0pLIZIZ.LIZJ, "x-www-form-urlencoded")) {
                        if (abstractC842530X3jBody instanceof C0X0X) {
                            n nVar = new n();
                            int iLJI = ((C0X0X) abstractC842530X3jBody).LJI();
                            for (int i = 0; i < iLJI; i++) {
                                String strLJFF = ((C0X0X) abstractC842530X3jBody).LJFF(i);
                                String strLJIILIIL = C0XLQ.LJIILIIL(0, strLJFF.length(), strLJFF, true);
                                if (NetworkComponent.INSTANCE.isOfflineEnv()) {
                                    String str = (String) ListProtector.get(((C0X0X) abstractC842530X3jBody).LIZIZ, i);
                                    qVar2 = new q(C0XLQ.LJIILIIL(0, str.length(), str, true));
                                } else {
                                    qVar2 = m.LL;
                                }
                                nVar.LJJIFFI(strLJIILIIL, qVar2);
                            }
                            return nVar;
                        }
                        C1496690p3D c1496690p3D2 = new C1496690p3D();
                        abstractC842530X3jBody.LJ(c1496690p3D2);
                        String strLJJIZ = c1496690p3D2.LJJIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('?');
                        sbLIZ.append(strLJJIZ);
                        Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
                        n nVar2 = new n();
                        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                            if (NetworkComponent.INSTANCE.isOfflineEnv()) {
                                qVar = new q(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            } else {
                                qVar = m.LL;
                            }
                            nVar2.LJJIFFI(str2, qVar);
                        }
                        return nVar2;
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            C189200o6.m1boximpl(c098200Yq);
            return null;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResContentSubType(C840660WyO c840660WyO) {
        AbstractC842510X3h abstractC842510X3h;
        C0X0P c0x0pContentType;
        C0XLY responseObj = getResponseObj(c840660WyO);
        if (responseObj != null && (abstractC842510X3h = responseObj.LLIZ) != null && (c0x0pContentType = abstractC842510X3h.contentType()) != null) {
            return c0x0pContentType.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResContentType(C840660WyO c840660WyO) {
        AbstractC842510X3h abstractC842510X3h;
        C0X0P c0x0pContentType;
        C0XLY responseObj = getResponseObj(c840660WyO);
        if (responseObj != null && (abstractC842510X3h = responseObj.LLIZ) != null && (c0x0pContentType = abstractC842510X3h.contentType()) != null) {
            return c0x0pContentType.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResponseBody(C840660WyO c840660WyO) {
        Object obj = c840660WyO.LJIILL;
        String strLIZ = null;
        if (!(obj instanceof AbstractC842510X3h)) {
            return null;
        }
        C0XLY responseObj = getResponseObj(c840660WyO);
        if (responseObj != null) {
            strLIZ = responseObj.LIZ("Content-Encoding", "");
        }
        if (u.LJIJI("gzip", strLIZ, true)) {
            C1496660p3A c1496660p3A = new C1496660p3A(((AbstractC842510X3h) obj).source());
            C1496670p3B c1496670p3B = new C1496670p3B(c1496660p3A);
            c1496670p3B.LL.LLIIJI(c1496660p3A);
            return c1496670p3B.LL.LJJIZ();
        }
        return ((AbstractC842510X3h) obj).string();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Integer getResponseCode(C840660WyO c840660WyO) {
        C0XLY responseObj = getResponseObj(c840660WyO);
        if (responseObj != null) {
            return Integer.valueOf(responseObj.LLILLL);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, String> getResponseCookies(C840660WyO c840660WyO) {
        C0X1V c0x1v;
        String strLIZLLL;
        HashMap map = new HashMap();
        C0XLY responseObj = getResponseObj(c840660WyO);
        if (responseObj != null && (c0x1v = responseObj.LLILZLL) != null && (strLIZLLL = c0x1v.LIZLLL("Set-Cookie")) != null) {
            Map<String, String> map2 = cookieLruCache.get(strLIZLLL);
            if (map2 != null) {
                map.putAll(map2);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13((Map) map2, (Map<String, String>) strLIZLLL, (String) 3), 2, null);
            } else {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZLLL, new String[]{";"}, 0, 6);
                HashMap map3 = new HashMap();
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    String[] strArr = (String[]) a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (strArr.length > 1) {
                        map3.put(a0.LJLIIIL(strArr[0]).toString(), strArr[1]);
                    }
                }
                cookieLruCache.put(strLIZLLL, map3);
                map.putAll(map3);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13(strLIZLLL, map3, 4), 2, null);
                return map;
            }
        }
        return map;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getResponseHeaders(C840660WyO c840660WyO) {
        C0X1V c0x1v;
        Map<String, List<String>> mapLJIIIZ;
        C0XLY responseObj = getResponseObj(c840660WyO);
        if (responseObj == null || (c0x1v = responseObj.LLILZLL) == null || (mapLJIIIZ = c0x1v.LJIIIZ()) == null) {
            return new HashMap();
        }
        return mapLJIIIZ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getScheme(C840660WyO c840660WyO) {
        C0XLQ c0xlqUrl;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (c0xlqUrl = requestObj.url()) != null) {
            return c0xlqUrl.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getUrl(C840660WyO c840660WyO) {
        C0XLQ c0xlqUrl;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (c0xlqUrl = requestObj.url()) != null) {
            return c0xlqUrl.LJIIIIZZ;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void initNetworkStackEvent(C840760WyY c840760WyY) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        try {
            InterfaceC1495580p1Q interfaceC1495580p1Q = (InterfaceC1495580p1Q) c840760WyY.LIZ.LIZ.LJ;
            ?? r0 = interfaceC1495580p1Q.request().url().LJIIIIZZ;
            c259800zU.element = r0;
            c840760WyY.LIZIZ.add(UriProtector.parse(r0));
            c840760WyY.LJII = interfaceC1495580p1Q;
            c840760WyY.LIZ.LJIIZILJ.put("request", interfaceC1495580p1Q.request());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", new AwS557S0100000_13(c259800zU, (C259800zU<String>) 9), 5, th);
        }
    }

    private final void addInterceptorBySort(C1495510p1J c1495510p1J, String str) {
        List<InterfaceC836900WsK> list = c1495510p1J.interceptors;
        int i = -1;
        int i2 = 0;
        boolean z = false;
        for (InterfaceC836900WsK interfaceC836900WsK : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (Intrinsics.LJFF(interfaceC836900WsK.getClass().getName(), "com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3SecurityFactorInterceptor")) {
                    i = i2;
                }
                if (Intrinsics.LJFF(interfaceC836900WsK.getClass().getName(), "com.ss.android.ugc.aweme.compliance.sandbox.network.OrbuSandboxOkHttpInterceptor")) {
                    z = true;
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (i >= 0) {
            ListProtector.add(list, i, new OkHttpMonitorInterceptor(str, z));
        } else {
            list.add(new OkHttpMonitorInterceptor(str, z));
        }
    }

    private final List<String> convertCanonicalListByIgnoreCase(boolean z, List<String> list) {
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toLowerCase(Locale.ROOT));
            }
        }
        return list;
    }

    private final Map<String, ReplaceConfig> convertCanonicalMapByIgnoreCase(boolean z, Map<String, ReplaceConfig> map) {
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : map.keySet()) {
                ReplaceConfig replaceConfig = map.get(str);
                if (replaceConfig != null) {
                    linkedHashMap.put(str.toLowerCase(Locale.ROOT), replaceConfig);
                }
            }
        }
        return map;
    }

    private final String convertCanonicalStrByIgnoreCase(boolean z, String str) {
        if (z) {
            return str.toLowerCase(Locale.ROOT);
        }
        return str;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addCookies(C840660WyO c840660WyO, Map<String, String> map) {
        boolean z;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            String strHeader = requestObj.header("cookie");
            StringBuilder sb = new StringBuilder();
            if (strHeader != null && strHeader.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                sb.append(strHeader);
                if (!u.LJIIZILJ(strHeader, ";", false)) {
                    sb.append(";");
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            C0X1U c0x1uLJI = requestObj.headers().LJI();
            c0x1uLJI.LJ("cookie", sb.toString());
            onHeaderChanged(c840660WyO, new C0X1V(c0x1uLJI), "add", "cookie", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addHeaders(C840660WyO c840660WyO, Map<String, String> map) {
        Object c098200Yq;
        try {
            Request requestObj = getRequestObj(c840660WyO);
            c098200Yq = null;
            if (requestObj != null) {
                C0X1U c0x1uLJI = requestObj.headers().LJI();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    c0x1uLJI.LIZ(entry.getKey(), entry.getValue());
                    arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
                }
                onHeaderChanged(c840660WyO, new C0X1V(c0x1uLJI), "add", "header", arrayList);
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Object addInterceptor(Object obj, String str) {
        String name;
        if (obj != null && (obj instanceof C1495510p1J)) {
            try {
                Field declaredField = obj.getClass().getDeclaredField("dns");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    name = obj2.getClass().getName();
                } else {
                    name = null;
                }
                if (!Intrinsics.LJFF(name, "com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3DnsParserInterceptor")) {
                    addInterceptorBySort((C1495510p1J) obj, str);
                    return Boolean.TRUE;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                addInterceptorBySort((C1495510p1J) obj, str);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", null, 6, th);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addQueries(C840660WyO c840660WyO, Map<String, String> map) {
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            Uri.Builder builderBuildUpon = UriProtector.parse(requestObj.url().LJIIIIZZ).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            onUrlChanged(c840660WyO, builderBuildUpon.build().toString(), "add", arrayList, "query");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceDomain(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        String str;
        ReplaceConfig replaceConfig;
        String str2;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (replaceConfig = map.get((str = requestObj.url().LIZLLL))) != null && (str2 = replaceConfig.value) != null && !a0.LJJJIL(str2)) {
            C0XLP c0xlpLJIIJ = requestObj.url().LJIIJ();
            c0xlpLJIIJ.LJFF(str2);
            onUrlChanged(c840660WyO, c0xlpLJIIJ.LIZLLL().LJIIIIZZ, "replace", Collections.singletonList(new OperatePairs(str, null, str2, null)), "domain");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replacePath(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        String strLJFF;
        ReplaceConfig replaceConfig;
        String str;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (replaceConfig = map.get((strLJFF = requestObj.url().LJFF()))) != null && (str = replaceConfig.value) != null && !a0.LJJJIL(str)) {
            C0XLP c0xlpLJIIJ = requestObj.url().LJIIJ();
            c0xlpLJIIJ.LJ(str);
            onUrlChanged(c840660WyO, c0xlpLJIIJ.LIZLLL().LJIIIIZZ, "replace", Collections.singletonList(new OperatePairs(strLJFF, null, str, null)), "path");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceScheme(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        String str;
        ReplaceConfig replaceConfig;
        String str2;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (replaceConfig = map.get((str = requestObj.url().LIZ))) != null && (str2 = replaceConfig.value) != null && !a0.LJJJIL(str2)) {
            C0XLP c0xlpLJIIJ = requestObj.url().LJIIJ();
            c0xlpLJIIJ.LJIIJJI(str2);
            onUrlChanged(c840660WyO, c0xlpLJIIJ.LIZLLL().LJIIIIZZ, "replace", Collections.singletonList(new OperatePairs(str, null, str2, null)), "scheme");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void dropRequest(C840660WyO c840660WyO, int i, String str) {
        C840970Wyt c840970Wyt = c840660WyO.LIZ.LJJIFFI;
        c840970Wyt.LIZLLL = true;
        C0XLX c0xlx = new C0XLX();
        c0xlx.LIZJ = i;
        c0xlx.LIZIZ = EnumC847200XLi.HTTP_2;
        c0xlx.LIZLLL = str;
        c0xlx.LIZ = getRequestObj(c840660WyO);
        C0X0P c0x0pLIZJ = C0X0P.LIZJ("application/json; charset=utf-8");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"status_code\": ");
        sbLIZ.append(i);
        sbLIZ.append('}');
        c0xlx.LJI = AbstractC842510X3h.create(c0x0pLIZJ, C2188811AlT.LIZIZ(sbLIZ));
        c840970Wyt.LJ = c0xlx.LIZ();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean removeCookies(C840660WyO c840660WyO, List<String> list, boolean z) {
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null) {
            return false;
        }
        C0X1U c0x1uLJI = requestObj.headers().LJI();
        c0x1uLJI.LIZLLL("cookie");
        convertCanonicalListByIgnoreCase(z, list);
        ArrayList arrayList = new ArrayList();
        String strHeader = requestObj.header("cookie");
        if (strHeader != null) {
            List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strHeader, new String[]{";"}, 0, 6);
            StringBuilder sb = new StringBuilder();
            for (String str : listLJJLIIIJILLIZJL) {
                String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (strArr.length < 2) {
                    sb.append(str);
                    sb.append(";");
                } else {
                    String lowerCase = strArr[0];
                    if (z) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                    }
                    if (list.contains(lowerCase)) {
                        arrayList.add(new OperatePairs(strArr[0], strArr[1], null, null));
                    } else {
                        sb.append(str);
                        sb.append(";");
                    }
                }
            }
            c0x1uLJI.LIZ("cookie", sb.toString());
        }
        onHeaderChanged(c840660WyO, new C0X1V(c0x1uLJI), "remove", "cookie", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean removeHeaders(C840660WyO c840660WyO, List<String> list, boolean z) {
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C0X1U c0x1uLJI = requestObj.headers().LJI();
        for (String str : list) {
            String strLIZJ = c0x1uLJI.LIZJ(str);
            if (strLIZJ != null && strLIZJ.length() != 0) {
                arrayList.add(new OperatePairs(str, c0x1uLJI.LIZJ(str), null, null));
            }
            c0x1uLJI.LIZLLL(str);
        }
        onHeaderChanged(c840660WyO, new C0X1V(c0x1uLJI), "remove", "header", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean removeQueries(C840660WyO c840660WyO, List<String> list, boolean z) {
        String lowerCase;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            Uri uri = UriProtector.parse(requestObj.url().LJIIIIZZ);
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            convertCanonicalListByIgnoreCase(z, list);
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (z) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = str;
                }
                boolean zContains = list.contains(lowerCase);
                if (zContains) {
                    arrayList.add(new OperatePairs(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), null, null));
                    if (!zContains) {
                    }
                }
                arrayList2.add(obj);
            }
            for (String str2 : arrayList2) {
                if (UriProtector.getQueryParameters(uri, str2).size() == 1) {
                    builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                } else {
                    List<String> queryParameters = UriProtector.getQueryParameters(uri, str2);
                    if (queryParameters != null) {
                        Iterator<String> it2 = queryParameters.iterator();
                        while (it2.hasNext()) {
                            builderClearQuery.appendQueryParameter(str2, it2.next());
                        }
                    }
                }
            }
            onUrlChanged(c840660WyO, builderClearQuery.build().toString(), "remove", arrayList, "query");
            return !arrayList.isEmpty();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[PHI: r0 r3
      0x009e: PHI (r0v18 java.lang.String) = (r0v17 java.lang.String), (r0v21 java.lang.String) binds: [B:25:0x00c7, B:22:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r3v6 java.lang.String) = (r3v5 java.lang.String), (r3v4 java.lang.String) binds: [B:25:0x00c7, B:22:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean replaceCookies(X.C840660WyO r19, java.util.Map<java.lang.String, com.bytedance.helios.network.api.service.ReplaceConfig> r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl.replaceCookies(X.0WyO, java.util.Map, boolean):boolean");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean replaceHeaders(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) {
        String str;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C0X1U c0x1uLJI = requestObj.headers().LJI();
        for (Map.Entry<String, ReplaceConfig> entry : map.entrySet()) {
            String strLIZJ = c0x1uLJI.LIZJ(entry.getKey());
            if (strLIZJ != null && strLIZJ.length() != 0) {
                ReplaceConfig value = entry.getValue();
                String str2 = null;
                if (Intrinsics.LJFF(value.target, "value")) {
                    c0x1uLJI.LJ(entry.getKey(), value.value);
                    str = value.value;
                    if (!TextUtils.equals(strLIZJ, str)) {
                        arrayList.add(new OperatePairs(entry.getKey(), strLIZJ, str2, str));
                    }
                } else {
                    c0x1uLJI.LIZLLL(entry.getKey());
                    c0x1uLJI.LJ(value.value, strLIZJ);
                    String str3 = value.value;
                    str = null;
                    str2 = str3;
                    if (true ^ TextUtils.equals(entry.getKey(), str3)) {
                        arrayList.add(new OperatePairs(entry.getKey(), strLIZJ, str2, str));
                    }
                }
            }
        }
        onHeaderChanged(c840660WyO, new C0X1V(c0x1uLJI), "replace", "header", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean replaceQueries(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) {
        String lowerCase;
        String str;
        if (getRequestObj(c840660WyO) == null) {
            return false;
        }
        Uri uri = UriProtector.parse(c840660WyO.LJIILL());
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        convertCanonicalMapByIgnoreCase(z, map);
        ArrayList arrayList = new ArrayList();
        for (String str2 : queryParameterNames) {
            if (z) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = str2;
            }
            ReplaceConfig replaceConfig = map.get(lowerCase);
            if (replaceConfig == null) {
                builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            } else {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                String str3 = null;
                if (Intrinsics.LJFF(replaceConfig.target, "value")) {
                    builderClearQuery.appendQueryParameter(str2, replaceConfig.value);
                    str = replaceConfig.value;
                    if (!TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str)) {
                        arrayList.add(new OperatePairs(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), str3, str));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(replaceConfig.value, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    String str4 = replaceConfig.value;
                    if (!TextUtils.equals(str2, str4)) {
                        str = null;
                        str3 = str4;
                        arrayList.add(new OperatePairs(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), str3, str));
                    }
                }
            }
        }
        onUrlChanged(c840660WyO, builderClearQuery.build().toString(), "replace", arrayList, "query");
        return !arrayList.isEmpty();
    }

    private final void onHeaderChanged(C840660WyO c840660WyO, C0X1V c0x1v, String str, String str2, List<OperatePairs> list) {
        Request requestLIZIZ;
        C0X33 c0x33NewBuilder;
        if (list != null && !list.isEmpty()) {
            Request requestObj = getRequestObj(c840660WyO);
            C840970Wyt c840970Wyt = c840660WyO.LIZ.LJJIFFI;
            c840970Wyt.LIZJ = true;
            if (requestObj != null && (c0x33NewBuilder = requestObj.newBuilder()) != null) {
                c0x33NewBuilder.LIZLLL = c0x1v.LJI();
                requestLIZIZ = c0x33NewBuilder.LIZIZ();
            } else {
                requestLIZIZ = null;
            }
            c840970Wyt.LJ = requestLIZIZ;
            c840660WyO.LIZ.LJJ.add(new OperateHistory(str, str2, list));
            c840660WyO.LJIIZILJ = new LinkedHashMap(c0x1v.LJIIIZ());
            c840660WyO.LJIJ = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void onUrlChanged(C840660WyO c840660WyO, String str, String str2, List<OperatePairs> list, String str3) {
        Request requestLIZIZ;
        C0X33 c0x33NewBuilder;
        if (list != null && !list.isEmpty()) {
            Request requestObj = getRequestObj(c840660WyO);
            C840970Wyt c840970Wyt = c840660WyO.LIZ.LJJIFFI;
            c840970Wyt.LIZJ = true;
            if (requestObj != null && (c0x33NewBuilder = requestObj.newBuilder()) != null) {
                c0x33NewBuilder.LJII(str);
                requestLIZIZ = c0x33NewBuilder.LIZIZ();
            } else {
                requestLIZIZ = null;
            }
            c840970Wyt.LJ = requestLIZIZ;
            c840660WyO.LIZ.LJJ.add(new OperateHistory(str2, str3, list));
            c840660WyO.LIZLLL = str;
            switch (str3.hashCode()) {
                case -1326197564:
                    if (str3.equals("domain")) {
                        c840660WyO.LJFF = null;
                    }
                    break;
                case -907987547:
                    if (str3.equals("scheme")) {
                        c840660WyO.LJ = null;
                    }
                    break;
                case 3433509:
                    if (str3.equals("path")) {
                        c840660WyO.LJI = null;
                    }
                    break;
                case 107944136:
                    if (str3.equals("query")) {
                        c840660WyO.LJIILLIIL = null;
                    }
                    break;
            }
        }
    }
}
