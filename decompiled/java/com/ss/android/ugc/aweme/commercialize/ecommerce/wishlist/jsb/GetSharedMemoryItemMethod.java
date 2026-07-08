package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.jsb;

import X.C1030460cvE;
import X.C1030480cvG;
import X.C1051660dTQ;
import X.C1AF0;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetSharedMemoryItemMethod extends BaseBridgeMethod {
    public static final C1030460cvE Companion = new Object() { // from class: X.0cvE
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

    public GetSharedMemoryItemMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getSharedMemoryItem";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            JSONObject jSONObject2 = C1030480cvG.LIZ;
            interfaceC1019840ce6.LIZJ(1, C1030480cvG.LIZ, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            interfaceC1019840ce6.LIZ(-1, e.getMessage());
        }
    }
}
