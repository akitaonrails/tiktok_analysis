package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1063380dmK;
import X.C600230NgT;
import X.InterfaceC1058710den;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.AwS397S0200000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class EditPageMethod extends BaseBridgeMethod {
    public static final C1063380dmK Companion = new Object() { // from class: X.0dmK
    };

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "openVideoEdit";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public EditPageMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051730dTX
    public void handle(JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
        C600230NgT.LIZ(jSONObject, new AwS397S0200000_31(this, jSONObject, 40));
    }
}
