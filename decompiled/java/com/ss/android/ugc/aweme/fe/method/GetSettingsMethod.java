package com.ss.android.ugc.aweme.fe.method;

import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class GetSettingsMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetSettingsMethod() {
    }

    public GetSettingsMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        try {
            if (((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LJIIIIZZ()) {
                interfaceC1041760dDS.onSuccess(((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LJI());
            } else {
                interfaceC1041760dDS.onSuccess(new JSONObject(((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LJFF()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1041760dDS.LIZ(-1, "");
        }
    }
}
