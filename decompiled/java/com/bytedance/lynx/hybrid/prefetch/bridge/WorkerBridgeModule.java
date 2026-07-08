package com.bytedance.lynx.hybrid.prefetch.bridge;

import X.C098200Yq;
import X.C1531430pxF;
import X.C1531460pxI;
import X.C1531470pxJ;
import X.C189200o6;
import X.C2188811AlT;
import X.InterfaceC1522160piI;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class WorkerBridgeModule extends JSModule {
    public static final C1531470pxJ Companion = new C1531470pxJ();
    public final C1531430pxF ctx;

    public static final WritableArray convertJSONArray2JavaOnlyArray(JSONArray jSONArray) {
        Companion.getClass();
        return C1531470pxJ.LIZ(jSONArray);
    }

    public static final WritableMap convertJSONObject2JavaOnlyMap(JSONObject jSONObject) {
        Companion.getClass();
        return C1531470pxJ.LIZIZ(jSONObject);
    }

    public WorkerBridgeModule(Context context, Object obj) {
        C1531430pxF c1531430pxF;
        super(context, obj);
        if (obj instanceof C1531430pxF) {
            c1531430pxF = (C1531430pxF) obj;
        } else {
            c1531430pxF = null;
        }
        this.ctx = c1531430pxF;
    }

    @InterfaceC1522160piI
    public final void call(String str, ReadableMap readableMap, Callback callback) throws JSONException {
        Object c098200Yq;
        JavaOnlyMap javaOnlyMap;
        try {
            if (this.ctx == null && callback != null) {
                callback.invoke(new JSONObject().put("code", 0).put("msg", "init worker bridge error"));
            }
            if ((readableMap instanceof JavaOnlyMap) && (javaOnlyMap = (JavaOnlyMap) readableMap) != null) {
                Companion.getClass();
                JSONObject jSONObjectLIZLLL = C1531470pxJ.LIZLLL(javaOnlyMap);
                C1531430pxF c1531430pxF = this.ctx;
                c1531430pxF.LIZIZ.LIZ(c1531430pxF.LIZ, str, jSONObjectLIZLLL, new C1531460pxI(callback));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && callback != null) {
            JSONObject jSONObjectPut = new JSONObject().put("code", 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail to invoke ");
            sbLIZ.append(str);
            sbLIZ.append(", error = ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            callback.invoke(jSONObjectPut.put("msg", C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public static /* synthetic */ void call$default(WorkerBridgeModule workerBridgeModule, String str, ReadableMap readableMap, Callback callback, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            readableMap = null;
        }
        if ((i & 4) != 0) {
            callback = null;
        }
        workerBridgeModule.call(str, readableMap, callback);
    }
}
