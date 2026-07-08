package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C0XQ7;
import X.C1051660dTQ;
import X.C1388190mED;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import X.InterfaceC1748950vc5;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenPhoneAreaMethod extends BaseBridgeMethod {
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

    public OpenPhoneAreaMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "choosePhoneArea";
        this.access = EnumC1051570dTH.PRIVATE;
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) {
        Activity activityLIZ;
        InterfaceC1748950vc5 interfaceC1748950vc5 = new InterfaceC1748950vc5() { // from class: X.0e32
            @Override // X.InterfaceC1748950vc5
            public void onExit() {
            }

            @Override // X.InterfaceC1748950vc5
            public void onChanged(String str, String str2) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("phoneCode", str);
                jSONObject2.put("shortCountryName", str2);
                jSONObject2.put("code", 1);
                InterfaceC1019840ce6 interfaceC1019840ce62 = interfaceC1019840ce6;
                if (interfaceC1019840ce62 != null) {
                    interfaceC1019840ce62.LIZIZ(jSONObject2);
                }
            }
        };
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        Context context = getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        iLoginServiceLIZJ.openCountryListActivity(activityLIZ, interfaceC1748950vc5);
    }
}
