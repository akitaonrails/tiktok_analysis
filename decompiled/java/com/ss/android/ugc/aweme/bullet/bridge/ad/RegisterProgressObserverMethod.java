package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1051660dTQ;
import X.C1440005kM;
import X.C988270bpB;
import X.InterfaceC1019840ce6;
import X.InterfaceC1028200cra;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RegisterProgressObserverMethod extends BaseBridgeMethod {
    public static final int $stable = 8;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public RegisterProgressObserverMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "registerProgressObserver";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("timer_list");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            InterfaceC1028200cra kitContainerApi = getKitContainerApi();
            if (kitContainerApi != null) {
                C1440005kM.LIZ(new C988270bpB(jSONArrayOptJSONArray, kitContainerApi));
            }
            interfaceC1019840ce6.onSuccess(null);
            return;
        }
        interfaceC1019840ce6.LIZ(-1, "timer_list is empty");
    }
}
