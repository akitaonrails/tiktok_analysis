package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1060100dh2;
import X.C1323040kX8;
import X.C1388190mED;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class DarkModeMethod extends BaseBridgeMethod {
    public static final C1060100dh2 Companion = new Object() { // from class: X.0dh2
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

    public DarkModeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "darkMode";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Activity activityLIZ;
        String strOptString = jSONObject.optString("enable");
        try {
            Context context = getContext();
            Window window = null;
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            if (activityLIZ != null) {
                window = activityLIZ.getWindow();
            }
            C1323040kX8.LIZIZ(activityLIZ, window, TextUtils.equals(strOptString, "true"));
            interfaceC1019840ce6.onSuccess(new JSONObject());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(0, e.getMessage());
        }
    }
}
