package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1057950ddZ;
import X.C596440NaM;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SetNativeItemMethod extends BaseBridgeMethod {
    public static final C1057950ddZ Companion = new Object() { // from class: X.0ddZ
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

    public SetNativeItemMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "setNativeItem";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "key");
            if (C596440NaM.LIZ.LIZJ(JSONObjectProtectorUtils.getString(jSONObject, "value"), string)) {
                interfaceC1019840ce6.onSuccess(null);
            } else {
                interfaceC1019840ce6.LIZ(-1, "");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(-1, "");
        }
    }
}
