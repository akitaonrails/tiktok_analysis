package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1061980dk4;
import X.C743880TFy;
import X.C844470XAv;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class IsAppInstalledMethod extends BaseBridgeMethod {
    public static final C1061980dk4 Companion = new Object() { // from class: X.0dk4
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

    public IsAppInstalledMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "isAppInstall";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        String string = JSONObjectProtectorUtils.getString(jSONObject, "packageName");
        C844470XAv.LIZ.getClass();
        if (C743880TFy.LIZ(C844470XAv.LIZ(), string)) {
            interfaceC1019840ce6.onSuccess(new JSONObject());
        } else {
            interfaceC1019840ce6.LIZ(-1, string);
        }
    }
}
