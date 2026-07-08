package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1048300dO0;
import X.C1048340dO4;
import X.C1051660dTQ;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SendLogMethod extends BaseBridgeMethod {
    public static final C1048300dO0 Companion = new Object() { // from class: X.0dO0
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

    public SendLogMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "sendLog";
        setAccess(C1048340dO4.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendLog(org.json.JSONObject r23, X.InterfaceC1019840ce6 r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod.sendLog(org.json.JSONObject, X.0ce6):void");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        sendLog(jSONObject, interfaceC1019840ce6);
    }
}
