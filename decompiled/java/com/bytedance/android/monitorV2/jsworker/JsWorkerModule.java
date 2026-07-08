package com.bytedance.android.monitorV2.jsworker;

import X.C13LQ;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520380pfQ;
import X.C1521680phW;
import X.C1522150piH;
import X.EnumC1995307rj;
import X.InterfaceC1521790phh;
import X.InterfaceC1522160piI;
import android.content.Context;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.lynx.tasm.LynxView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class JsWorkerModule extends JSModule implements InterfaceC1521790phh {
    public static final C1522150piH Companion = new Object() { // from class: X.0piH
    };
    public final C1521680phW module;

    public C1521680phW getModule() {
        return this.module;
    }

    private final void reportInternally(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("eventName", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metrics");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("category");
        int iOptInt = jSONObject.optInt("level", -1);
        String strOptString2 = jSONObject.optString("bid", "");
        if (!Intrinsics.LJFF(strOptString, "")) {
            C1520360pfO c1520360pfO = new C1520360pfO(strOptString);
            c1520360pfO.LJ = jSONObjectOptJSONObject;
            c1520360pfO.LIZLLL = jSONObjectOptJSONObject2;
            c1520360pfO.LIZIZ(iOptInt);
            c1520360pfO.LIZIZ = strOptString2;
            LynxView lynxViewLIZIZ = this.module.LIZIZ();
            if (lynxViewLIZIZ == null) {
                C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                c1520380pfQ.getClass();
                C1520380pfQ.LIZ(c1520350pfNLIZ);
                return;
            }
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportCustom(lynxViewLIZIZ, c1520360pfO.LIZ());
        }
    }

    public JsWorkerModule(Context context, Object obj) {
        super(context, obj);
        this.module = new C1521680phW(obj, this);
    }

    @InterfaceC1522160piI
    public final void customReport(ReadableMap readableMap, Callback callback) {
        HashMap<String, Object> hashMap;
        if (readableMap != null) {
            hashMap = readableMap.toHashMap();
        } else {
            hashMap = null;
        }
        if (hashMap != null) {
            this.module.LIZLLL(EnumC1995307rj.CustomReport, new JSONObject(hashMap));
            if (callback != null) {
                JavaOnlyMap javaOnlyMap = C1521680phW.LJ;
                callback.invoke(C1521680phW.LJ);
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap2 = C1521680phW.LJ;
        callback.invoke(C1521680phW.LJFF);
    }

    @Override // X.InterfaceC1521790phh
    public void onMethodInvoked(Object obj, Object[] objArr) {
        JSONObject jSONObject;
        if (obj == EnumC1995307rj.CustomReport && objArr.length != 0 && C13LQ.LJIL(objArr) != null) {
            Object objLJIL = C13LQ.LJIL(objArr);
            if (objLJIL instanceof JSONObject) {
                jSONObject = (JSONObject) objLJIL;
            } else {
                jSONObject = null;
            }
            reportInternally(jSONObject);
        }
    }
}
