package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1051660dTQ;
import X.C1440005kM;
import X.InterfaceC1019840ce6;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class GetWebViewInfo extends BaseBridgeMethod {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "getWebViewInfo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetWebViewInfo(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) {
        final int iHashCode;
        WebView webView;
        IESJsBridge iESJsBridge = (IESJsBridge) this.contextProviderFactory.LIZIZ(IESJsBridge.class);
        if (iESJsBridge != null && (webView = iESJsBridge.LIZ) != null) {
            iHashCode = webView.hashCode();
        } else {
            iHashCode = 0;
        }
        C1440005kM.LIZ(new IEvent(iHashCode, interfaceC1019840ce6) { // from class: X.0N2Y
            public final int LIZ;
            public final InterfaceC1019840ce6 LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0N2Y)) {
                    return false;
                }
                C0N2Y c0n2y = (C0N2Y) obj;
                return this.LIZ == c0n2y.LIZ && Intrinsics.LJFF(this.LIZIZ, c0n2y.LIZIZ);
            }

            public final int hashCode() {
                int i = this.LIZ * 31;
                InterfaceC1019840ce6 interfaceC1019840ce62 = this.LIZIZ;
                return i + (interfaceC1019840ce62 == null ? 0 : interfaceC1019840ce62.hashCode());
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GetStatusEvent(webViewHash=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", iReturn=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = iHashCode;
                this.LIZIZ = interfaceC1019840ce6;
            }
        });
    }
}
