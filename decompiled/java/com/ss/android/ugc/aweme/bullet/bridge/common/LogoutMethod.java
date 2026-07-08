package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C0XQ7;
import X.C1051660dTQ;
import X.C1913790ztx;
import X.C1914170zuZ;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class LogoutMethod extends BaseBridgeMethod {
    public static final C1913790ztx Companion = new Object() { // from class: X.0ztx
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

    public LogoutMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "accountLogout";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        C1914170zuZ.LIZ.getClass();
        C1914170zuZ.LIZ();
        C0XQ7.LIZJ().logout("h5", "user_logout");
    }
}
