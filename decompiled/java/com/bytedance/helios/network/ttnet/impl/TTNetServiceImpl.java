package com.bytedance.helios.network.ttnet.impl;

import X.C080U;
import X.C098200Yq;
import X.C0C40;
import X.C0WSW;
import X.C0WSX;
import X.C0X00;
import X.C0X01;
import X.C0X02;
import X.C0X03;
import X.C0X04;
import X.C0X05;
import X.C0X0P;
import X.C0X0X;
import X.C0X52;
import X.C0XLQ;
import X.C0XMB;
import X.C13BV;
import X.C13LQ;
import X.C1515200pX4;
import X.C1697810uHb;
import X.C189200o6;
import X.C2175508fh;
import X.C2188811AlT;
import X.C823280WRi;
import X.C839910WxB;
import X.C840660WyO;
import X.C840710WyT;
import X.C840970Wyt;
import X.C841650Wzz;
import X.InterfaceC841770X0l;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.consumer.OperateHistory;
import com.bytedance.helios.network.api.consumer.OperatePairs;
import com.bytedance.helios.network.api.service.ITTNetService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.helios.network.ttnet.TTNetMonitorInterceptor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS162S1100000_13;
import kotlin.jvm.internal.AwS257S0300000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class TTNetServiceImpl implements ITTNetService {
    public static Field argsField;
    public static boolean isInitRequestFactoryField;
    public static Field requestFactoryField;
    public static Field requestFactoryRelativeUrl1Field;
    public static Field requestFactoryRelativeUrlField;
    public static Field requestFactoryServiceField;
    public static final C839910WxB Companion = new C839910WxB();
    public static final LruCache<String, Map<String, List<String>>> queryLruCache = new LruCache<>(100);
    public static final LruCache<String, Map<String, String>> cookieLruCache = new LruCache<>(100);

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void copyResponseBody(C840660WyO c840660WyO) {
    }

    private final Map<String, List<String>> convertHeaderListToMap(List<C080U> list) {
        HashMap map = new HashMap();
        if (list != null) {
            for (C080U c080u : list) {
                ArrayList arrayList = (ArrayList) map.get(c080u.LIZ);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c080u.LIZIZ);
                map.put(c080u.LIZ, arrayList);
            }
        }
        return map;
    }

    private final Request getRequestObj(C840660WyO c840660WyO) {
        Object obj;
        C840710WyT c840710WyT = c840660WyO.LIZ;
        C840970Wyt c840970Wyt = c840710WyT.LJJIFFI;
        if (c840970Wyt.LIZJ) {
            Object obj2 = c840970Wyt.LJ;
            if (obj2 instanceof Request) {
                return (Request) obj2;
            }
        }
        Object[] objArr = c840710WyT.LIZ.LJFF;
        if (objArr != null) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        if (!(obj instanceof InterfaceC841770X0l)) {
            return null;
        }
        return ((InterfaceC841770X0l) obj).request();
    }

    private final C0X52<?> getResponseObj(C840660WyO c840660WyO) {
        Object objLJJIIZ;
        Object[] objArr = c840660WyO.LIZ.LIZ.LJFF;
        if (objArr != null) {
            objLJJIIZ = C13LQ.LJJIIZ(1, objArr);
        } else {
            objLJJIIZ = null;
        }
        if (!(objLJJIIZ instanceof C0X52)) {
            return null;
        }
        return (C0X52) objLJJIIZ;
    }

    private final void initRequestFactoryField(SsHttpCall<?> ssHttpCall) {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            isInitRequestFactoryField = true;
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", AFwS200S0000000_13.get$arr$(26), 6, th);
        }
        if (!isInitRequestFactoryField) {
            isInitRequestFactoryField = true;
            Field declaredField = ssHttpCall.getClass().getDeclaredField("args");
            argsField = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = ssHttpCall.getClass().getDeclaredField("requestFactory");
            requestFactoryField = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Class<?> cls = Class.forName("com.bytedance.retrofit2.RequestFactory");
            Field declaredField3 = cls.getDeclaredField("server");
            requestFactoryServiceField = declaredField3;
            if (declaredField3 != null) {
                declaredField3.setAccessible(true);
            }
            Field declaredField4 = cls.getDeclaredField("relativeUrl");
            requestFactoryRelativeUrlField = declaredField4;
            if (declaredField4 != null) {
                declaredField4.setAccessible(true);
            }
            try {
                Field declaredField5 = cls.getDeclaredField("relativeUrl1");
                requestFactoryRelativeUrl1Field = declaredField5;
                if (declaredField5 != null) {
                    declaredField5.setAccessible(true);
                    return;
                }
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", AFwS200S0000000_13.get$arr$(25), 5, th2);
                return;
            }
            TryCatchGuardChecker.doCheck(th);
            isInitRequestFactoryField = true;
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", AFwS200S0000000_13.get$arr$(26), 6, th);
        }
    }

    private final C0X0P parseMediaType(String str) {
        if (str != null && str.length() != 0) {
            return C0X0P.LIZJ(str);
        }
        return null;
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
    public String getContentSubType(C840660WyO c840660WyO) {
        TypedOutput body;
        String strMimeType;
        C0X0P mediaType;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null || (body = requestObj.getBody()) == null || (strMimeType = body.mimeType()) == null || (mediaType = parseMediaType(strMimeType)) == null) {
            return null;
        }
        return mediaType.LIZJ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getContentType(C840660WyO c840660WyO) {
        TypedOutput body;
        String strMimeType;
        C0X0P mediaType;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null || (body = requestObj.getBody()) == null || (strMimeType = body.mimeType()) == null || (mediaType = parseMediaType(strMimeType)) == null) {
            return null;
        }
        return mediaType.LIZIZ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, String> getCookies(C840660WyO c840660WyO) {
        List<C080U> listHeaders;
        HashMap map = new HashMap();
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (listHeaders = requestObj.headers("cookie")) != null) {
            for (C080U c080u : listHeaders) {
                Map<String, String> map2 = cookieLruCache.get(c080u.LIZIZ);
                if (map2 != null) {
                    map.putAll(map2);
                    CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                    C0WSW.LIZ("Helios:Network-Service", new C0X02(map2, c080u), 2, null);
                } else {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(c080u.LIZIZ, new String[]{";"}, 0, 6);
                    HashMap map3 = new HashMap();
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        String[] strArr = (String[]) a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (strArr.length > 1) {
                            map3.put(strArr[0], strArr[1]);
                        }
                    }
                    cookieLruCache.put(c080u.LIZIZ, map3);
                    map.putAll(map3);
                    CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                    C0WSW.LIZ("Helios:Network-Service", new C0X01(map3, c080u), 2, null);
                }
            }
        }
        return map;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getDomain(C840660WyO c840660WyO) {
        try {
            Request requestObj = getRequestObj(c840660WyO);
            if (requestObj != null) {
                return requestObj.getHost();
            }
            return null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getHeaders(C840660WyO c840660WyO) {
        List<C080U> headers;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            headers = requestObj.getHeaders();
        } else {
            headers = null;
        }
        return convertHeaderListToMap(headers);
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getMethod(C840660WyO c840660WyO) {
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            return requestObj.getMethod();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getPath(C840660WyO c840660WyO) {
        try {
            Request requestObj = getRequestObj(c840660WyO);
            if (requestObj != null) {
                return requestObj.getPath();
            }
            return null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getQueries(C840660WyO c840660WyO) {
        String url;
        HashMap map = new HashMap();
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (url = requestObj.getUrl()) != null) {
            Map<String, List<String>> map2 = queryLruCache.get(url);
            if (map2 != null) {
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new C0X03(map2, url), 2, null);
                return map2;
            }
            for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : new UrlQuerySanitizer(url).getParameterList()) {
                String str = parameterValuePair.mParameter;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(parameterValuePair.mValue);
                map.put(str, arrayList);
            }
            queryLruCache.put(url, map);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", new C0X04(url, map), 2, null);
        }
        return map;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getRequestBody(C840660WyO c840660WyO) {
        TypedOutput body;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (body = requestObj.getBody()) != null && shouldReadReqBody(parseMediaType(body.mimeType()))) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            body.writeTo(byteArrayOutputStream);
            HashMap<String, Object> map = C841650Wzz.LIZ;
            return byteArrayOutputStream.toString(C841650Wzz.LIZIZ.name());
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getRequestBodyBase64(C840660WyO c840660WyO) {
        Request requestObj;
        TypedOutput body;
        if (NetworkComponent.INSTANCE.isOfflineEnv() && (requestObj = getRequestObj(c840660WyO)) != null && (body = requestObj.getBody()) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            body.writeTo(byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public k getRequestBodyStruct(C840660WyO c840660WyO) {
        TypedOutput body;
        Object c098200Yq;
        k qVar;
        k qVar2;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (body = requestObj.getBody()) != null) {
            try {
                C0X0P mediaType = parseMediaType(body.mimeType());
                if (shouldReadReqBody(mediaType)) {
                    if (Intrinsics.LJFF(mediaType.LIZJ, "json")) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        body.writeTo(byteArrayOutputStream);
                        return C0X00.LIZ(0, GsonProtectorUtils.parse(C0X00.LIZ, byteArrayOutputStream.toString(C841650Wzz.LIZIZ.name())));
                    }
                    if (Intrinsics.LJFF(mediaType.LIZJ, "x-www-form-urlencoded")) {
                        if (requestObj.getRequestBody() instanceof C0X0X) {
                            C0X0X c0x0x = (C0X0X) requestObj.getRequestBody();
                            n nVar = new n();
                            int iLJI = c0x0x.LJI();
                            for (int i = 0; i < iLJI; i++) {
                                String strLJFF = c0x0x.LJFF(i);
                                String strLJIILIIL = C0XLQ.LJIILIIL(0, strLJFF.length(), strLJFF, true);
                                if (NetworkComponent.INSTANCE.isOfflineEnv()) {
                                    String str = (String) ListProtector.get(c0x0x.LIZIZ, i);
                                    qVar2 = new q(C0XLQ.LJIILIIL(0, str.length(), str, true));
                                } else {
                                    qVar2 = m.LL;
                                }
                                nVar.LJJIFFI(strLJIILIIL, qVar2);
                            }
                            return nVar;
                        }
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        body.writeTo(byteArrayOutputStream2);
                        String string = byteArrayOutputStream2.toString(C841650Wzz.LIZIZ.name());
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('?');
                        sbLIZ.append(string);
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
        C2175508fh c2175508fh;
        TypedInput typedInput;
        String strMimeType;
        C0X0P mediaType;
        C0X52<?> responseObj = getResponseObj(c840660WyO);
        if (responseObj == null || (c2175508fh = responseObj.LIZ) == null || (typedInput = c2175508fh.LJ) == null || (strMimeType = typedInput.mimeType()) == null || (mediaType = parseMediaType(strMimeType)) == null) {
            return null;
        }
        return mediaType.LIZJ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResContentType(C840660WyO c840660WyO) {
        C2175508fh c2175508fh;
        TypedInput typedInput;
        String strMimeType;
        C0X0P mediaType;
        C0X52<?> responseObj = getResponseObj(c840660WyO);
        if (responseObj == null || (c2175508fh = responseObj.LIZ) == null || (typedInput = c2175508fh.LJ) == null || (strMimeType = typedInput.mimeType()) == null || (mediaType = parseMediaType(strMimeType)) == null) {
            return null;
        }
        return mediaType.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResponseBody(C840660WyO c840660WyO) {
        Object c098200Yq;
        String strMimeType;
        boolean z;
        C0X52<?> responseObj = getResponseObj(c840660WyO);
        if (responseObj != null) {
            try {
                T t = responseObj.LIZIZ;
                if (t instanceof String) {
                    return (String) t;
                }
                TypedInput typedInput = responseObj.LIZ.LJ;
                if (typedInput != null) {
                    strMimeType = typedInput.mimeType();
                } else {
                    strMimeType = null;
                }
                if (shouldReadResBody(parseMediaType(strMimeType))) {
                    if (t instanceof TypedByteArray) {
                        return new String(((TypedByteArray) t).getBytes(), Charsets.UTF_8);
                    }
                    ConcurrentModificationException e = null;
                    String strLIZIZ = null;
                    int i = 0;
                    while (true) {
                        if (i >= 0 && i < 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            break;
                        }
                        try {
                            strLIZIZ = C0C40.LIZIZ(t);
                            i = -1;
                            e = null;
                        } catch (ConcurrentModificationException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            i++;
                        }
                    }
                    if (e != null) {
                        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                        C0WSW.LIZ("Helios:Network-Service", new AwS257S0300000_13(e, c840660WyO, t, 0), 6, e);
                    }
                    return strLIZIZ;
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new AwS257S0300000_13(thM5exceptionOrNullimpl, (Throwable) c840660WyO, (C840660WyO) responseObj, (C0X52<?>) 1), 6, thM5exceptionOrNullimpl);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Integer getResponseCode(C840660WyO c840660WyO) {
        C0X52<?> responseObj = getResponseObj(c840660WyO);
        if (responseObj != null) {
            return Integer.valueOf(responseObj.LIZ.LIZIZ);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, String> getResponseCookies(C840660WyO c840660WyO) {
        List<C080U> list;
        HashMap map = new HashMap();
        C0X52<?> responseObj = getResponseObj(c840660WyO);
        if (responseObj != null && (list = responseObj.LIZ.LIZLLL) != null) {
            Iterator<C080U> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C080U next = it2.next();
                if (u.LJIJI(next.LIZ, "set-cookie", true)) {
                    String str = next.LIZIZ;
                    Map<String, String> map2 = cookieLruCache.get(str);
                    if (map2 != null) {
                        map.putAll(map2);
                        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                        C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13((Map) map2, (Map<String, String>) str, (String) 5), 2, null);
                    } else {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6);
                        HashMap map3 = new HashMap();
                        Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                        while (it3.hasNext()) {
                            String[] strArr = (String[]) a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                            if (strArr.length > 1) {
                                map3.put(a0.LJLIIIL(strArr[0]).toString(), strArr[1]);
                            }
                        }
                        cookieLruCache.put(str, map3);
                        map.putAll(map3);
                        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                        C0WSW.LIZ("Helios:Network-Service", new C0X05(str, map3), 2, null);
                        return map;
                    }
                }
            }
        }
        return map;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getResponseHeaders(C840660WyO c840660WyO) {
        List<C080U> list;
        C0X52<?> responseObj = getResponseObj(c840660WyO);
        if (responseObj != null) {
            list = responseObj.LIZ.LIZLLL;
        } else {
            list = null;
        }
        return convertHeaderListToMap(list);
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getScheme(C840660WyO c840660WyO) {
        String url;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null && (url = requestObj.getUrl()) != null) {
            return UriProtector.parse(url).getScheme();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getUrl(C840660WyO c840660WyO) {
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            return requestObj.getUrl();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:3:0x000b, B:5:0x0015, B:7:0x001a, B:8:0x001e, B:10:0x0024, B:13:0x002b, B:15:0x0031, B:17:0x003c, B:19:0x0047, B:26:0x0052, B:28:0x0069, B:30:0x006f, B:32:0x0073, B:34:0x0079, B:36:0x007d, B:44:0x0090, B:46:0x009e, B:48:0x00a4, B:49:0x00b7, B:51:0x00c5, B:53:0x00d5, B:39:0x0085, B:41:0x0089, B:22:0x004c, B:52:0x00c7), top: B:58:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:3:0x000b, B:5:0x0015, B:7:0x001a, B:8:0x001e, B:10:0x0024, B:13:0x002b, B:15:0x0031, B:17:0x003c, B:19:0x0047, B:26:0x0052, B:28:0x0069, B:30:0x006f, B:32:0x0073, B:34:0x0079, B:36:0x007d, B:44:0x0090, B:46:0x009e, B:48:0x00a4, B:49:0x00b7, B:51:0x00c5, B:53:0x00d5, B:39:0x0085, B:41:0x0089, B:22:0x004c, B:52:0x00c7), top: B:58:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:3:0x000b, B:5:0x0015, B:7:0x001a, B:8:0x001e, B:10:0x0024, B:13:0x002b, B:15:0x0031, B:17:0x003c, B:19:0x0047, B:26:0x0052, B:28:0x0069, B:30:0x006f, B:32:0x0073, B:34:0x0079, B:36:0x007d, B:44:0x0090, B:46:0x009e, B:48:0x00a4, B:49:0x00b7, B:51:0x00c5, B:53:0x00d5, B:39:0x0085, B:41:0x0089, B:22:0x004c, B:52:0x00c7), top: B:58:0x000b }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initNetworkStackEvent(X.C840760WyY r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl.initNetworkStackEvent(X.0WyY):void");
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
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<C080U> listHeaders = requestObj.headers("cookie");
            if (listHeaders != null) {
                Iterator<C080U> it2 = listHeaders.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().LIZIZ);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            arrayList2.add(sb.toString());
            LinkedHashMap linkedHashMap = new LinkedHashMap(getHeaders(c840660WyO));
            linkedHashMap.remove("cookie");
            linkedHashMap.put("cookie", arrayList2);
            onHeaderChanged(c840660WyO, linkedHashMap, "add", "cookie", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addHeaders(C840660WyO c840660WyO, Map<String, String> map) {
        Object c098200Yq;
        try {
            c098200Yq = null;
            if (getRequestObj(c840660WyO) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(getHeaders(c840660WyO));
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    ArrayList arrayListLJ = C1697810uHb.LJ(entry.getValue());
                    linkedHashMap.put(entry.getKey(), arrayListLJ);
                    arrayList.add(new OperatePairs(null, null, entry.getKey(), TextUtils.join(";", arrayListLJ)));
                }
                onHeaderChanged(c840660WyO, linkedHashMap, "add", "header", arrayList);
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
        if (obj != null && (obj instanceof C1515200pX4)) {
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            networkComponent.beforeRegisterTTNetInterceptor(obj);
            ((C1515200pX4) obj).LIZJ(new TTNetMonitorInterceptor(str));
            networkComponent.afterRegisterTTNetInterceptor(obj);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addQueries(C840660WyO c840660WyO, Map<String, String> map) {
        if (getRequestObj(c840660WyO) != null) {
            ArrayList arrayList = new ArrayList();
            Uri.Builder builderBuildUpon = UriProtector.parse(c840660WyO.LJIILL()).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            onUrlChanged(c840660WyO, builderBuildUpon.build().toString(), "add", arrayList, "query");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceDomain(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        Uri uri;
        String host;
        ReplaceConfig replaceConfig;
        String str;
        if (getRequestObj(c840660WyO) != null && (replaceConfig = map.get((host = (uri = UriProtector.parse(c840660WyO.LJIILL())).getHost()))) != null && (str = replaceConfig.value) != null && !a0.LJJJIL(str)) {
            onUrlChanged(c840660WyO, uri.buildUpon().authority(str).build().toString(), "replace", Collections.singletonList(new OperatePairs(host, null, str, null)), "domain");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replacePath(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        Uri uri;
        String path;
        ReplaceConfig replaceConfig;
        String str;
        if (getRequestObj(c840660WyO) != null && (replaceConfig = map.get((path = (uri = UriProtector.parse(c840660WyO.LJIILL())).getPath()))) != null && (str = replaceConfig.value) != null && !a0.LJJJIL(str)) {
            onUrlChanged(c840660WyO, uri.buildUpon().path(str).build().toString(), "replace", Collections.singletonList(new OperatePairs(path, null, str, null)), "path");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceScheme(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        Uri uri;
        String scheme;
        ReplaceConfig replaceConfig;
        String str;
        if (getRequestObj(c840660WyO) != null && (replaceConfig = map.get((scheme = (uri = UriProtector.parse(c840660WyO.LJIILL())).getScheme()))) != null && (str = replaceConfig.value) != null && !a0.LJJJIL(str)) {
            onUrlChanged(c840660WyO, uri.buildUpon().scheme(str).build().toString(), "replace", Collections.singletonList(new OperatePairs(scheme, null, str, null)), "scheme");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void dropRequest(C840660WyO c840660WyO, int i, String str) {
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            c840660WyO.LIZ.LJJIFFI.LIZLLL = true;
            C2175508fh c2175508fh = new C2175508fh(requestObj.getUrl(), i, "drop by pns", requestObj.getHeaders(), new TypedByteArray("application/json; charset=utf-8", str.getBytes(Charsets.UTF_8), new String[0]));
            c840660WyO.LIZ.LJJIFFI.LJ = C0X52.LIZIZ(c2175508fh.LJ, c2175508fh);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean removeCookies(C840660WyO c840660WyO, List<String> list, boolean z) {
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        convertCanonicalListByIgnoreCase(z, list);
        ArrayList arrayList2 = new ArrayList();
        List<C080U> listHeaders = requestObj.headers("cookie");
        if (listHeaders != null) {
            for (C080U c080u : listHeaders) {
                StringBuilder sb = new StringBuilder();
                int i = 6;
                for (String str : a0.LJJLIIIJILLIZJL(c080u.LIZIZ, new String[]{";"}, 0, 6)) {
                    String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str, new String[]{"="}, 0, i).toArray(new String[0]);
                    if (strArr.length < 2) {
                        sb.append(str);
                        sb.append(";");
                    } else {
                        String lowerCase = strArr[0];
                        if (z) {
                            lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        }
                        if (list.contains(lowerCase)) {
                            arrayList2.add(new OperatePairs(strArr[0], strArr[1], null, null));
                        } else {
                            sb.append(str);
                            sb.append(";");
                        }
                    }
                    i = 6;
                }
                arrayList.add(sb.toString());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(getHeaders(c840660WyO));
        linkedHashMap.remove("cookie");
        linkedHashMap.put("cookie", arrayList);
        onHeaderChanged(c840660WyO, linkedHashMap, "remove", "cookie", arrayList2);
        return !arrayList2.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean removeHeaders(C840660WyO c840660WyO, List<String> list, boolean z) {
        if (getRequestObj(c840660WyO) != null) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap(getHeaders(c840660WyO));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            convertCanonicalListByIgnoreCase(z, list);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String lowerCase = (String) entry.getKey();
                if (z) {
                    lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                }
                if (list.contains(lowerCase)) {
                    String str = (String) entry.getKey();
                    Iterable iterable = (Iterable) entry.getValue();
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    arrayList.add(new OperatePairs(str, TextUtils.join(";", iterable), null, null));
                } else {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            onHeaderChanged(c840660WyO, linkedHashMap2, "remove", "header", arrayList);
            return !arrayList.isEmpty();
        }
        return false;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean removeQueries(C840660WyO c840660WyO, List<String> list, boolean z) {
        String lowerCase;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            Uri uri = UriProtector.parse(requestObj.getUrl());
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

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean replaceCookies(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) {
        String str;
        String str2;
        Request requestObj = getRequestObj(c840660WyO);
        if (requestObj == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        convertCanonicalMapByIgnoreCase(z, map);
        ArrayList arrayList2 = new ArrayList();
        List<C080U> listHeaders = requestObj.headers("cookie");
        if (listHeaders != null) {
            for (C080U c080u : listHeaders) {
                StringBuilder sb = new StringBuilder();
                int i = 6;
                for (String str3 : a0.LJJLIIIJILLIZJL(c080u.LIZIZ, new String[]{";"}, 0, 6)) {
                    String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str3, new String[]{"="}, 0, i).toArray(new String[0]);
                    if (strArr.length < 2) {
                        sb.append(str3);
                        sb.append(";");
                    } else {
                        String lowerCase = strArr[0];
                        if (z) {
                            lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        }
                        ReplaceConfig replaceConfig = map.get(lowerCase);
                        if (replaceConfig == null) {
                            sb.append(str3);
                            sb.append(";");
                        } else if (Intrinsics.LJFF(replaceConfig.target, "value")) {
                            sb.append(strArr[0]);
                            sb.append("=");
                            sb.append(replaceConfig.value);
                            sb.append(";");
                            str2 = replaceConfig.value;
                            str = null;
                            if (!TextUtils.equals(strArr[1], str2)) {
                                arrayList.add(new OperatePairs(strArr[0], strArr[1], str, str2));
                            }
                        } else {
                            sb.append(replaceConfig.value);
                            sb.append("=");
                            sb.append(strArr[1]);
                            sb.append(";");
                            str = replaceConfig.value;
                            if (!TextUtils.equals(strArr[0], str)) {
                                str2 = null;
                                arrayList.add(new OperatePairs(strArr[0], strArr[1], str, str2));
                            }
                        }
                    }
                    i = 6;
                }
                arrayList2.add(sb.toString());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(getHeaders(c840660WyO));
        linkedHashMap.remove("cookie");
        linkedHashMap.put("cookie", arrayList2);
        onHeaderChanged(c840660WyO, linkedHashMap, "replace", "cookie", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean replaceHeaders(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) {
        Iterable iterable;
        String str;
        if (getRequestObj(c840660WyO) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap(getHeaders(c840660WyO));
        convertCanonicalMapByIgnoreCase(z, map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String lowerCase = (String) entry.getKey();
            if (z) {
                lowerCase = lowerCase.toLowerCase(Locale.ROOT);
            }
            ReplaceConfig replaceConfig = map.get(lowerCase);
            if (replaceConfig != null && (iterable = (Iterable) linkedHashMap.get(entry.getKey())) != null) {
                String str2 = null;
                if (Intrinsics.LJFF(replaceConfig.target, "value")) {
                    ArrayList arrayListLJ = C1697810uHb.LJ(replaceConfig.value);
                    linkedHashMap.put(entry.getKey(), arrayListLJ);
                    str = replaceConfig.value;
                    if (!Objects.deepEquals(iterable, arrayListLJ)) {
                        arrayList.add(new OperatePairs((String) entry.getKey(), TextUtils.join(";", iterable), str2, str));
                    }
                } else {
                    linkedHashMap.put(replaceConfig.value, iterable);
                    String str3 = replaceConfig.value;
                    if (!TextUtils.equals((CharSequence) entry.getKey(), str3)) {
                        str = null;
                        str2 = str3;
                        if (1 != 0) {
                            arrayList.add(new OperatePairs((String) entry.getKey(), TextUtils.join(";", iterable), str2, str));
                        }
                    }
                }
            }
        }
        onHeaderChanged(c840660WyO, linkedHashMap, "replace", "header", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public boolean replaceQueries(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) {
        String lowerCase;
        String str;
        if (getRequestObj(c840660WyO) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Uri uri = UriProtector.parse(c840660WyO.LJIILL());
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        convertCanonicalMapByIgnoreCase(z, map);
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

    private final void onHeaderChanged(C840660WyO c840660WyO, Map<String, ? extends List<String>> map, String str, String str2, List<OperatePairs> list) {
        if (!ReDexExperimentOpt.getAbTest()) {
            onHeaderChanged$redex$base(c840660WyO, map, str, str2, list);
        } else {
            onHeaderChanged$redex$opt(c840660WyO, map, str, str2, list);
        }
    }

    private final void onHeaderChanged$redex$base(C840660WyO c840660WyO, Map<String, ? extends List<String>> map, String str, String str2, List<OperatePairs> list) {
        Request requestLIZ;
        C0XMB c0xmbNewBuilder;
        if (list != null && !list.isEmpty()) {
            Request requestObj = getRequestObj(c840660WyO);
            C840970Wyt c840970Wyt = c840660WyO.LIZ.LJJIFFI;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                List<String> value = entry.getValue();
                if (value != null) {
                    Iterator<String> it2 = value.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C080U(entry.getKey(), it2.next()));
                    }
                }
            }
            if (requestObj != null && (c0xmbNewBuilder = requestObj.newBuilder()) != null) {
                c0xmbNewBuilder.LIZJ = arrayList;
                requestLIZ = c0xmbNewBuilder.LIZ();
            } else {
                requestLIZ = null;
            }
            c840970Wyt.LJ = requestLIZ;
            c840970Wyt.LIZJ = true;
            c840660WyO.LIZ.LJJ.add(new OperateHistory(str, str2, list));
            c840660WyO.LJIIZILJ = new LinkedHashMap(map);
            c840660WyO.LJIJ = null;
        }
    }

    private final void onHeaderChanged$redex$opt(C840660WyO c840660WyO, Map<String, ? extends List<String>> map, String str, String str2, List<OperatePairs> list) {
        Request requestLIZ;
        C0XMB c0xmbNewBuilder;
        if (list != null && !list.isEmpty()) {
            Request requestObj = getRequestObj(c840660WyO);
            C840970Wyt c840970Wyt = c840660WyO.LIZ.LJJIFFI;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                List<String> value = entry.getValue();
                if (value != null) {
                    int i = 0;
                    int size = value.size();
                    while (i < size) {
                        String str3 = value.get(i);
                        i++;
                        arrayList.add(new C080U(entry.getKey(), str3));
                    }
                }
            }
            if (requestObj != null && (c0xmbNewBuilder = requestObj.newBuilder()) != null) {
                c0xmbNewBuilder.LIZJ = arrayList;
                requestLIZ = c0xmbNewBuilder.LIZ();
            } else {
                requestLIZ = null;
            }
            c840970Wyt.LJ = requestLIZ;
            c840970Wyt.LIZJ = true;
            c840660WyO.LIZ.LJJ.add(new OperateHistory(str, str2, list));
            c840660WyO.LJIIZILJ = new LinkedHashMap(map);
            c840660WyO.LJIJ = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void onUrlChanged(C840660WyO c840660WyO, String str, String str2, List<OperatePairs> list, String str3) {
        Request requestLIZ;
        C0XMB c0xmbNewBuilder;
        if (list != null && !list.isEmpty()) {
            Request requestObj = getRequestObj(c840660WyO);
            C840970Wyt c840970Wyt = c840660WyO.LIZ.LJJIFFI;
            if (requestObj != null && (c0xmbNewBuilder = requestObj.newBuilder()) != null) {
                c0xmbNewBuilder.LIZJ(str);
                requestLIZ = c0xmbNewBuilder.LIZ();
            } else {
                requestLIZ = null;
            }
            c840970Wyt.LJ = requestLIZ;
            c840970Wyt.LIZJ = true;
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
