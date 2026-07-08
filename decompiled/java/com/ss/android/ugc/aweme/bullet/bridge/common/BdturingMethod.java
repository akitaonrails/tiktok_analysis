package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1066030dqb;
import X.C1388190mED;
import X.C149A;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BdturingMethod extends BaseBridgeMethod {
    public static final C1066030dqb Companion = new Object() { // from class: X.0dqb
    };

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "popTuringVerifyView";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public BdturingMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        String strOptString = jSONObject.optString("decision");
        if (strOptString == null) {
            strOptString = "";
        }
        if (activityLIZ != null && !TextUtils.isEmpty(strOptString)) {
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptchaV2(activityLIZ, strOptString, new C149A() { // from class: X.0dqa
                @Override // X.C149A
                public final void LIZIZ(int i, boolean z) {
                    interfaceC1019840ce6.onSuccess(Integer.valueOf(i));
                }
            }, null);
        } else {
            interfaceC1019840ce6.onSuccess(1);
        }
    }
}
