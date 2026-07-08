package com.ss.android.ugc.aweme.fe.method.incentive;

import X.C2214201BlK;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CheckCalendarExistMethod extends BaseCommonJavaMethod {
    public CheckCalendarExistMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CheckCalendarExistMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString;
        if (C2214201BlK.LJFF() == null) {
            return;
        }
        if (jSONObject == null) {
            strOptString = "";
        } else {
            strOptString = jSONObject.optString("identifier");
        }
        int i = 1;
        if (strOptString.length() == 0) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(-1, "Parameter invalid");
            }
        } else {
            if (!((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJJI(strOptString)) {
                i = 2;
            }
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZJ(i, "", "");
            }
        }
    }
}
