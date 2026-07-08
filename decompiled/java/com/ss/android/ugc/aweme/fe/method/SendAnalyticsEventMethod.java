package com.ss.android.ugc.aweme.fe.method;

import X.C080U;
import X.C09S2;
import X.C09V7;
import X.C1499850p8J;
import X.C1697810uHb;
import X.C2501609rC;
import X.C786410Ut5;
import X.InterfaceC1041760dDS;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.INetworkApi;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.settings.SendAnalyticsEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SendAnalyticsEventMethod extends BaseCommonJavaMethod {
    public final String LLILLL;
    public final List<String> LLILZ;

    public SendAnalyticsEventMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SendAnalyticsEventMethod(IESJsBridge iESJsBridge) {
        String str;
        super(iESJsBridge);
        SendAnalyticsEventData sendAnalyticsEventDataLIZ = C09V7.LIZ();
        if (sendAnalyticsEventDataLIZ != null) {
            str = sendAnalyticsEventDataLIZ.baseUrl;
        } else {
            str = null;
        }
        this.LLILLL = str;
        SendAnalyticsEventData sendAnalyticsEventDataLIZ2 = C09V7.LIZ();
        this.LLILZ = sendAnalyticsEventDataLIZ2 != null ? sendAnalyticsEventDataLIZ2.whiteList : null;
    }

    public final List<C080U> LIZ(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            Iterator<String> itKeys = jSONObject.keys();
            ArrayList arrayList = new ArrayList();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(new C080U(next, JSONObjectProtectorUtils.getString(jSONObject, next)));
            }
            return arrayList;
        }
        return null;
    }

    public final Map<String, String> LIZIZ(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            Iterator<String> itKeys = jSONObject.keys();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
            return linkedHashMap;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strJ3;
        if (jSONObject == null) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, "no params!");
                return;
            }
            return;
        }
        String strOptString = jSONObject.optString("path");
        List<String> list = this.LLILZ;
        if (list != null && list.contains(strOptString)) {
            String strOptString2 = jSONObject.optString("method");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            Gson gson = new Gson();
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject2 != null) {
                strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject2);
            } else {
                strJ3 = null;
            }
            n nVar = (n) GsonProtectorUtils.fromJson(gson, strJ3, n.class);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("header");
            if (TextUtils.equals(strOptString2, "GET")) {
                List<C080U> listLIZ = LIZ(jSONObjectOptJSONObject3);
                String str = this.LLILLL;
                if (str != null && !a0.LJJJIL(str)) {
                    Map<String, String> mapLIZIZ = LIZIZ(jSONObjectOptJSONObject);
                    try {
                        List<C080U> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C080U("X-SS-No-Cookie", "true"));
                        if (listLIZ != null && !((ArrayList) listLIZ).isEmpty()) {
                            listLJIILJJIL.addAll(listLIZ);
                        }
                        C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(this.LLILLL);
                        c1499850p8J.LIZJ = true;
                        ((INetworkApi) c1499850p8J.build().retrofit.LIZ(INetworkApi.class)).doGet(false, -1, strOptString, mapLIZIZ, listLJIILJJIL, null).enqueue(new C2501609rC(interfaceC1041760dDS, 1));
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (interfaceC1041760dDS != null) {
                            interfaceC1041760dDS.LIZ(1, e.getMessage());
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZ(0, "base url is empty!");
                    return;
                }
                return;
            }
            if (TextUtils.equals(strOptString2, "POST")) {
                List<C080U> listLIZ2 = LIZ(jSONObjectOptJSONObject3);
                String str2 = this.LLILLL;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    try {
                        List<C080U> listLJIILJJIL2 = C1697810uHb.LJIILJJIL(new C080U("X-SS-No-Cookie", "true"));
                        if (listLIZ2 != null && !((ArrayList) listLIZ2).isEmpty()) {
                            listLJIILJJIL2.addAll(listLIZ2);
                        }
                        C1499850p8J c1499850p8J2 = (C1499850p8J) C09S2.LIZIZ(this.LLILLL);
                        c1499850p8J2.LIZJ = true;
                        ((SendAnalyticsEventApi) c1499850p8J2.build().retrofit.LIZ(SendAnalyticsEventApi.class)).doPost(false, -1, strOptString, LIZIZ(jSONObjectOptJSONObject), nVar, listLJIILJJIL2, null).enqueue(new C2501609rC(interfaceC1041760dDS, 2));
                        return;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (interfaceC1041760dDS != null) {
                            interfaceC1041760dDS.LIZ(1, e2.getMessage());
                            return;
                        }
                        return;
                    }
                }
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZ(0, "base url is empty!");
                    return;
                }
                return;
            }
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, "method is neither GET nor POST");
                return;
            }
            return;
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(0, "path doesn't match!");
        }
    }
}
