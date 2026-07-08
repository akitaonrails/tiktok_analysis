package com.ss.android.ugc.aweme.account.network;

import X.C01GW;
import X.C07MY;
import X.C07MZ;
import X.C080U;
import X.C0X52;
import X.C0XHA;
import X.C0XHB;
import X.C0XHD;
import X.C0XI4;
import X.C0XIR;
import X.C0XPY;
import X.C11NN;
import X.C11OA;
import X.C11S5;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C2188811AlT;
import X.C2207908kv;
import X.C452501pT;
import X.C786410Ut5;
import X.C830490Whz;
import X.C845830XGb;
import X.C845840XGc;
import X.InterfaceC1485405rg;
import X.InterfaceC1487280oo2;
import X.InterfaceC1501150pAP;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.services.interceptor.AgeGateInterceptor;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationInterceptor;
import com.ss.android.ugc.aweme.services.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.services.interceptor.PassportApiErrorReportingInterceptor;
import com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkProxyAccount implements C0XHB {
    public static final NetworkProxyAccount LIZ = new NetworkProxyAccount();
    public static final String LIZIZ = "https://api-va.tiktokv.com";
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2207908kv());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C07MZ());

    public final Gson LJII() {
        C0XPY.LIZ.getClass();
        C0XHA c0xha = C0XPY.LIZJ;
        if (c0xha == null) {
            c0xha = null;
        }
        return c0xha.getGson();
    }

    public static List LIZIZ(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C845840XGc c845840XGc = (C845840XGc) it2.next();
            arrayList.add(new C080U(c845840XGc.LIZ, c845840XGc.LIZIZ));
        }
        return new ArrayList(arrayList);
    }

    public static String LIZ(String str, Map map) {
        if (map != null && !map.isEmpty()) {
            Uri uri = UriProtector.parse(str);
            Uri.Builder builderClearQuery = UriProtector.parse(str).buildUpon().clearQuery();
            for (Map.Entry entry : map.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
            }
            Uri uriBuild = builderClearQuery.build();
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, str2))) {
                    builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                }
            }
            return builderClearQuery.build().toString();
        }
        return str;
    }

    public static C11OA LJ(String str, final Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append(str);
        return C11NN.LJIIIIZZ(new C0XI4(C2188811AlT.LIZIZ(sbLIZ)).LJFF()).LJ(new InterfaceC1487280oo2() { // from class: X.0XHC
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final String str2 = (String) obj;
                final Map<String, String> map2 = map;
                return new C11LE() { // from class: X.0XHL
                    @Override // X.C11LE
                    public final void subscribe(C11M9<? super String> c11m9) {
                        try {
                            NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.LIZ;
                            String str3 = str2;
                            Map<String, String> map3 = map2;
                            networkProxyAccount.getClass();
                            c11m9.onNext(networkProxyAccount.LJFF(str3, map3, new ArrayList()).LIZIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c11m9.onError(th);
                        }
                    }
                };
            }
        }).LJIIZILJ(C11S5.LIZ());
    }

    public final C11OA LIZJ(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append(str);
        C0XI4 c0xi4 = new C0XI4(C2188811AlT.LIZIZ(sbLIZ));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c0xi4.LJ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return C11NN.LJIIIIZZ(c0xi4.LJFF()).LJ(new InterfaceC1487280oo2() { // from class: X.0XHE
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final String str2 = (String) obj;
                return new C11LE() { // from class: X.0XHM
                    @Override // X.C11LE
                    public final void subscribe(C11M9<? super String> c11m9) {
                        try {
                            NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.LIZ;
                            String str3 = str2;
                            networkProxyAccount.getClass();
                            c11m9.onNext(networkProxyAccount.LIZLLL(str3, new ArrayList()).LIZIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c11m9.onError(th);
                        }
                    }
                };
            }
        }).LJIIZILJ(C11S5.LIZ());
    }

    public final C845830XGb LIZLLL(String str, List list) {
        try {
            C845830XGb c845830XGbSendGetRequest = sendGetRequest(str, Integer.MAX_VALUE, list);
            C830490Whz c830490WhzLJIIIIZZ = LJIIIIZZ(str, c845830XGbSendGetRequest, null);
            if (!c830490WhzLJIIIIZZ.isEmpty()) {
                return LIZLLL(LIZ(str, c830490WhzLJIIIIZZ), list);
            }
            return c845830XGbSendGetRequest;
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            return new C845830XGb(list, e.getResponse());
        }
    }

    public final String LJI(String str, Map map) {
        try {
            return sendPostRequest(str, (Map<String, String>) map, Integer.MAX_VALUE, (List<C845840XGc>) null).LIZIZ;
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            return e.getResponse();
        }
    }

    public static C830490Whz LJIIIIZZ(String str, C845830XGb c845830XGb, Map map) {
        boolean z;
        LinkedHashMap linkedHashMap;
        Map<String, String> mapTryToIntercept;
        C830490Whz c830490Whz = new C830490Whz();
        int iOptInt = 0;
        if (!TextUtils.isEmpty(str) && str.contains("/passport/")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                iOptInt = JSONObjectProtectorUtils.getJSONObject(new JSONObject(c845830XGb.LIZIZ), "data").optInt("error_code");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            PassportApiErrorReportingInterceptor passportApiErrorReportingInterceptor = new PassportApiErrorReportingInterceptor();
            String str2 = c845830XGb.LIZIZ;
            IInterceptor ageGateInterceptor = null;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
            } else {
                linkedHashMap = null;
            }
            passportApiErrorReportingInterceptor.tryToIntercept(str, null, str2, iOptInt, linkedHashMap);
            if (C0XHD.LIZ.contains(Integer.valueOf(iOptInt))) {
                ageGateInterceptor = new TwoStepAuthenticationInterceptor();
            } else if (iOptInt != 1388) {
                if (iOptInt == 2100) {
                    ageGateInterceptor = new ForcePhoneVerificationInterceptor();
                }
            } else {
                ageGateInterceptor = new AgeGateInterceptor();
            }
            if (ageGateInterceptor == null) {
                mapTryToIntercept = new C830490Whz<>();
            } else {
                mapTryToIntercept = ageGateInterceptor.tryToIntercept(str, null, c845830XGb.LIZIZ, iOptInt, map);
            }
            c830490Whz.putAll(mapTryToIntercept);
        }
        return c830490Whz;
    }

    private final C845830XGb sendGetRequest(@InterfaceC2174708fZ String str, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C845840XGc> list) {
        List<C080U> arrayList;
        List arrayList2;
        LIZ(str, ((C07MY) LIZLLL.getValue()).LIZ());
        if (list != null && (!list.isEmpty())) {
            arrayList = LIZIZ(list);
        } else {
            arrayList = new ArrayList<>();
        }
        C0X52<String> c0x52Execute = ((IAccountNetworkApi) LIZJ.getValue()).getResponse(str, i, arrayList).execute();
        List<C080U> list2 = c0x52Execute.LIZ.LIZLLL;
        if (list2 != null && list2.size() > 0) {
            List listLJJJJLI = C13LP.LJJJJLI(list2);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            for (C080U c080u : (ArrayList) listLJJJJLI) {
                arrayList3.add(new C845840XGc(c080u.LIZ, c080u.LIZIZ));
            }
            arrayList2 = new ArrayList(arrayList3);
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        return new C845830XGb(arrayList2, c0x52Execute.LIZIZ);
    }

    public final C845830XGb LJFF(String str, Map map, List list) {
        try {
            C845830XGb c845830XGbSendPostRequest = sendPostRequest(str, (Map<String, String>) map, Integer.MAX_VALUE, (List<C845840XGc>) list);
            C830490Whz c830490WhzLJIIIIZZ = LJIIIIZZ(str, c845830XGbSendPostRequest, map);
            if (!c830490WhzLJIIIIZZ.isEmpty()) {
                HashMap map2 = new HashMap(map);
                map2.putAll(c830490WhzLJIIIIZZ);
                return LJFF(str, map2, list);
            }
            return c845830XGbSendPostRequest;
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            return new C845830XGb(list, e.getResponse());
        }
    }

    public final C845830XGb LJIIIZ(String str, JSONObject jSONObject, List list) {
        try {
            return sendPostRequest(str, new TypedString(C786410Ut5.J3(jSONObject)), Integer.MAX_VALUE, (List<C845840XGc>) list);
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            return new C845830XGb(list, e.getResponse());
        }
    }

    private final C845830XGb sendPostRequest(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C845840XGc> list) {
        List<C080U> arrayList;
        List arrayList2;
        Map<String, String> mapLIZ = ((C07MY) LIZLLL.getValue()).LIZ();
        mapLIZ.putAll(map);
        if (list != null && (!list.isEmpty())) {
            arrayList = LIZIZ(list);
        } else {
            arrayList = new ArrayList<>();
        }
        C0X52<String> c0x52Execute = ((IAccountNetworkApi) LIZJ.getValue()).getResponse(str, mapLIZ, i, arrayList).execute();
        List<C080U> list2 = c0x52Execute.LIZ.LIZLLL;
        if (list2 != null && list2.size() > 0) {
            List listLJJJJLI = C13LP.LJJJJLI(list2);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            for (C080U c080u : (ArrayList) listLJJJJLI) {
                arrayList3.add(new C845840XGc(c080u.LIZ, c080u.LIZIZ));
            }
            arrayList2 = new ArrayList(arrayList3);
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        return new C845830XGb(arrayList2, c0x52Execute.LIZIZ);
    }

    private final C845830XGb sendPostRequest(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C845840XGc> list) {
        List<C080U> arrayList;
        List arrayList2;
        if (list != null && (!list.isEmpty())) {
            arrayList = LIZIZ(list);
        } else {
            arrayList = new ArrayList<>();
        }
        C0X52<String> c0x52Execute = ((IAccountNetworkApi) LIZJ.getValue()).getResponse(str, typedOutput, i, arrayList).execute();
        List<C080U> list2 = c0x52Execute.LIZ.LIZLLL;
        if (list2 != null && list2.size() > 0) {
            List listLJJJJLI = C13LP.LJJJJLI(list2);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            for (C080U c080u : (ArrayList) listLJJJJLI) {
                arrayList3.add(new C845840XGc(c080u.LIZ, c080u.LIZIZ));
            }
            arrayList2 = new ArrayList(arrayList3);
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        return new C845830XGb(arrayList2, c0x52Execute.LIZIZ);
    }
}
