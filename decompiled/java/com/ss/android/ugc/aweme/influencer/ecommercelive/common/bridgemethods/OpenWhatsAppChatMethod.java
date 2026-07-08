package com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods;

import X.C1051660dTQ;
import X.C1061690djb;
import X.C2429309fX;
import X.InterfaceC1019840ce6;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenWhatsAppChatMethod extends BaseBridgeMethod {
    public final String name;
    public static final C1061690djb Companion = new Object() { // from class: X.0djb
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenWhatsAppChatMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "routeToWhatsapp";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        String strOptString = jSONObject.optString("phone");
        String strOptString2 = jSONObject.optString("text");
        Context context = getContext();
        if (context != null) {
            if (C2429309fX.LIZ(context, strOptString, strOptString2)) {
                interfaceC1019840ce6.onSuccess(null);
                return;
            } else {
                interfaceC1019840ce6.LIZ(0, null);
                return;
            }
        }
        interfaceC1019840ce6.LIZ(0, null);
    }
}
