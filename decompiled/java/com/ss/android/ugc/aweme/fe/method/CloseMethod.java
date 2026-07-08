package com.ss.android.ugc.aweme.fe.method;

import X.C08B7;
import X.C08RQ;
import X.C0DQL;
import X.C0N52;
import X.C1035880d3y;
import X.C1051980dTw;
import X.C1440005kM;
import X.C1529880puk;
import X.C1537480q70;
import X.InterfaceC1041760dDS;
import X.InterfaceC1059280dfi;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CloseMethod extends BaseCommonJavaMethod {
    public CloseMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CloseMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        int iHashCode;
        WebView webView;
        WebView webView2;
        WebView webView3;
        if (this.LLILLJJLI != null) {
            WebView webView4 = null;
            int iHashCode2 = 0;
            if (jSONObject != null) {
                final String strOptString = jSONObject.optString("reactId");
                SparkContext.Companion.getClass();
                InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(strOptString);
                if (interfaceC1059280dfiLIZ != null) {
                    interfaceC1059280dfiLIZ.close();
                    String str = C08RQ.LIZJ(strOptString).get("__spark_session_id");
                    if (str != null) {
                        C1051980dTw.LIZIZ(str);
                        return;
                    }
                    return;
                }
                if (strOptString != null && strOptString.length() != 0 && strOptString != null) {
                    C1440005kM.LIZ(new IEvent(strOptString) { // from class: X.031t
                        public final String LIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C7771031t) && Intrinsics.LJFF(this.LIZ, ((C7771031t) obj).LIZ);
                        }

                        public final int hashCode() {
                            return this.LIZ.hashCode();
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
                            sbLIZ.append("CloseWebActivityEvent(id=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = strOptString;
                        }
                    });
                    String str2 = C08RQ.LIZJ(strOptString).get("__spark_session_id");
                    if (str2 != null) {
                        C1051980dTw.LIZIZ(str2);
                        return;
                    }
                    return;
                }
            }
            if (this.mContextRef != null) {
                Context actContext = getActContext();
                if (actContext instanceof Activity) {
                    Activity activity = (Activity) actContext;
                    if (!activity.isFinishing()) {
                        IESJsBridge iESJsBridge = this.LLILLJJLI;
                        if (iESJsBridge != null) {
                            webView4 = iESJsBridge.LIZ;
                        }
                        C1537480q70 hybridContext = ((WebKitView) webView4).getHybridContext();
                        if (hybridContext != null && hybridContext.LJFF(C1035880d3y.class) != null) {
                            IESJsBridge iESJsBridge2 = this.LLILLJJLI;
                            if (iESJsBridge2 != null && (webView3 = iESJsBridge2.LIZ) != null) {
                                iHashCode2 = webView3.hashCode();
                            }
                            C1440005kM.LIZ(new C0DQL(iHashCode2));
                            return;
                        }
                        if (actContext instanceof C08B7) {
                            IESJsBridge iESJsBridge3 = this.LLILLJJLI;
                            if (iESJsBridge3 != null && (webView2 = iESJsBridge3.LIZ) != null) {
                                iHashCode = webView2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            C1440005kM.LIZ(new C0N52(iHashCode));
                            IESJsBridge iESJsBridge4 = this.LLILLJJLI;
                            if (iESJsBridge4 != null && (webView = iESJsBridge4.LIZ) != null) {
                                iHashCode2 = webView.hashCode();
                            }
                            C1440005kM.LIZ(new C0DQL(iHashCode2));
                            return;
                        }
                        activity.getWindow().getDecorView().setTag(R.id.e20, Boolean.TRUE);
                        activity.finish();
                    }
                }
            }
        }
    }
}
