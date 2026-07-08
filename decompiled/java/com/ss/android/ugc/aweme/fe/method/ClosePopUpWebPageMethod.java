package com.ss.android.ugc.aweme.fe.method;

import X.C01GW;
import X.C1028210crb;
import X.C1041070dCL;
import X.C1440005kM;
import X.C2214201BlK;
import X.C452501pT;
import X.C602130NjX;
import X.C988570bpf;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class ClosePopUpWebPageMethod extends BaseCommonJavaMethod {
    public final C01GW LLILLL;

    public ClosePopUpWebPageMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ClosePopUpWebPageMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(171));
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) this.LLILLL.getValue();
        if (iAdLandingPagePopUpService != null && iAdLandingPagePopUpService.LJIJI()) {
            C1440005kM.LIZ(new C602130NjX("closeTuxSheet"));
            return;
        }
        IAdLandingPagePopUpService iAdLandingPagePopUpService2 = (IAdLandingPagePopUpService) this.LLILLL.getValue();
        if (iAdLandingPagePopUpService2 != null && iAdLandingPagePopUpService2.LJII()) {
            C1440005kM.LIZ(new C602130NjX("closeFullScreen"));
            return;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                C1028210crb.LJJI(activityLJFF);
            }
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.onSuccess(null);
                return;
            }
            return;
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(-1, "not fragmentActivity");
        }
    }
}
