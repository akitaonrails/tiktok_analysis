package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1019850ce7;
import X.C1051660dTQ;
import X.C12ES;
import X.C14KI;
import X.C14KQ;
import X.C1AF0;
import X.C2214201BlK;
import X.InterfaceC1019840ce6;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class IBEGetViewSizeMethod extends BaseBridgeMethod {
    public static final C1019850ce7 Companion = new Object() { // from class: X.0ce7
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

    public IBEGetViewSizeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "IBEGetViewSize";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        Context contextLJFF = C2214201BlK.LJFF();
        if (contextLJFF == null) {
            contextLJFF = getContext();
        }
        if (contextLJFF == null) {
            C1AF0.LIZIZ();
            interfaceC1019840ce6.LIZJ(0, new JSONObject(), "");
            return;
        }
        int iLJIILJJIL = C12ES.LJIILJJIL(C14KQ.LJIIIIZZ(contextLJFF), contextLJFF);
        int iLJIILJJIL2 = C12ES.LJIILJJIL((C14KQ.LJ(contextLJFF) - C12ES.LIZJ(58.0f, contextLJFF)) - C14KI.LIZIZ(contextLJFF), contextLJFF);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", iLJIILJJIL);
        jSONObject2.put("height", iLJIILJJIL2);
        interfaceC1019840ce6.LIZJ(1, jSONObject2.put("scale", Float.valueOf(contextLJFF.getResources().getDisplayMetrics().density)), "");
    }
}
