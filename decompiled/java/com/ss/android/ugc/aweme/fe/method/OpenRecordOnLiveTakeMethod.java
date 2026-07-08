package com.ss.android.ugc.aweme.fe.method;

import X.C1388190mED;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenRecordOnLiveTakeMethod extends BaseCommonJavaMethod {
    public OpenRecordOnLiveTakeMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenRecordOnLiveTakeMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        Context context;
        Activity activityLIZ;
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null && (context = weakReference.get()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.finish();
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).b5(activityLIZ, jSONObject);
        }
    }
}
