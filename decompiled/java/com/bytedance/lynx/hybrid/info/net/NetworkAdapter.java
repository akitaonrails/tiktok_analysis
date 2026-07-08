package com.bytedance.lynx.hybrid.info.net;

import X.C080U;
import X.C098200Yq;
import X.C0X52;
import X.C0X9S;
import X.C1058250de3;
import X.C1493620oyG;
import X.C1494430ozZ;
import X.C1494450ozb;
import X.C1494690ozz;
import X.C1529030ptN;
import X.C1529040ptO;
import X.C1529100ptU;
import X.C1529130ptX;
import X.C1529300pto;
import X.C189200o6;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2201808jw;
import X.C2283308x5;
import X.C828590Wev;
import X.EnumC1160050gIF;
import X.EnumC1529110ptV;
import X.EnumC2201908jx;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1529060ptQ;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.lynx.hybrid.info.model.HybridInfo;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkAdapter {
    public final ArrayList<C080U> LIZ;

    /* JADX INFO: loaded from: classes4.dex */
    public interface Api {
        @InterfaceC1501160pAQ
        C0X9S<TypedInput> send(@InterfaceC2174708fZ String str, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj);

        @InterfaceC1501170pAR
        C0X9S<TypedInput> send(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC820680WHi boolean z, @InterfaceC2177008fw Object obj, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);
    }

    public NetworkAdapter() {
        ArrayList<C080U> arrayList = new ArrayList<>();
        this.LIZ = arrayList;
        arrayList.add(new C080U("Content-Type", "application/json"));
    }

    public static String LIZ(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
        while (true) {
            int i = bufferedReader.read(cArr);
            if (i != -1) {
                sb.append(cArr, 0, i);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public final void LIZJ(String str, String str2, Long l, C1529040ptO c1529040ptO, Function2<? super C1529100ptU, ? super Long, Unit> function2) throws JSONException {
        C1529100ptU c1529100ptU;
        int iLJIIJJI;
        String strLJIL;
        h hVarLJIIL;
        Object c098200Yq;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", str);
        jSONObject.put("oid", str2);
        jSONObject.put("bid", c1529040ptO.LIZ);
        jSONObject.put("data_origin", c1529040ptO.LIZLLL);
        jSONObject.put("data_type", c1529040ptO.LJ);
        jSONObject.put("need_page", 1);
        jSONObject.put("resource_config", c1529040ptO.LJFF);
        C1529030ptN c1529030ptNLIZIZ = LIZIZ("https://scc.tiktokv.com/ssp_sdk/url_info", EnumC2201908jx.POST, this.LIZ, C2097608Jq.LJ(), jSONObject, "single");
        if (!c1529030ptNLIZIZ.LIZ) {
            function2.invoke(new C1529100ptU(false, null, str2, EnumC1529110ptV.REQUEST_ERROR, c1529030ptNLIZIZ.LIZJ, EnumC1160050gIF.CDN), l);
            return;
        }
        EnumC1160050gIF enumC1160050gIF = EnumC1160050gIF.CDN;
        String str3 = c1529030ptNLIZIZ.LIZLLL;
        ArrayList arrayList = new ArrayList();
        try {
            C1058250de3.LIZJ().getClass();
            n nVarLJIILIIL = p.LIZJ(str3).LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("code");
            if (kVarLJJIIZ != null) {
                iLJIIJJI = kVarLJJIIZ.LJIIJJI();
            } else {
                iLJIIJJI = -1;
            }
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("message");
            if (kVarLJJIIZ2 != null) {
                strLJIL = kVarLJJIIZ2.LJIL();
            } else {
                strLJIL = null;
            }
            if (iLJIIJJI == 0) {
                k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("data");
                if (kVarLJJIIZ3 != null && (hVarLJIIL = kVarLJJIIZ3.LJIIL()) != null && !(hVarLJIIL instanceof m)) {
                    Iterator<k> it2 = hVarLJIIL.iterator();
                    while (it2.hasNext()) {
                        try {
                            c098200Yq = C1529300pto.LIZ(it2.next().LJIILIIL());
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        HybridInfo hybridInfo = (HybridInfo) c098200Yq;
                        if (hybridInfo != null) {
                            arrayList.add(hybridInfo);
                        }
                    }
                }
                c1529100ptU = new C1529100ptU(true, arrayList, str2, null, null, enumC1160050gIF);
            } else {
                EnumC1529110ptV enumC1529110ptV = EnumC1529110ptV.SERVER_ERROR;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("server error. code = ");
                sbLIZ.append(iLJIIJJI);
                sbLIZ.append(", msg = ");
                sbLIZ.append(strLJIL);
                c1529100ptU = new C1529100ptU(false, arrayList, str2, enumC1529110ptV, C2188811AlT.LIZIZ(sbLIZ), enumC1160050gIF);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            EnumC1529110ptV enumC1529110ptV2 = EnumC1529110ptV.CLIENT_PARSE_ERROR;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("client parse error:");
            sbLIZ2.append(th2.getMessage());
            c1529100ptU = new C1529100ptU(false, arrayList, str2, enumC1529110ptV2, C2188811AlT.LIZIZ(sbLIZ2), enumC1160050gIF);
        }
        function2.invoke(c1529100ptU, l);
    }

    public final C1529030ptN LIZIZ(String str, EnumC2201908jx enumC2201908jx, List<C080U> list, Map<String, String> map, JSONObject jSONObject, String str2) {
        Object c098200Yq;
        C0X9S<TypedInput> c0x9sSend;
        C0X52<TypedInput> c0x52Execute;
        InputStream inputStreamIn;
        InputStream inputStreamIn2;
        C1529030ptN c1529030ptN = new C1529030ptN();
        SecureRandom secureRandom = C828590Wev.LIZ;
        Boolean bool = Boolean.TRUE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hybridInfo/");
        sbLIZ.append(str2);
        String strLIZJ = C828590Wev.LIZJ(str, C828590Wev.LIZIZ(bool, str, C2188811AlT.LIZIZ(sbLIZ), "com.bytedance.lynx.hybrid.info.net.NetworkAdapter.request", C2097908Jt.LIZJ(new Pair("origin_url", ""))));
        Object obj = null;
        try {
            Api api = (Api) ((InterfaceC1529060ptQ) C1529130ptX.LJ.getValue()).LIZ(Api.class, strLIZJ);
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            try {
                if (enumC2201908jx == EnumC2201908jx.POST) {
                    c0x9sSend = api.send(strLIZJ, map, true, c1493620oyG, new TypedByteArray("application/x-www-form-urlencoded; charset=UTF-8", String.valueOf(jSONObject).getBytes(Charsets.UTF_8), new String[0]), list);
                } else if (enumC2201908jx == EnumC2201908jx.GET) {
                    c0x9sSend = api.send(strLIZJ, this.LIZ, false, c1493620oyG);
                } else {
                    throw new IllegalArgumentException("invalid method");
                }
                if (c0x9sSend != null && (c0x52Execute = c0x9sSend.execute()) != null) {
                    C2201808jw.LIZ(c0x52Execute);
                    c1529030ptN.LIZIZ = Integer.valueOf(c0x52Execute.LIZ.LIZIZ);
                    int i = c0x52Execute.LIZ.LIZIZ;
                    if (200 <= i && i < 300) {
                        c1529030ptN.LIZ = true;
                        TypedInput typedInput = c0x52Execute.LIZIZ;
                        if (typedInput != null) {
                            inputStreamIn2 = typedInput.in();
                        } else {
                            inputStreamIn2 = null;
                        }
                        c1529030ptN.LIZLLL = LIZ(inputStreamIn2);
                        return c1529030ptN;
                    }
                    c1529030ptN.LIZ = false;
                    TypedInput typedInput2 = c0x52Execute.LIZIZ;
                    if (typedInput2 != null) {
                        inputStreamIn = typedInput2.in();
                    } else {
                        inputStreamIn = null;
                    }
                    c1529030ptN.LIZJ = LIZ(inputStreamIn);
                    return c1529030ptN;
                }
                c1529030ptN.LIZJ = "EMPTY RESPONSE";
                c1529030ptN.LIZIZ = -12000;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("send request NULL_SS_RESPONSE_ERROR, url:");
                sbLIZ2.append(str);
                C2283308x5.LIZ(6, C2188811AlT.LIZIZ(sbLIZ2), null);
                return c1529030ptN;
            } catch (C1494430ozZ e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C1494430ozZ.class);
                sbLIZ3.append(':');
                sbLIZ3.append(e.getMessage());
                sbLIZ3.append(',');
                sbLIZ3.append(e.getStatusCode());
                c1529030ptN.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
                c1529030ptN.LIZIZ = Integer.valueOf(e.getStatusCode());
                c1529030ptN.LIZ = false;
                return c1529030ptN;
            } catch (C1494450ozb e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C1494450ozb.class);
                sbLIZ4.append(':');
                sbLIZ4.append(e.getMessage());
                sbLIZ4.append(",-12002");
                c1529030ptN.LIZJ = C2188811AlT.LIZIZ(sbLIZ4);
                c1529030ptN.LIZIZ = -12002;
                c1529030ptN.LIZ = false;
                return c1529030ptN;
            } catch (C1494690ozz e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(C1494690ozz.class);
                sbLIZ5.append(':');
                sbLIZ5.append(e.getMessage());
                sbLIZ5.append(',');
                sbLIZ5.append(e.getStatusCode());
                c1529030ptN.LIZJ = C2188811AlT.LIZIZ(sbLIZ5);
                c1529030ptN.LIZIZ = Integer.valueOf(e.getStatusCode());
                try {
                    c098200Yq = new JSONObject(e.getRequestInfo().LJJIJ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 != null) {
                    if (jSONObject2.has("x-tt-logid")) {
                        jSONObject2.optString("x-tt-logid");
                    } else if (jSONObject2.has("X-Tt-Logid")) {
                        jSONObject2.optString("X-Tt-Logid");
                    }
                }
                c1529030ptN.LIZ = false;
                return c1529030ptN;
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("send request unknown error, url:");
                sbLIZ6.append(strLIZJ);
                sbLIZ6.append(", ");
                C2283308x5.LIZ(4, C2188811AlT.LIZIZ(sbLIZ6), th);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(th.getClass());
                sbLIZ7.append(':');
                sbLIZ7.append(th.getMessage());
                c1529030ptN.LIZJ = C2188811AlT.LIZIZ(sbLIZ7);
                c1529030ptN.LIZIZ = -12001;
                c1529030ptN.LIZ = false;
                return c1529030ptN;
            }
        } catch (C1494430ozZ e4) {
            e = e4;
        } catch (C1494450ozb e5) {
            e = e5;
        } catch (C1494690ozz e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
