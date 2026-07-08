package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC666100QAu;
import X.C01GW;
import X.C1065740dq8;
import X.C1563370qml;
import X.C452501pT;
import X.EnumC682280QpW;
import X.InterfaceC1041760dDS;
import X.InterfaceC1065730dq7;
import android.R;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadFeedsMethod extends BaseCommonJavaMethod implements InterfaceC1065730dq7 {
    public final C01GW LLILLL;
    public String LLILZ;

    public LoadFeedsMethod() {
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
        ((C1065740dq8) this.LLILLL.getValue()).LLILLL.dispose();
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.cjt, null);
        }
    }

    public LoadFeedsMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 266));
        this.LLILZ = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof LifecycleOwner) {
            C1563370qml.LIZ((LifecycleOwner) context, EnumC682280QpW.MAIN, new AwS417S0200000_16(context, this, 22));
        }
        super.attach(weakReference);
        return this;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws JSONException {
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("base_url") && jSONObject.has("react_id") && jSONObject.has("page") && jSONObject.has("size") && !jSONObject.optBoolean("clear", false)) {
            this.LLILZ = jSONObject.optString("react_id");
            String strOptString = jSONObject.optString("base_url");
            int iOptInt = jSONObject.optInt("page");
            int iOptInt2 = jSONObject.optInt("size");
            ((FeedsResponse) ((AbstractC666100QAu) this.LLILLL.getValue()).getData()).list.clear();
            ((C1065740dq8) this.LLILLL.getValue()).LJIIJ(iOptInt, iOptInt2, (Activity) getActContext(), strOptString);
            z = true;
        }
        if (interfaceC1041760dDS != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                i = -1;
            }
            jSONObject2.put("code", i);
            interfaceC1041760dDS.LIZIZ(jSONObject2);
        }
    }

    @Override // X.InterfaceC1065730dq7
    public final void sendStatus(String str, JSONObject jSONObject, int i) {
        sendEvent("notification", jSONObject, 3);
    }
}
