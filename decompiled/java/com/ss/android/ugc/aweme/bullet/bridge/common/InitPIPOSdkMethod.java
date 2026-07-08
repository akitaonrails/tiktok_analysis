package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1711860ueG;
import X.C1724180uy8;
import X.C1BWL;
import X.C932203ke;
import X.InterfaceC1019840ce6;
import X.InterfaceC1724010uxr;
import X.InterfaceC1724090uxz;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class InitPIPOSdkMethod extends BaseBridgeMethod {
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public InitPIPOSdkMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "initPipo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            C1724180uy8 c1724180uy8 = new C1724180uy8(C1BWL.LIZ());
            c1724180uy8.LJIIL = new InterfaceC1724090uxz() { // from class: X.0uyM
                @Override // X.InterfaceC1724090uxz
                public final void onEventV3(String str, JSONObject jSONObject2) {
                    C20684815ws.LJIJ(str, jSONObject2);
                }
            };
            c1724180uy8.LJIILL = new InterfaceC1724010uxr() { // from class: X.0uyJ
                @Override // X.InterfaceC1724010uxr
                public final void LIZ(String str) {
                    if (!u.LJJIIJZLJL(str, "aweme://webview/", false)) {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C2214201BlK.LJFF(), "aweme://webview/");
                        smartRouteBuildRoute.withParam("url", str);
                        smartRouteBuildRoute.open();
                        return;
                    }
                    SmartRouter.buildRoute(C2214201BlK.LJFF(), str).open();
                }
            };
            c1724180uy8.LIZIZ = "https://fp22-normal-useast1a.tiktokv.com";
            C1711860ueG c1711860ueGLJFF = C932203ke.LIZ.LJFF(c1724180uy8.LIZ());
            interfaceC1019840ce6.LIZJ(c1711860ueGLJFF.LIZ, null, c1711860ueGLJFF.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.onSuccess("13");
        }
    }
}
