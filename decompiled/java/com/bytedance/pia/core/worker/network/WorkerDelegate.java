package com.bytedance.pia.core.worker.network;

import X.AbstractC842530X3j;
import X.C080U;
import X.C098200Yq;
import X.C09SW;
import X.C0X0P;
import X.C0X9S;
import X.C13LP;
import X.C1503670pET;
import X.C1506440pIw;
import X.C1506450pIx;
import X.C189200o6;
import X.C1BPP;
import X.C2106208My;
import X.C2188811AlT;
import X.C842540X3k;
import X.InterfaceC1503700pEW;
import X.InterfaceC1503710pEX;
import X.InterfaceC1535500q3o;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.worker.network.WorkerDelegate;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.net.Request;
import com.bytedance.vmsdk.net.Response;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class WorkerDelegate implements InterfaceC1503710pEX {
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC1503700pEW LIZJ;
    public final InterfaceC1535500q3o LIZLLL;

    public static String LIZ(List list) {
        Object next;
        String str;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C080U) next).LIZ.toLowerCase(Locale.ROOT), "content-type")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C080U c080u = (C080U) next;
        if (c080u == null || (str = c080u.LIZIZ) == null) {
            return "application/json";
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.0pET] */
    public final C1503670pET LIZIZ(Request request, final C1506440pIw c1506440pIw, final C1506450pIx c1506450pIx) {
        Object c098200Yq;
        JSONObject jSONObject;
        C842540X3k c842540X3kLIZLLL;
        final C0X9S<TypedInput> c0x9sPatchStreamRequest;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("Begin to fetch (URL: ");
        sbLIZ.append(request.getUrl());
        sbLIZ.append(')');
        C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ), null);
        String strRemove = request.getHeaders().remove("pia-fetch-params");
        if (strRemove != null) {
            try {
                c098200Yq = new JSONObject(strRemove);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            jSONObject = (JSONObject) c098200Yq;
        } else {
            jSONObject = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append("Read fetch parameter (Params: ");
        sbLIZ2.append(jSONObject);
        sbLIZ2.append(')');
        C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ2), null);
        boolean zOptBoolean = false;
        if (jSONObject != null) {
            zOptBoolean = jSONObject.optBoolean("needCommonParams", false);
        }
        if (!request.getHeaders().containsKey("User-Agent")) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LIZ);
            sbLIZ3.append("Append 'User-Agent' for fetch (URL: ");
            sbLIZ3.append(request.getUrl());
            sbLIZ3.append(')');
            C1BPP.LJFF(6, C2188811AlT.LIZIZ(sbLIZ3), null);
            request.getHeaders().put("User-Agent", this.LIZIZ);
        }
        Uri uri = UriProtector.parse(request.getUrl());
        if (uri != null && uri.getHost() != null && uri.getScheme() != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(uri.getScheme());
            sbLIZ4.append("://");
            sbLIZ4.append(uri.getHost());
            sbLIZ4.append("/");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            if (strLIZIZ != null) {
                IWorkerRetrofitApi iWorkerRetrofitApi = (IWorkerRetrofitApi) this.LIZJ.LIZ(IWorkerRetrofitApi.class, strLIZIZ);
                Map<String, String> headers = request.getHeaders();
                ArrayList arrayList = new ArrayList(headers.size());
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    arrayList.add(new C080U(entry.getKey(), entry.getValue()));
                }
                List<C080U> listLLIIII = C13LP.LLIIII(arrayList);
                C0X0P c0x0pLIZJ = C0X0P.LIZJ(LIZ(listLLIIII));
                InputStream body = request.getBody();
                if (body != null) {
                    c842540X3kLIZLLL = AbstractC842530X3j.LIZLLL(c0x0pLIZJ, C2106208My.LIZIZ(body));
                } else {
                    c842540X3kLIZLLL = null;
                }
                String lowerCase = request.getMethod().toLowerCase(Locale.ROOT);
                switch (lowerCase.hashCode()) {
                    case -1335458389:
                        if (lowerCase.equals("delete")) {
                            c0x9sPatchStreamRequest = iWorkerRetrofitApi.deleteStreamRequest(zOptBoolean, uri.toString(), listLLIIII);
                            break;
                        }
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                    case -1249474914:
                        if (lowerCase.equals("options")) {
                            c0x9sPatchStreamRequest = iWorkerRetrofitApi.optionsStreamRequest(zOptBoolean, uri.toString(), listLLIIII);
                            break;
                        }
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                    case 102230:
                        if (lowerCase.equals("get")) {
                            c0x9sPatchStreamRequest = iWorkerRetrofitApi.getStreamRequest(zOptBoolean, uri.toString(), listLLIIII);
                            break;
                        }
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                    case 111375:
                        if (lowerCase.equals("put")) {
                            c0x9sPatchStreamRequest = iWorkerRetrofitApi.putStreamRequest(zOptBoolean, uri.toString(), c842540X3kLIZLLL, listLLIIII);
                            break;
                        }
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                    case 3198432:
                        if (lowerCase.equals("head")) {
                            c0x9sPatchStreamRequest = iWorkerRetrofitApi.headStreamRequest(zOptBoolean, uri.toString(), listLLIIII);
                            break;
                        }
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                    case 3446944:
                        if (lowerCase.equals("post")) {
                            c0x9sPatchStreamRequest = iWorkerRetrofitApi.postStreamRequest(zOptBoolean, uri.toString(), c842540X3kLIZLLL, listLLIIII);
                            break;
                        }
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                    case 106438728:
                        if (lowerCase.equals("patch")) {
                            c0x9sPatchStreamRequest = iWorkerRetrofitApi.patchStreamRequest(zOptBoolean, uri.toString(), c842540X3kLIZLLL, listLLIIII);
                            break;
                        }
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                    default:
                        C1BPP.LIZJ(6, this.LIZ + "Fetch failed (Reason: Invalid method!)", null);
                        c1506450pIx.LIZ(new Error("Invalid method!"));
                        return null;
                }
                c0x9sPatchStreamRequest.enqueue(new C09SW<TypedInput>() { // from class: X.0pES
                    @Override // X.C09SW
                    public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
                    }

                    @Override // X.InterfaceC594300NSq
                    public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                    }

                    @Override // X.C09SW
                    public final void onAsyncResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                        String strLIZIZ2;
                        if (c0x52 == null) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(this.LL.LIZ);
                            sbLIZ5.append("Fetch failed (Reason: Invalid response!)");
                            C1BPP.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ5), null);
                            c1506450pIx.LIZ(new Error("Invalid response!"));
                            return;
                        }
                        C2175508fh c2175508fh = c0x52.LIZ;
                        String str = c2175508fh.LIZ;
                        int i = c2175508fh.LIZIZ;
                        List<C080U> list = c2175508fh.LIZLLL;
                        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                        if (iLIZIZ < 16) {
                            iLIZIZ = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                        for (C080U c080u : list) {
                            Pair pair = new Pair(c080u.LIZ, c080u.LIZIZ);
                            linkedHashMap.put(pair.getFirst(), pair.getSecond());
                        }
                        WorkerDelegate workerDelegate = this.LL;
                        List<C080U> list2 = c0x52.LIZ.LIZLLL;
                        workerDelegate.getClass();
                        C0X0P c0x0pLIZJ2 = C0X0P.LIZJ(WorkerDelegate.LIZ(list2));
                        if (c0x0pLIZJ2 != null) {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(c0x0pLIZJ2.LIZIZ);
                            sbLIZ6.append('/');
                            sbLIZ6.append(c0x0pLIZJ2.LIZJ);
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
                        } else {
                            strLIZIZ2 = null;
                        }
                        InputStream inputStreamIn = c0x52.LIZ.LJ.in();
                        if (strLIZIZ2 == null) {
                            strLIZIZ2 = "application/json";
                        }
                        Response response = new Response(str, i, linkedHashMap, inputStreamIn, strLIZIZ2);
                        this.LL.getClass();
                        C1BPP.LJFF(6, this.LL.LIZ + "Fetch successfully (URL: " + str + ')', null);
                        c1506440pIw.LIZ(response);
                    }

                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th2) {
                        String message;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(this.LL.LIZ);
                        sbLIZ5.append("Fetch failed (Reason: ");
                        if (th2 != null) {
                            message = th2.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ5.append(message);
                        sbLIZ5.append(')');
                        C1BPP.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ5), null);
                        c1506450pIx.LIZ(th2);
                    }
                });
                return new Object() { // from class: X.0pET
                };
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(this.LIZ);
        sbLIZ5.append("Fetch failed (Reason: Invalid url!)");
        C1BPP.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ5), null);
        c1506450pIx.LIZ(new Error("Invalid url!"));
        return null;
    }

    public WorkerDelegate(String str, String str2, InterfaceC1503700pEW interfaceC1503700pEW, InterfaceC1535500q3o interfaceC1535500q3o) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC1503700pEW;
        this.LIZLLL = interfaceC1535500q3o;
    }
}
