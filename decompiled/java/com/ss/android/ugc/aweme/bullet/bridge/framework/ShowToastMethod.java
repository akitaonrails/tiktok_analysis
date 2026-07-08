package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1019740cdw;
import X.C1051660dTQ;
import X.C19EG;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import Y.ARunnableS1S1310000_16;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class ShowToastMethod extends BaseBridgeMethod {
    public static final C1019740cdw Companion = new Object() { // from class: X.0cdw
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

    public ShowToastMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "showToast";
    }

    public final DialogFragment hasOpenedDialogs(C19EG c19eg) {
        for (Fragment fragment : c19eg.getSupportFragmentManager().LJJLIIIJL()) {
            if (fragment instanceof DialogFragment) {
                return (DialogFragment) fragment;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context context = getContext();
        String strOptString = jSONObject.optString("message");
        boolean zOptBoolean = jSONObject.optBoolean("onWindow");
        if (context != null) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS1S1310000_16(context, this, interfaceC1019840ce6, strOptString, zOptBoolean, 0));
        } else {
            interfaceC1019840ce6.LIZ(0, "");
        }
    }
}
