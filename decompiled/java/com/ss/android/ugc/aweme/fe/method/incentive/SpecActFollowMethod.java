package com.ss.android.ugc.aweme.fe.method.incentive;

import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C1769906wT;
import X.InterfaceC1041760dDS;
import X.InterfaceC626120Oh8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SpecActFollowMethod extends BaseCommonJavaMethod {
    public SpecActFollowMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SpecActFollowMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, final InterfaceC1041760dDS interfaceC1041760dDS) {
        C11NZ.LJIJJLI(new C1769906wT(jSONObject, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<FollowStatus>() { // from class: X.06nN
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(FollowStatus followStatus) throws JSONException {
                FollowStatus followStatus2 = followStatus;
                InterfaceC1041760dDS interfaceC1041760dDS2 = interfaceC1041760dDS;
                if (interfaceC1041760dDS2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 1);
                    jSONObject2.put("follow_status", followStatus2.getFollowStatus());
                    interfaceC1041760dDS2.LIZIZ(jSONObject2);
                }
            }
        });
    }
}
