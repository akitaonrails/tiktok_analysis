package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1062500dku;
import X.C1062900dlY;
import X.C1063100dls;
import X.C1AF0;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class IBEDidStartInteractionMethod extends BaseBridgeMethod {
    public static final C1062500dku Companion = new Object() { // from class: X.0dku
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

    public IBEDidStartInteractionMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "IBEDidStartInteraction";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        View view;
        super.handle(jSONObject, interfaceC1019840ce6);
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ = this.contextProviderFactory.LIZ(LynxView.class);
        ViewParent parent = null;
        if (interfaceC1051470dT7LIZ != null && (view = (View) interfaceC1051470dT7LIZ.LIZ()) != null) {
            parent = view.getParent();
        }
        if ((parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && parent != null) {
            C1062900dlY c1062900dlY = C1063100dls.LIZ;
            C1063100dls.LIZIZ.LIZLLL = true;
        } else {
            C1AF0.LIZIZ();
        }
    }
}
