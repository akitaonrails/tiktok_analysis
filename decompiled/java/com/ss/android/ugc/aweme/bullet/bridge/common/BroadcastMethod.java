package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1060460dhc;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BroadcastMethod extends BaseBridgeMethod {
    public static final C1060460dhc Companion = new Object() { // from class: X.0dhc
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

    public BroadcastMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "broadcast";
    }

    public final void notifyRnAndH5(JSONObject jSONObject) {
        sendEvent("notification", jSONObject);
        com.ss.android.ugc.aweme.fe.method.BroadcastMethod.LIZ(getContext(), jSONObject, null, getKitContainerApi());
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            notifyRnAndH5(jSONObject);
            interfaceC1019840ce6.onSuccess("");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(-1, "");
        }
    }
}
