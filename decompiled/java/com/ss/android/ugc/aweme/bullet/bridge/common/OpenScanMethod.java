package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C098200Yq;
import X.C1051660dTQ;
import X.C1062770dlL;
import X.C1388190mED;
import X.C189200o6;
import X.C19286910ct;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenScanMethod extends BaseBridgeMethod {
    public static final C1062770dlL Companion = new Object() { // from class: X.0dlL
    };
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenScanMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "scan";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        JSONObject jSONObject2;
        Object c098200Yq;
        Context context;
        Activity activityLIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "h5");
        C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
        if (jSONObject.has("args")) {
            jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "args");
        } else {
            jSONObject2 = null;
        }
        Context context2 = getContext();
        if (context2 != null) {
            C19286910ct.LIZIZ.LIZLLL(context2);
        }
        if (jSONObject2 != null && jSONObject2.has("should_close_self")) {
            try {
                c098200Yq = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject2, "should_close_self"));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Boolean bool = (Boolean) c098200Yq;
            if (bool != null && bool.booleanValue() && (context = getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                activityLIZ.finish();
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 1);
        interfaceC1019840ce6.LIZIZ(jSONObject3);
    }
}
