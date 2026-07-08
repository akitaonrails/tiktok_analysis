package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1025140cme;
import X.C1027660cqi;
import X.C1028210crb;
import X.C1029270ctJ;
import X.C1041070dCL;
import X.C1051660dTQ;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C988570bpf;
import X.InterfaceC1019840ce6;
import X.InterfaceC996520c2U;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenAdLandPageLinksMethod extends BaseBridgeMethod {
    public static final int $stable = 8;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenAdLandPageLinksMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openAdLandPageLinks";
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011d A[Catch: all -> 0x015b, TryCatch #1 {all -> 0x015b, blocks: (B:55:0x011d, B:57:0x0126, B:58:0x012f, B:52:0x0115), top: B:72:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0177  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r37, X.InterfaceC1019840ce6 r38) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdLandPageLinksMethod.handle(org.json.JSONObject, X.0ce6):void");
    }

    private final boolean checkWebViewCache(long j, String str, int i) {
        Boolean boolValueOf;
        InterfaceC996520c2U interfaceC996520c2U = (InterfaceC996520c2U) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC996520c2U.class);
        if (interfaceC996520c2U != null) {
            boolValueOf = Boolean.valueOf(interfaceC996520c2U.MY0(i, String.valueOf(j), str));
        } else {
            boolValueOf = null;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            interfaceC996520c2U.Um2(String.valueOf(j), str);
        }
        return Intrinsics.LJFF(boolValueOf, bool);
    }

    private final void handleDeeplink(String str, String str2, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context baseContext;
        Activity activityLJFF = C2214201BlK.LJFF();
        boolean zLIZJ = false;
        if (activityLJFF != null && (baseContext = activityLJFF.getBaseContext()) != null) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null && C1028210crb.LJIJI(baseContext, str)) {
                C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
                if (C1041070dCL.LIZ() != null) {
                    zLIZJ = C1025140cme.LIZJ(baseContext, UriProtector.parse(str));
                }
                c1029270ctJ.getClass();
                C1029270ctJ.LIZLLL(str2, str, zLIZJ);
                interfaceC1019840ce6.onSuccess(null);
                return;
            }
        }
        interfaceC1019840ce6.LIZJ(0, null, "can not open third app");
    }

    private final void resetNativeSiteCustomData(JSONObject jSONObject, Bundle bundle, C1027660cqi c1027660cqi) {
        String strOptString = jSONObject.optString("nativeSiteCustomData");
        if (strOptString.length() > 0) {
            if (c1027660cqi != null) {
                c1027660cqi.LJJLL.LIZLLL(strOptString);
            } else {
                if (bundle == null) {
                    return;
                }
                C786410Ut5.LJJJI("bundle_native_site_custom_data", strOptString, bundle);
            }
        }
    }
}
