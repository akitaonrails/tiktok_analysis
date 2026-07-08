package com.ss.android.ugc.aweme.web.jsbridge;

import X.C0XQ7;
import X.C1388190mED;
import X.InterfaceC1041760dDS;
import X.InterfaceC1748950vc5;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenPhoneAreaMethod extends BaseCommonJavaMethod {
    public OpenPhoneAreaMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenPhoneAreaMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, final InterfaceC1041760dDS interfaceC1041760dDS) {
        Activity activityLIZ;
        InterfaceC1748950vc5 interfaceC1748950vc5 = new InterfaceC1748950vc5() { // from class: X.0e33
            @Override // X.InterfaceC1748950vc5
            public void onExit() {
            }

            @Override // X.InterfaceC1748950vc5
            public void onChanged(String str, String str2) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("phoneCode", str);
                jSONObject2.put("shortCountryName", str2);
                jSONObject2.put("code", 1);
                InterfaceC1041760dDS interfaceC1041760dDS2 = interfaceC1041760dDS;
                if (interfaceC1041760dDS2 != null) {
                    interfaceC1041760dDS2.LIZIZ(jSONObject2);
                }
            }
        };
        if (this.mContextRef.get() != null) {
            ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
            Context context = this.mContextRef.get();
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            } else {
                activityLIZ = null;
            }
            iLoginServiceLIZJ.openCountryListActivity(activityLIZ, interfaceC1748950vc5);
        }
    }
}
