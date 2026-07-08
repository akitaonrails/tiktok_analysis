package com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods;

import X.C1061890djv;
import X.InterfaceC1041760dDS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SendEmailMethodCrossPlatform extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SendEmailMethodCrossPlatform(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString = jSONObject.optString("email");
        String strOptString2 = jSONObject.optString("subject");
        String strOptString3 = jSONObject.optString("content");
        Context actContext = getActContext();
        if (actContext != null) {
            C1061890djv.LIZ(actContext, strOptString2, strOptString3, new String[]{strOptString});
            interfaceC1041760dDS.onSuccess(null);
        } else {
            interfaceC1041760dDS.LIZ(0, null);
        }
    }
}
