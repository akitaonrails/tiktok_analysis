package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1027660cqi;
import X.C1051660dTQ;
import X.C1AF0;
import X.InterfaceC1019840ce6;
import X.InterfaceC1028200cra;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetNativeSiteCustomDataMethod extends BaseBridgeMethod {
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

    public GetNativeSiteCustomDataMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getNativeSiteCustomData";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        C1027660cqi c1027660cqi;
        try {
            JSONObject jSONObject2 = new JSONObject();
            InterfaceC1028200cra kitContainerApi = getKitContainerApi();
            if (kitContainerApi != null) {
                c1027660cqi = (C1027660cqi) kitContainerApi.LIZIZ(C1027660cqi.class);
            } else {
                c1027660cqi = null;
            }
            String str = "";
            if (c1027660cqi != null) {
                String str2 = (String) c1027660cqi.LJJLL.LIZJ();
                if (str2 != null) {
                    str = str2;
                }
                jSONObject2.put("customData", str);
            } else if (this.contextProviderFactory.LIZIZ(Bundle.class) != null) {
                Bundle bundle = (Bundle) this.contextProviderFactory.LIZIZ(Bundle.class);
                if (bundle == null) {
                    return;
                }
                String string = bundle.getString("bundle_native_site_custom_data");
                if (string != null) {
                    str = string;
                }
                jSONObject2.put("customData", str);
            }
            interfaceC1019840ce6.onSuccess(jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1019840ce6.LIZ(-1, th.getMessage());
            C1AF0.LJ(th);
        }
    }
}
