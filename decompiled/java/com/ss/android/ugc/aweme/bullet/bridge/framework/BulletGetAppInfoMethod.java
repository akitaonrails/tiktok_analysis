package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1058630def;
import X.C1059360dfq;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BulletGetAppInfoMethod extends BaseBridgeMethod {
    public static final C1058630def Companion = new Object() { // from class: X.0def
    };
    public EnumC1051570dTH access;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public BulletGetAppInfoMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "uniAppInfo";
        this.access = EnumC1051570dTH.PUBLIC;
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = jSONObject.optString("permissionGroup");
        this.contextProviderFactory.LIZIZ(IESJsBridge.class);
        for (Map.Entry entry : ((HashMap) C1059360dfq.LIZ(strOptString)).entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        interfaceC1019840ce6.onSuccess(jSONObject2);
    }
}
