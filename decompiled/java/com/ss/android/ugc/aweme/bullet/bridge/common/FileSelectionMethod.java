package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.AbstractC20277614Vy;
import X.C1051660dTQ;
import X.C1063480dmU;
import X.C1388190mED;
import X.InterfaceC1019840ce6;
import Y.ARunnableS63S0300000_30;
import Y.ARunnableS6S1201000_30;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FileSelectionMethod extends BaseBridgeMethod {
    public static final C1063480dmU Companion = new Object() { // from class: X.0dmU
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

    public FileSelectionMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "fileSelection";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        for (Context context = getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
            final Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                final WeakReference weakReference = new WeakReference(activityLIZ);
                new AbstractC20277614Vy(weakReference) { // from class: X.14W1
                    @Override // X.InterfaceC20276114Vj
                    public final void LIZIZ(JSONObject jSONObject2) {
                        activityLIZ.runOnUiThread(new ARunnableS63S0300000_30(this, interfaceC1019840ce6, jSONObject2, 3));
                    }

                    @Override // X.InterfaceC20276114Vj
                    public final void LIZJ(JSONArray jSONArray) {
                        activityLIZ.runOnUiThread(new ARunnableS63S0300000_30(this, interfaceC1019840ce6, jSONArray, 2));
                    }

                    @Override // X.InterfaceC20276114Vj
                    public final void LIZ(int i, String str) {
                        activityLIZ.runOnUiThread(new ARunnableS6S1201000_30(i, str, this, interfaceC1019840ce6, 0));
                    }
                }.LIZLLL(jSONObject);
                return;
            } else {
                if (!(context instanceof ContextWrapper)) {
                    return;
                }
            }
        }
    }
}
