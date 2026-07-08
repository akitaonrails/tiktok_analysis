package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.AbstractC305760Byg;
import X.C1028300crk;
import X.C1051660dTQ;
import X.C286910BMj;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetSettingsMethod extends BaseBridgeMethod {
    public static final C1028300crk Companion = new Object() { // from class: X.0crk
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

    public GetSettingsMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getSettings";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            AbstractC305760Byg abstractC305760Byg = AbstractC305760Byg.LLIZLLLIL;
            abstractC305760Byg.getClass();
            if (((Boolean) C286910BMj.LIZ.getValue()).booleanValue()) {
                interfaceC1019840ce6.onSuccess(abstractC305760Byg.LLILLL);
            } else {
                interfaceC1019840ce6.onSuccess(new JSONObject(abstractC305760Byg.LIZIZ()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(-1, "");
        }
    }
}
