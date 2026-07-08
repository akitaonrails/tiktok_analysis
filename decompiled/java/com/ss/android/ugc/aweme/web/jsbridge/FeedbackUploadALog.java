package com.ss.android.ugc.aweme.web.jsbridge;

import X.C570350MYn;
import X.C835770WqV;
import X.C835850Wqd;
import X.InterfaceC1041760dDS;
import Y.AObjectS356S0100000_13;
import Y.AObjectS529S0100000_13;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FeedbackUploadALog extends BaseCommonJavaMethod {
    public C835770WqV LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public FeedbackUploadALog(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        C835850Wqd.LIZ.getClass();
        C835850Wqd.LJ = true;
        C835850Wqd.LJI = false;
        if (this.LLILLL == null) {
            this.LLILLL = new C835770WqV();
        }
        if (C570350MYn.LIZ()) {
            this.LLILLL.LIZJ(new AObjectS356S0100000_13(interfaceC1041760dDS, 3));
        } else {
            this.LLILLL.LIZIZ(new AObjectS356S0100000_13(interfaceC1041760dDS, 4), new AObjectS529S0100000_13(interfaceC1041760dDS, 0));
        }
    }
}
