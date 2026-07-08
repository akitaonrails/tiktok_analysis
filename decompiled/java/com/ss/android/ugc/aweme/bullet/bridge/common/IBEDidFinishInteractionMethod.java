package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1062900dlY;
import X.C1063100dls;
import X.C1AF0;
import X.C789490Uy3;
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
public final class IBEDidFinishInteractionMethod extends BaseBridgeMethod {
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public IBEDidFinishInteractionMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "IBEDidFinishInteraction";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        View view;
        C789490Uy3 c789490Uy3;
        View view2;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ = this.contextProviderFactory.LIZ(LynxView.class);
        Object parent = null;
        if (interfaceC1051470dT7LIZ != null && (view2 = (View) interfaceC1051470dT7LIZ.LIZ()) != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && (view = (View) parent) != null) {
            C1062900dlY c1062900dlY = C1063100dls.LIZ;
            C1063100dls.LIZIZ.LIZJ = 1;
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof C789490Uy3) && (c789490Uy3 = (C789490Uy3) parent2) != null) {
                c789490Uy3.setInterceptTouchEvent(true);
                c789490Uy3.setEnabled(false);
                c789490Uy3.setClickable(false);
                return;
            }
            C1AF0.LIZIZ();
            return;
        }
        C1AF0.LIZIZ();
    }
}
