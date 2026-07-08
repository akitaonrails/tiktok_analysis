package com.bytedance.hybrid.spark.prefetch;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520380pfQ;
import X.C1521870php;
import X.InterfaceC1063790dmz;
import android.content.Context;
import android.view.View;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class RuntimeHybridMonitorModule extends LynxModule {
    public static final C1521870php Companion = new Object() { // from class: X.0php
    };
    public final Queue<JSONObject> mPendingEvents;
    public WeakReference<View> mViewRef;

    public final synchronized void fireAllEvents() {
        while (!this.mPendingEvents.isEmpty()) {
            reportInternally(this.mPendingEvents.poll());
        }
    }

    private final void reportInternally(JSONObject jSONObject) {
        View view;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("eventName", "");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metrics");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("category");
            int iOptInt = jSONObject.optInt("level", -1);
            String strOptString2 = jSONObject.optString("bid", "");
            if (!Intrinsics.LJFF(strOptString, "")) {
                C1520360pfO c1520360pfO = new C1520360pfO(strOptString);
                if (jSONObjectOptJSONObject != null) {
                    c1520360pfO.LJ = jSONObjectOptJSONObject;
                }
                if (jSONObjectOptJSONObject2 != null) {
                    c1520360pfO.LIZLLL = jSONObjectOptJSONObject2;
                }
                if (iOptInt != -1) {
                    c1520360pfO.LIZIZ(iOptInt);
                }
                if (!Intrinsics.LJFF(strOptString2, "")) {
                    c1520360pfO.LIZIZ = strOptString2;
                }
                WeakReference<View> weakReference = this.mViewRef;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view instanceof LynxView) {
                    LynxViewMonitor.Companion.getClass();
                    LynxViewMonitor.INSTANCE.reportCustom((LynxView) view, c1520360pfO.LIZ());
                } else {
                    C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                    C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                    c1520380pfQ.getClass();
                    C1520380pfQ.LIZ(c1520350pfNLIZ);
                }
            }
        }
    }

    public final void onAttachedToView(View view) {
        this.mViewRef = new WeakReference<>(view);
        fireAllEvents();
    }

    public RuntimeHybridMonitorModule(Context context, Object obj) {
        super(context, obj);
        this.mPendingEvents = new LinkedList();
    }

    private final JavaOnlyMap callbackResponse(int i, String str) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", i);
        javaOnlyMap.putString("errorMessage", str);
        return javaOnlyMap;
    }

    @InterfaceC1063790dmz
    public final void customReport(ReadableMap readableMap, Callback callback) throws Throwable {
        HashMap<String, Object> hashMap;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300002, "com/bytedance/hybrid/spark/prefetch/RuntimeHybridMonitorModule", "customReport", this, new Object[]{readableMap, callback}, "void", new C0WZW(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHNlamH1fuXPFA54SKhmX6ALS59snkESNMJaFVen4MNfGJuGI=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                readableMap = (ReadableMap) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                callback = (Callback) obj2;
            }
        }
        if (readableMap != null && (hashMap = readableMap.toHashMap()) != null) {
            reportInternally(new JSONObject(hashMap));
            if (callback != null) {
                callback.invoke(callbackResponse(0, "success"));
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(callbackResponse(-1, "bad parameters"));
    }
}
