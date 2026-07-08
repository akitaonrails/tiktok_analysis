package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1028210crb;
import X.C1041070dCL;
import X.C1051660dTQ;
import X.C1440005kM;
import X.C988570bpf;
import X.C997880c4g;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class DownloadAppClickMethod extends BaseBridgeMethod {
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

    public DownloadAppClickMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "download_app_click";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        boolean z;
        boolean z2;
        String string;
        BaseBundle baseBundle;
        Context context = getContext();
        if (context == null) {
            return;
        }
        String strOptString = jSONObject.optString("app_id");
        if (strOptString != null && strOptString.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            interfaceC1019840ce6.LIZ(-1, "app_id is empty");
            return;
        }
        if (jSONObject.optInt("direct_download", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strOptString2 = jSONObject.optString("component_type");
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ = this.contextProviderFactory.LIZ(Bundle.class);
        if (interfaceC1051470dT7LIZ != null && (baseBundle = (BaseBundle) interfaceC1051470dT7LIZ.LIZ()) != null) {
            string = baseBundle.getString("aweme_id");
        } else {
            string = null;
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null && C1028210crb.LJIIIZ(context, strOptString, string, strOptString2, z2)) {
            C1440005kM.LIZ(new C997880c4g());
            interfaceC1019840ce6.onSuccess(null);
        } else {
            interfaceC1019840ce6.LIZ(-1, "handle failed");
        }
    }
}
