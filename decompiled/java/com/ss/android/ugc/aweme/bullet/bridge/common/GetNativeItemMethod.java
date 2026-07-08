package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1048470dOH;
import X.C1051660dTQ;
import X.C596440NaM;
import X.InterfaceC1019840ce6;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetNativeItemMethod extends BaseBridgeMethod {
    public static final C1048470dOH Companion = new Object() { // from class: X.0dOH
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

    public GetNativeItemMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getNativeItem";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            String strLIZIZ = C596440NaM.LIZ.LIZIZ(jSONObject.optString("key"), "");
            if (!TextUtils.isEmpty(strLIZIZ)) {
                interfaceC1019840ce6.onSuccess(strLIZIZ);
            } else {
                interfaceC1019840ce6.LIZ(0, "value is null");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(0, e.getMessage());
        }
    }
}
