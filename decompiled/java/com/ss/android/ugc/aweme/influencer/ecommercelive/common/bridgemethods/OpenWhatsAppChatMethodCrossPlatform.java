package com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods;

import X.C2429309fX;
import X.InterfaceC1041760dDS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenWhatsAppChatMethodCrossPlatform extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenWhatsAppChatMethodCrossPlatform(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString = jSONObject.optString("phone");
        String strOptString2 = jSONObject.optString("text");
        Context actContext = getActContext();
        if (actContext != null) {
            if (C2429309fX.LIZ(actContext, strOptString, strOptString2)) {
                interfaceC1041760dDS.onSuccess(null);
                return;
            } else {
                interfaceC1041760dDS.LIZ(0, null);
                return;
            }
        }
        interfaceC1041760dDS.LIZ(0, null);
    }
}
