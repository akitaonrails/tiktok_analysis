package com.ss.android.ugc.aweme.bullet.bridge;

import X.C1051660dTQ;
import X.C1058910df7;
import X.EnumC1054630dYD;
import X.InterfaceC1019840ce6;
import X.InterfaceC1028200cra;
import X.InterfaceC1047320dMQ;
import X.InterfaceC1058710den;
import X.InterfaceC1058720deo;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseBridgeMethod extends ContainerBridgeMethod implements GenericLifecycleObserver {
    public final Activity getActivityById(String str) {
        return null;
    }

    @Override // com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public abstract /* synthetic */ String getName();

    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final IESJsBridge getJsBridge() {
        return (IESJsBridge) this.contextProviderFactory.LIZIZ(IESJsBridge.class);
    }

    public final InterfaceC1028200cra getKitContainerApi() {
        return (InterfaceC1028200cra) this.contextProviderFactory.LIZIZ(InterfaceC1028200cra.class);
    }

    public final InterfaceC1058720deo getMonitorService() {
        return (InterfaceC1058720deo) this.contextProviderFactory.LIZIZ(InterfaceC1058720deo.class);
    }

    public final EnumC1054630dYD getHybridType() {
        EnumC1054630dYD enumC1054630dYDLJ;
        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
        return (kitContainerApi == null || (enumC1054630dYDLJ = kitContainerApi.LJ()) == null) ? EnumC1054630dYD.WEB : enumC1054630dYDLJ;
    }

    public BaseBridgeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    public final C1058910df7 getWebJsMsg(JSONObject jSONObject) {
        C1058910df7 c1058910df7 = new C1058910df7();
        c1058910df7.LIZLLL = jSONObject;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("jsMsg");
        if (jSONObjectOptJSONObject != null) {
            c1058910df7.LIZ = jSONObjectOptJSONObject.optString("type");
            c1058910df7.LIZJ = jSONObjectOptJSONObject.optString("func");
            c1058910df7.LIZIZ = jSONObjectOptJSONObject.optString("callback_id");
            c1058910df7.LJ = jSONObjectOptJSONObject.optInt("version");
            c1058910df7.LJIIJJI = jSONObjectOptJSONObject.optBoolean("needCallback");
            c1058910df7.LJII = Boolean.valueOf(jSONObjectOptJSONObject.optBoolean("fromBDXBridge", false));
            c1058910df7.LJIIJ = jSONObjectOptJSONObject.optString("permissionGroup");
        }
        return c1058910df7;
    }

    @Override // com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051730dTX
    public void handle(JSONObject jSONObject, final InterfaceC1058710den interfaceC1058710den) {
        handle(jSONObject, new InterfaceC1019840ce6() { // from class: X.0del
            @Override // X.InterfaceC1019840ce6
            public final void LIZIZ(JSONObject jSONObject2) {
                if (jSONObject2 != null) {
                    try {
                        interfaceC1058710den.LIZ(jSONObject2);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // X.InterfaceC1019840ce6
            public final void onSuccess(Object obj) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 1);
                    jSONObject2.put("data", obj);
                    interfaceC1058710den.LIZ(jSONObject2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.InterfaceC1019840ce6
            public final void LIZ(int i, String str) {
                InterfaceC1058710den interfaceC1058710den2 = interfaceC1058710den;
                if (str == null) {
                    str = "";
                }
                interfaceC1058710den2.onError(i, str);
            }

            @Override // X.InterfaceC1019840ce6
            public final void LIZJ(int i, Object obj, String str) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", i);
                    jSONObject2.put("msg", str);
                    jSONObject2.put("data", obj);
                    interfaceC1058710den.LIZ(jSONObject2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
    }

    public final void sendEvent(final String str, final JSONObject jSONObject) {
        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null) {
            kitContainerApi.onEvent(new InterfaceC1047320dMQ(str, jSONObject) { // from class: X.0dem
                public final String LIZ;
                public final JSONObject LIZIZ;

                @Override // X.InterfaceC1047320dMQ
                public final String getName() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1047320dMQ
                public final /* bridge */ /* synthetic */ Object getParams() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = jSONObject;
                }
            });
        }
    }
}
