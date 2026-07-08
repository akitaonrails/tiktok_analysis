package com.ss.android.ugc.aweme.commercialize.tcm.anchor;

import X.C1050550dRd;
import X.C1051660dTQ;
import X.C786410Ut5;
import X.EnumC1054630dYD;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetContainerDataMethod extends BaseBridgeMethod {
    public static final C1050550dRd Companion = new Object() { // from class: X.0dRd
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

    public GetContainerDataMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getContainerData";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
        jSONObject2.put("group_id", repo.getString("group_id", ""));
        jSONObject2.put("anchor_extra", repo.getString("anchor_extra", ""));
        if (getHybridType() == EnumC1054630dYD.WEB) {
            jSONObject2.put("code", 1);
            interfaceC1019840ce6.LIZIZ(jSONObject2);
        } else {
            interfaceC1019840ce6.onSuccess(jSONObject2);
        }
    }
}
