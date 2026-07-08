package com.bytedance.ttnet.retrofit;

import X.C080U;
import X.C08GZ;
import X.C08NC;
import X.C0X52;
import X.C0XMB;
import X.C1493310oxl;
import X.C1493460oy0;
import X.C1493610oyF;
import X.C1493620oyG;
import X.C1494230ozF;
import X.C1494420ozY;
import X.C1494570ozn;
import X.C1494600ozq;
import X.C1494670ozx;
import X.C1494710p01;
import X.C1494850p0F;
import X.C1886607aC;
import X.C2088908Gh;
import X.C2089008Gi;
import X.C2089108Gj;
import X.C2093608Ic;
import X.C2175508fh;
import X.C2188811AlT;
import X.InterfaceC1494070oyz;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: loaded from: classes24.dex */
public final class SsInterceptor extends BaseSsInterceptor {
    public static volatile boolean LL;
    public static volatile boolean LLILLJJLI;

    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    public final Request LIZIZ(Request request) {
        List list;
        List list2;
        Request requestLIZIZ = super.LIZIZ(request);
        String strValueOf = null;
        if (requestLIZIZ == null) {
            return null;
        }
        if (!LLILLJJLI) {
            C1494600ozq.LJJJJZ = new C1493610oyF();
            LLILLJJLI = true;
        }
        C0XMB c0xmbNewBuilder = requestLIZIZ.newBuilder();
        String url = requestLIZIZ.getUrl();
        ArrayList arrayList = new ArrayList();
        if (requestLIZIZ.getHeaders() != null) {
            arrayList.addAll(requestLIZIZ.getHeaders());
        }
        C1494570ozn metrics = requestLIZIZ.getMetrics();
        if (!C2093608Ic.LJ(url)) {
            metrics.LJLILLLLZI.LIZJ.LIZIZ();
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> pairLIZLLL = C2088908Gh.LIZLLL(url, linkedHashMap);
                if (!linkedHashMap.isEmpty()) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (entry != null && (list2 = (List) entry.getValue()) != null && !list2.isEmpty()) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                String str = (String) it2.next();
                                if (linkedHashSet.contains(str)) {
                                    it2.remove();
                                } else {
                                    linkedHashSet.add(str);
                                }
                            }
                        }
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) pairLIZLLL.first);
                sbLIZ.append((String) pairLIZLLL.second);
                C2089008Gi c2089008Gi = new C2089008Gi(C2188811AlT.LIZIZ(sbLIZ));
                if (!linkedHashMap.isEmpty()) {
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        if (entry2 != null && entry2.getKey() != null && (list = (List) entry2.getValue()) != null && !list.isEmpty()) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                c2089008Gi.LIZLLL((String) entry2.getKey(), (String) it3.next());
                            }
                        }
                    }
                }
                url = c2089008Gi.LJ();
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            metrics.LJIILLIIL();
        }
        C1494570ozn metrics2 = requestLIZIZ.getMetrics();
        if (LL) {
            try {
                LinkedList<Pair> linkedList = new LinkedList();
                metrics2.LJLILLLLZI.LIZIZ.LIZIZ();
                try {
                    String strLJFF = C08GZ.LJFF(url, linkedList);
                    C1494710p01 c1494710p01 = metrics2.LJLILLLLZI.LIZIZ;
                    c1494710p01.LJI = c1494710p01.LIZ();
                    metrics2.LJJJJIZL = C1494420ozY.LIZIZ(metrics2.LJLILLLLZI.LIZIZ.LJI);
                    if (strLJFF != null) {
                        c0xmbNewBuilder.LIZJ(strLJFF);
                    }
                    if (!linkedList.isEmpty()) {
                        for (Pair pair : linkedList) {
                            if (pair != null) {
                                arrayList.add(new C080U((String) pair.first, (String) pair.second));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1494710p01 c1494710p012 = metrics2.LJLILLLLZI.LIZIZ;
                    c1494710p012.LJI = c1494710p012.LIZ();
                    metrics2.LJJJJIZL = C1494420ozY.LIZIZ(metrics2.LJLILLLLZI.LIZIZ.LJI);
                    throw th2;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        C1494570ozn metrics3 = requestLIZIZ.getMetrics();
        if (C1493310oxl.LIZIZ) {
            metrics3.LJLILLLLZI.LIZJ.LIZIZ();
            try {
                String host = C2089108Gj.LIZIZ(url).getHost();
                C1493460oy0.LIZ();
                if (host.endsWith(".tiktokv.com")) {
                    strValueOf = String.valueOf(System.currentTimeMillis());
                }
                if (!C2093608Ic.LJ(strValueOf)) {
                    arrayList.add(new C080U("X-SS-REQ-TICKET", strValueOf));
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
            C1494670ozx c1494670ozx = metrics3.LJLILLLLZI.LIZJ;
            c1494670ozx.LJI = c1494670ozx.LIZ();
            metrics3.LJJJJJ = C1494420ozY.LIZIZ(metrics3.LJLILLLLZI.LIZJ.LJI);
        }
        C1494570ozn metrics4 = requestLIZIZ.getMetrics();
        if (C08NC.LIZ) {
            if (metrics4 != null) {
                metrics4.LJLILLLLZI.LIZJ.LIZIZ();
            }
            try {
                String strLIZ = C08NC.LIZ(C2089108Gj.LIZIZ(url));
                if (!TextUtils.isEmpty(strLIZ)) {
                    arrayList.add(new C080U("X-TT-VERIFY-ID", strLIZ));
                }
            } finally {
                try {
                } catch (Throwable th5) {
                }
            }
            if (metrics4 != null) {
                C1494670ozx c1494670ozx2 = metrics4.LJLILLLLZI.LIZJ;
                c1494670ozx2.LJII = c1494670ozx2.LIZ();
                metrics4.LJJJJL = C1494420ozY.LIZIZ(metrics4.LJLILLLLZI.LIZJ.LJII);
            }
        }
        ClientKeyManager clientKeyManagerLJI = ClientKeyManager.LJI();
        C1494570ozn metrics5 = requestLIZIZ.getMetrics();
        clientKeyManagerLJI.getClass();
        if (ClientKeyManager.LJIIIIZZ != null && ClientKeyManager.LJIIIZ && !TextUtils.isEmpty(clientKeyManagerLJI.LIZJ) && !TextUtils.isEmpty(clientKeyManagerLJI.LJFF)) {
            if (metrics5 != null) {
                metrics5.LJLILLLLZI.LIZJ.LIZIZ();
            }
            arrayList.add(new C080U("x-bd-client-key", clientKeyManagerLJI.LIZJ));
            arrayList.add(new C080U("x-bd-kmsv", clientKeyManagerLJI.LJFF));
            if (metrics5 != null) {
                C1494670ozx c1494670ozx3 = metrics5.LJLILLLLZI.LIZJ;
                c1494670ozx3.LJIIIIZZ = c1494670ozx3.LIZ();
                metrics5.LJJJJLI = C1494420ozY.LIZIZ(metrics5.LJLILLLLZI.LIZJ.LJIIIIZZ);
            }
        }
        c0xmbNewBuilder.LIZJ(url);
        c0xmbNewBuilder.LIZJ = arrayList;
        return c0xmbNewBuilder.LIZ();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    public final void LIZ(Request request, C0X52 c0x52) {
        C1494850p0F c1494850p0F;
        if (request != null && c0x52 != null) {
            C2175508fh c2175508fh = c0x52.LIZ;
            InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
            ClientKeyManager clientKeyManagerLJI = ClientKeyManager.LJI();
            synchronized (clientKeyManagerLJI) {
                if (ClientKeyManager.LJIIIIZZ != null && ClientKeyManager.LJIIIZ) {
                    if (request.getMetrics() != null) {
                        request.getMetrics().LJLILLLLZI.LIZJ.LIZIZ();
                    }
                    try {
                        clientKeyManagerLJI.LIZLLL(request, c2175508fh);
                        if (request.getMetrics() != null) {
                            C1494570ozn metrics = request.getMetrics();
                            C1494670ozx c1494670ozx = metrics.LJLILLLLZI.LIZJ;
                            c1494670ozx.LJIIJ = c1494670ozx.LIZ();
                            metrics.LJJJJLL = C1494420ozY.LIZIZ(metrics.LJLILLLLZI.LIZJ.LJIIJ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (request.getMetrics() != null) {
                            C1494570ozn metrics2 = request.getMetrics();
                            C1494670ozx c1494670ozx2 = metrics2.LJLILLLLZI.LIZJ;
                            c1494670ozx2.LJIIJ = c1494670ozx2.LIZ();
                            metrics2.LJJJJLL = C1494420ozY.LIZIZ(metrics2.LJLILLLLZI.LIZJ.LJIIJ);
                        }
                        throw th;
                    }
                }
            }
            request.getMetrics().LJLILLLLZI.LIZIZ.LIZIZ();
            try {
                Object obj = c2175508fh.LJFF;
                if (obj instanceof C1494850p0F) {
                    c1494850p0F = (C1494850p0F) obj;
                    if (c1494850p0F.LIZJ != 0) {
                        JSONObject jSONObject = new JSONObject();
                        List<C080U> list = c2175508fh.LIZLLL;
                        for (int i = 0; i < list.size(); i++) {
                            try {
                                C080U c080u = list.get(i);
                                if (c080u != null && !TextUtils.isEmpty(c080u.LIZ)) {
                                    jSONObject.put(c080u.LIZ.toUpperCase(), c080u.LIZIZ);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        T t = c1494850p0F.LIZJ;
                        if (t instanceof C1493620oyG) {
                            ((C1493620oyG) t).LJJ = jSONObject;
                        }
                        ((C1493620oyG) t).LIZIZ = c2175508fh.LIZIZ;
                        ((C1493620oyG) t).LIZ = c1494850p0F.LJIJ;
                    }
                } else {
                    c1494850p0F = null;
                }
                try {
                    request.getFirstHeader("X-SS-REQ-TICKET");
                    c2175508fh.LIZ("X-SS-REQ-TICKET");
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                try {
                    String url = request.getUrl();
                    Uri uri = Uri.parse(url);
                    String host = uri.getHost();
                    C1493460oy0.LIZ();
                    if (host.endsWith(".tiktokv.com")) {
                        String[] strArr = {fe.e, "tt_sessionid"};
                        List<C080U> listLIZIZ = c2175508fh.LIZIZ(new String[]{"Set-Cookie"}[0]);
                        if (listLIZIZ != null && listLIZIZ.size() > 0) {
                            for (C080U c080u2 : listLIZIZ) {
                                int i2 = 0;
                                do {
                                    String strLIZ = C1886607aC.LIZ(c080u2.LIZIZ, strArr[i2]);
                                    Logger.debug();
                                    if (!C2093608Ic.LJ(strLIZ)) {
                                        int i3 = c2175508fh.LIZIZ;
                                        c1494850p0F.getClass();
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            String encodedQuery = uri.getEncodedQuery();
                                            if (!C2093608Ic.LJ(encodedQuery)) {
                                                jSONObject2.put("url_query", encodedQuery);
                                            }
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                        }
                                        if (!C2093608Ic.LJ(c1494850p0F.LJIJ)) {
                                            jSONObject2.put("remote_ip", c1494850p0F.LJIJ);
                                        }
                                        List<C080U> list2 = c2175508fh.LIZLLL;
                                        if (list2 != null) {
                                            jSONObject2.put("header_list", list2.toString());
                                        }
                                        int iIndexOf = url.indexOf("?");
                                        if (iIndexOf == -1) {
                                            iIndexOf = url.length();
                                        }
                                        C1493310oxl.LIZ(i3, url.substring(0, iIndexOf), jSONObject2);
                                    }
                                    i2++;
                                } while (i2 < 2);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    request.getMetrics().LJII();
                }
                request.getMetrics().LJII();
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                request.getMetrics().LJII();
                throw th5;
            }
        }
    }
}
