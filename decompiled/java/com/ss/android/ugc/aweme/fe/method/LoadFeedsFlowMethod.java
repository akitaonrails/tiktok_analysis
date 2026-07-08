package com.ss.android.ugc.aweme.fe.method;

import X.C01GW;
import X.C1065720dq6;
import X.C1563370qml;
import X.C452501pT;
import X.EnumC682280QpW;
import X.InterfaceC1065730dq7;
import android.R;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS417S0200000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadFeedsFlowMethod extends BaseCommonJavaMethod implements InterfaceC1065730dq7 {
    public final Map<String, C1065720dq6> LLILLL;
    public final C01GW LLILZ;

    public LoadFeedsFlowMethod() {
        this(null);
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
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.cjt, null);
        }
    }

    public LoadFeedsFlowMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = new LinkedHashMap();
        this.LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(322));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof LifecycleOwner) {
            C1563370qml.LIZ((LifecycleOwner) context, EnumC682280QpW.MAIN, new AwS417S0200000_16(context, this, 21));
        }
        super.attach(weakReference);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r13, X.InterfaceC1041760dDS r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod.handle(org.json.JSONObject, X.0dDS):void");
    }

    @Override // X.InterfaceC1065730dq7
    public final void sendStatus(String str, JSONObject jSONObject, int i) {
        sendEvent("notification", jSONObject, 3);
    }
}
