package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C01GW;
import X.C1051660dTQ;
import X.C1065700dq4;
import X.C1065740dq8;
import X.C1388190mED;
import X.C452501pT;
import X.InterfaceC1019840ce6;
import X.InterfaceC1065730dq7;
import android.R;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadFeedsMethod extends BaseBridgeMethod implements InterfaceC1065730dq7 {
    public static final C1065700dq4 Companion = new Object() { // from class: X.0dq4
    };
    public final C01GW bridgeModel$delegate;
    public final String name;
    public String reactId;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final C1065740dq8 getBridgeModel() {
        return (C1065740dq8) this.bridgeModel$delegate.getValue();
    }

    private final void clearEnvironment() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        activityLIZ.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.cjt, null);
    }

    private final void prepareEnvironment() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        activityLIZ.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.cjt, getBridgeModel());
    }

    public final void attach() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        Object context = getContext();
        if (!(context instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) context) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051690dTT
    public void release() {
        super.release();
        getBridgeModel().LLILLL.dispose();
        clearEnvironment();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public LoadFeedsMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "loadFeeds";
        this.reactId = "";
        this.bridgeModel$delegate = C452501pT.LIZIZ(new AwS560S0100000_16(this, 81));
        attach();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        int i = 1;
        boolean z = false;
        if (jSONObject.has("base_url") && jSONObject.has("react_id") && jSONObject.has("page") && jSONObject.has("size") && !jSONObject.optBoolean("clear", false)) {
            Activity activityLIZ = null;
            if (1 != 0) {
                this.reactId = jSONObject.optString("react_id");
                String strOptString = jSONObject.optString("base_url");
                int iOptInt = jSONObject.optInt("page");
                int iOptInt2 = jSONObject.optInt("size");
                getBridgeModel().getData().list.clear();
                C1065740dq8 bridgeModel = getBridgeModel();
                Context context = getContext();
                if (context != null) {
                    activityLIZ = C1388190mED.LIZ(context);
                }
                bridgeModel.LJIIJ(iOptInt, iOptInt2, activityLIZ, strOptString);
                z = true;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject2.put("code", i);
        interfaceC1019840ce6.LIZIZ(jSONObject2);
    }

    @Override // X.InterfaceC1065730dq7
    public void sendStatus(String str, JSONObject jSONObject, int i) {
        sendEvent(str, jSONObject);
    }
}
