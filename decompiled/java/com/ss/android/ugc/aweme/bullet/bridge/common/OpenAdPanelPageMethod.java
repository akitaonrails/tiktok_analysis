package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1019860ce8;
import X.C1027410cqJ;
import X.C1027480cqQ;
import X.C1027580cqa;
import X.C1051660dTQ;
import X.C844470XAv;
import X.InterfaceC1019840ce6;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenAdPanelPageMethod extends BaseBridgeMethod {
    public static final C1019860ce8 Companion = new Object() { // from class: X.0ce8
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

    public OpenAdPanelPageMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openAdPanelPage";
    }

    private final C1027480cqQ createAdRouterParams(String str, int i) {
        C1027580cqa c1027580cqa = new C1027580cqa();
        c1027580cqa.LJJIII(str);
        c1027580cqa.LJJJIL(str);
        c1027580cqa.LJIJ(i);
        return c1027580cqa.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        String strOptString = jSONObject.optString("url");
        int iOptInt = jSONObject.optInt("landingStyle", 0);
        try {
            Context context = getContext();
            if (context == null) {
                C844470XAv.LIZ.getClass();
                context = C844470XAv.LIZ();
            }
            if (C1027410cqJ.LIZ(context, createAdRouterParams(strOptString, iOptInt)).LIZ()) {
                interfaceC1019840ce6.LIZJ(1, null, null);
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        interfaceC1019840ce6.LIZ(-1, "Can not handle url");
    }
}
