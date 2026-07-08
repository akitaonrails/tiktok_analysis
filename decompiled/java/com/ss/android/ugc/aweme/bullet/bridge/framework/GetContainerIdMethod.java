package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1047290dMN;
import X.C1051660dTQ;
import X.InterfaceC1019840ce6;
import X.InterfaceC1028200cra;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetContainerIdMethod extends BaseBridgeMethod {
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "getContainerId";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetContainerIdMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        String str;
        C1047290dMN sessionInfo;
        super.handle(jSONObject, interfaceC1019840ce6);
        JSONObject jSONObject2 = new JSONObject();
        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null && (sessionInfo = kitContainerApi.getSessionInfo()) != null) {
            str = sessionInfo.LIZ;
        } else {
            str = null;
        }
        jSONObject2.put("container_id", str);
        interfaceC1019840ce6.onSuccess(jSONObject2);
    }
}
