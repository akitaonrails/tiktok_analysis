package com.ss.android.ugc.aweme.fe.method;

import X.C1563370qml;
import X.EnumC682280QpW;
import X.InterfaceC1041760dDS;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS417S0200000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OnBackPressedMethod extends BaseCommonJavaMethod {
    public OnBackPressedMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Context actContext = getActContext();
        if (!(actContext instanceof CrossPlatformActivity) || actContext == null) {
            return;
        }
        actContext.getClass();
    }

    public OnBackPressedMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof LifecycleOwner) {
            C1563370qml.LIZ((LifecycleOwner) context, EnumC682280QpW.MAIN, new AwS417S0200000_16(context, this, 23));
        }
        super.attach(weakReference);
        return this;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        if (jSONObject == null || interfaceC1041760dDS == null) {
            return;
        }
        Context actContext = getActContext();
        if ((actContext instanceof CrossPlatformActivity) && actContext != null) {
            final int iOptInt = jSONObject.optInt("actionType", 0);
            if (iOptInt == 0) {
                actContext.getClass();
            } else {
                new Object(this, iOptInt) { // from class: X.0dm9
                };
                actContext.getClass();
            }
        }
    }
}
