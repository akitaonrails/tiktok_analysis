package com.ss.android.ugc.aweme.app.api;

import X.C036E;
import X.C080U;
import X.C0CQT;
import X.C0XIK;
import X.C0XIL;
import X.C0XIM;
import X.C0XIN;
import X.C0XIR;
import X.C14SG;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C844470XAv;
import X.C846160XHi;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC846210XHn;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ApiMonitorService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class Api {
    public static final String LIZ;
    public static final String LIZIZ;
    public static NetApi LIZJ;

    public interface NetApi {
        @InterfaceC1501160pAQ
        ListenableFuture<String> doGet(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);
    }

    static {
        String str = C844470XAv.LJIIIIZZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZ = strLIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("/aweme/v1/upload/image/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static boolean LJFF(JSONObject jSONObject) {
        if (jSONObject.has("statusCode") && jSONObject.optInt("statusCode") == 0) {
            return true;
        }
        if (jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0) {
            return true;
        }
        if (jSONObject.has("message") && TextUtils.equals("success", jSONObject.optString("message"))) {
            return true;
        }
        return false;
    }

    public static void LIZ(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        if (!C2093608Ic.LJ(str)) {
            JSONObject jSONObject = new JSONObject(str);
            if (!LJFF(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    C0XIR c0xir = new C0XIR(jSONObjectOptJSONObject.optInt("error_code"));
                    c0xir.setErrorMsg(jSONObjectOptJSONObject.optString("description", ""));
                    c0xir.setResponse(str);
                    c0xir.setUrl(str2);
                    throw c0xir;
                }
                C0XIR c0xir2 = new C0XIR(jSONObject.optInt("status_code"));
                c0xir2.setErrorMsg(jSONObject.optString("message", ""));
                c0xir2.setErrorMsg(jSONObject.optString("status_msg", ""));
                c0xir2.setPrompt(jSONObject.optString("prompts", ""));
                c0xir2.setResponse(str);
                c0xir2.setUrl(str2);
                c0xir2.setBlockCode(jSONObject.optInt("block_code"));
                throw c0xir2;
            }
            return;
        }
        throw new C0XIM();
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (!C2093608Ic.LJ(str)) {
            if (!LJFF(jSONObject)) {
                if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "error") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    C0XIR c0xir = new C0XIR(jSONObjectOptJSONObject.optInt("error_code"));
                    c0xir.setErrorMsg(jSONObjectOptJSONObject.optString("description", ""));
                    c0xir.setResponse(str);
                    c0xir.setUrl(str2);
                    throw c0xir;
                }
                C0XIR c0xir2 = new C0XIR(jSONObject.optInt("status_code"));
                c0xir2.setErrorMsg(jSONObject.optString("message", ""));
                c0xir2.setErrorMsg(jSONObject.optString("status_msg", ""));
                c0xir2.setPrompt(jSONObject.optString("prompts", ""));
                c0xir2.setResponse(str);
                c0xir2.setUrl(str2);
                c0xir2.setBlockCode(jSONObject.optInt("block_code"));
                throw c0xir2;
            }
            return;
        }
        throw new C0XIM();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONObject] */
    public static <T> T LJI(String str, C0XIL<T> c0xil, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        if (!C2093608Ic.LJ(str)) {
            ?? r1 = (T) new JSONObject(str);
            if (!LJFF(r1)) {
                if (r1.has("message") && TextUtils.equals(r1.optString("message"), "error") && (jSONObjectOptJSONObject = r1.optJSONObject("data")) != null) {
                    ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                    C0XIR c0xir = new C0XIR(jSONObjectOptJSONObject.optInt("error_code"));
                    c0xir.setErrorMsg(jSONObjectOptJSONObject.optString("description", ""));
                    c0xir.setResponse(str);
                    c0xir.setUrl(str3);
                    throw c0xir;
                }
                C0XIR c0xir2 = new C0XIR(r1.optInt("status_code"));
                c0xir2.setErrorMsg(r1.optString("message", ""));
                c0xir2.setErrorMsg(r1.optString("status_msg", ""));
                c0xir2.setPrompt(r1.optString("prompts", ""));
                c0xir2.setResponse(str);
                c0xir2.setUrl(str3);
                c0xir2.setBlockCode(r1.optInt("block_code"));
                ApiMonitorService.Companion.getInstance().apiMonitor(str3, "", str);
                throw c0xir2;
            }
            try {
                if (TextUtils.isEmpty(str2)) {
                    if ((c0xil instanceof C14SG) && ((C14SG) c0xil).LIZ == null) {
                        return r1;
                    }
                    if (c0xil instanceof C0XIN) {
                        return r1;
                    }
                    return c0xil.LIZ(str);
                }
                return c0xil.LIZ(r1.opt(str2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        throw new C0XIM();
    }

    public static Object LIZJ(String str, C0XIL c0xil, String str2, C846160XHi c846160XHi, Object obj) throws Throwable {
        boolean zLIZIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ || (!TextUtils.isEmpty(str) && str.contains("/aweme/v1/feed/?type=0"))) {
            if (LIZJ == null) {
                LIZJ = (NetApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(NetApi.class);
            }
            ArrayList arrayList = new ArrayList();
            if (c846160XHi != null) {
                ArrayList arrayList2 = (ArrayList) c846160XHi.LL;
                for (InterfaceC846210XHn interfaceC846210XHn : (InterfaceC846210XHn[]) arrayList2.toArray(new InterfaceC846210XHn[arrayList2.size()])) {
                    arrayList.add(new C080U(interfaceC846210XHn.getName(), interfaceC846210XHn.getValue()));
                }
            }
            try {
                return LJI(LIZJ.doGet(str, arrayList, obj).get(), c0xil, str2, str);
            } catch (ExecutionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2.getCause();
            }
        }
        throw new IOException();
    }

    public static <T> T LJ(String str, int i, String str2, C0XIL<T> c0xil, String str3) throws IOException {
        boolean zLIZIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            return (T) LJI(NetworkUtils.postFile(i, str, "file", str2), c0xil, str3, str);
        }
        throw new IOException();
    }

    public static <T> T LIZLLL(int i, String str, Class<T> cls, String str2, C846160XHi c846160XHi, Object obj) {
        boolean zLJI = MethodIDManager.LJI(137651);
        if (String.class.equals(cls)) {
            T t = (T) LIZJ(str, C0XIK.LIZ, str2, c846160XHi, null);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return t;
        }
        T t2 = (T) LIZJ(str, new C14SG(cls), str2, c846160XHi, obj);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return t2;
    }
}
