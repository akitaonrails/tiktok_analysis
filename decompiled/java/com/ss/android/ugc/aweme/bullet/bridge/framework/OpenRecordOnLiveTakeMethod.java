package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1061390dj7;
import X.C1388190mED;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenRecordOnLiveTakeMethod extends BaseBridgeMethod {
    public static final C1061390dj7 Companion = new Object() { // from class: X.0dj7
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

    public OpenRecordOnLiveTakeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "OpenRecordOnLiveTake";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.finish();
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).b5(activityLIZ, jSONObject);
        }
    }
}
