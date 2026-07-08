package com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods;

import X.C20145813s8;
import X.C2344809Gs;
import X.InterfaceC1041760dDS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CopyTextToPasteBoardMethodCrossPlatform extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CopyTextToPasteBoardMethodCrossPlatform(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString = jSONObject.optString("copied_text");
        Context actContext = getActContext();
        if (actContext != null) {
            try {
                C20145813s8.LIZ("label", strOptString, actContext, CertProviderManagerKt.findCert("bpea-225", 1476399128));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
            interfaceC1041760dDS.onSuccess(null);
            return;
        }
        interfaceC1041760dDS.LIZ(0, null);
    }
}
