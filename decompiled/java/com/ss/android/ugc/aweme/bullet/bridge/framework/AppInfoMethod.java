package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1058620dee;
import X.C1059360dfq;
import X.C1593730rZj;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AppInfoMethod extends BaseBridgeMethod {
    public static final C1058620dee Companion = new Object() { // from class: X.0dee
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

    public AppInfoMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "appInfo";
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
        if (jSONObject2.has("aid")) {
            Integer numLJJIII = C1593730rZj.LIZIZ.LJJIII();
            if (numLJJIII != null) {
                jSONObject2.put("aid", numLJJIII.intValue());
            } else {
                ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                if (iSpecActService != null) {
                    iSpecActService.LJJIIZI();
                }
                jSONObject2.put("aid", 1233);
            }
        }
        jSONObject2.put("code", 1);
        interfaceC1019840ce6.LIZIZ(jSONObject2);
    }
}
