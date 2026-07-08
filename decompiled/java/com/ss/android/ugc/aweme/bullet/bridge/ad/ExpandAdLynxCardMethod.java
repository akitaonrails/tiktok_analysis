package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1051660dTQ;
import X.C1440005kM;
import X.C663730Q1r;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ExpandAdLynxCardMethod extends BaseBridgeMethod {
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

    public ExpandAdLynxCardMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "expandAdLynxCard";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Object objLIZ;
        if (!jSONObject.has("expand")) {
            interfaceC1019840ce6.LIZ(-1, "expand is empty");
            return;
        }
        int iOptInt = jSONObject.optInt("expand");
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ = this.contextProviderFactory.LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class);
        int iHashCode = 0;
        if (interfaceC1051470dT7LIZ != null && (objLIZ = interfaceC1051470dT7LIZ.LIZ()) != null) {
            iHashCode = objLIZ.hashCode();
        }
        C1440005kM.LIZ(new C663730Q1r(iOptInt, iHashCode));
        interfaceC1019840ce6.onSuccess(null);
    }
}
