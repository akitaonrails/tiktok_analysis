package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1060410dhX;
import X.C2188811AlT;
import X.C794420VEi;
import X.InterfaceC1019840ce6;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class MonitorLogMethod extends BaseBridgeMethod {
    public static final C1060410dhX Companion = new Object() { // from class: X.0dhX
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

    public MonitorLogMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "monitorLog";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (jSONObject.length() == 0) {
            interfaceC1019840ce6.LIZ(0, "params is empty");
            return;
        }
        String strOptString = jSONObject.optString("log_type");
        if (TextUtils.isEmpty(strOptString)) {
            interfaceC1019840ce6.LIZ(0, "log_type is empty");
            return;
        }
        String strOptString2 = jSONObject.optString("service");
        if (TextUtils.equals(strOptString, "service_monitor") && TextUtils.isEmpty(strOptString2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service is required while log_type=");
            sbLIZ.append(strOptString);
            interfaceC1019840ce6.LIZ(0, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        transformJsonField(jSONObject, jSONObject2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        transformJsonField(jSONObject, jSONObject2, "value");
        C794420VEi.LIZIZ(strOptString, strOptString2, jSONObject2);
        interfaceC1019840ce6.onSuccess(null);
    }

    private final void transformJsonField(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            Object objOpt = jSONObject.opt(str);
            if (objOpt != null) {
                jSONObject2.put(str, objOpt);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
