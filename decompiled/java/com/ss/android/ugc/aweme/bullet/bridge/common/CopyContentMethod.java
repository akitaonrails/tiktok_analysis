package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C20145813s8;
import X.C2344809Gs;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import Y.ARunnableS14S1100000_9;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CopyContentMethod extends BaseBridgeMethod {
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public CopyContentMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "copyContent";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String strOptString = jSONObject.optString("content");
        String strOptString2 = jSONObject.optString("toastMsg");
        if (strOptString != null && strOptString.length() != 0 && strOptString2 != null && strOptString2.length() != 0) {
            try {
                C20145813s8.LIZ(strOptString, strOptString, context, CertProviderManagerKt.findCert("bpea-217", 1476399128));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS14S1100000_9(context, strOptString2, 3));
            interfaceC1019840ce6.onSuccess(null);
            return;
        }
        interfaceC1019840ce6.LIZ(-1, "content or toastMsg is empty");
    }
}
