package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1019750cdx;
import X.C1051660dTQ;
import X.C1440005kM;
import X.C999640c7W;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class DidSelectScoreMethod extends BaseBridgeMethod {
    public final String name;
    public static final C1019750cdx Companion = new Object() { // from class: X.0cdx
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

    public DidSelectScoreMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "didSelectScore";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        int iHashCode;
        Object objLIZ;
        if (jSONObject.has("score_result")) {
            InterfaceC1051470dT7 interfaceC1051470dT7LIZ = this.contextProviderFactory.LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class);
            if (interfaceC1051470dT7LIZ != null && (objLIZ = interfaceC1051470dT7LIZ.LIZ()) != null) {
                iHashCode = objLIZ.hashCode();
            } else {
                iHashCode = 0;
            }
            jSONObject.optInt("score_result");
            C1440005kM.LIZ(new C999640c7W(iHashCode));
        }
        interfaceC1019840ce6.onSuccess("");
    }
}
