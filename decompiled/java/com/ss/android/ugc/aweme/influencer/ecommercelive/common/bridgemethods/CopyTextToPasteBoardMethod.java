package com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods;

import X.C1047140dM8;
import X.C1051660dTQ;
import X.C20145813s8;
import X.C2344809Gs;
import X.InterfaceC1019840ce6;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CopyTextToPasteBoardMethod extends BaseBridgeMethod {
    public final String name;
    public static final C1047140dM8 Companion = new Object() { // from class: X.0dM8
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public CopyTextToPasteBoardMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "copyTextToPasteBoard";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        String strOptString = jSONObject.optString("copied_text");
        Context context = getContext();
        if (context != null) {
            try {
                C20145813s8.LIZ("label", strOptString, context, CertProviderManagerKt.findCert("bpea-224", 1476399128));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
            interfaceC1019840ce6.onSuccess(null);
            return;
        }
        interfaceC1019840ce6.LIZ(0, null);
    }
}
