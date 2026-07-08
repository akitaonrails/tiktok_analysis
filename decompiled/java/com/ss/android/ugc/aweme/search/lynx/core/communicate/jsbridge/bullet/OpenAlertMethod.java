package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C1051660dTQ;
import X.C663340Q0e;
import X.C684400Qsw;
import X.InterfaceC1028200cra;
import X.InterfaceC1047320dMQ;
import X.InterfaceC1058710den;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenAlertMethod extends BaseBridgeMethod {
    public final C663340Q0e helper;
    public final String name;
    public InterfaceC1058710den originCallback;
    public static final C684400Qsw Companion = new Object() { // from class: X.0Qsw
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public final InterfaceC1058710den getOriginCallback() {
        return this.originCallback;
    }

    public OpenAlertMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openAlert";
        this.helper = new C663340Q0e(c1051660dTQ, getName());
    }

    public final void setOriginCallback(InterfaceC1058710den interfaceC1058710den) {
        this.originCallback = interfaceC1058710den;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:6:0x000e, B:8:0x0031, B:12:0x003d, B:15:0x0045, B:17:0x004d, B:22:0x0058, B:24:0x0060, B:25:0x0064, B:27:0x0070, B:29:0x0076, B:31:0x0080, B:34:0x0088, B:36:0x0092, B:38:0x00a0, B:49:0x00e3, B:51:0x00e7, B:54:0x00f0, B:56:0x00f6, B:58:0x00fc, B:59:0x0100, B:61:0x0106, B:70:0x011a, B:72:0x011e, B:73:0x0122, B:65:0x010d, B:67:0x0111, B:40:0x00a4, B:42:0x00af, B:44:0x00ba, B:45:0x00bd, B:47:0x00c3, B:48:0x00c6), top: B:80:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r17, X.InterfaceC1019840ce6 r18) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod.handle(org.json.JSONObject, X.0ce6):void");
    }

    public final void onButtonAction(final String str, final String str2) {
        try {
            InterfaceC1047320dMQ interfaceC1047320dMQ = new InterfaceC1047320dMQ(str, str2) { // from class: X.0Qsv
                public final JSONObject LIZ;

                @Override // X.InterfaceC1047320dMQ
                public final String getName() {
                    return "onAlertButtonClickAction";
                }

                @Override // X.InterfaceC1047320dMQ
                public final /* bridge */ /* synthetic */ Object getParams() {
                    return this.LIZ;
                }

                {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("op_args", str);
                    jSONObject.put("alert_id", str2);
                    this.LIZ = jSONObject;
                }
            };
            InterfaceC1028200cra kitContainerApi = getKitContainerApi();
            if (kitContainerApi != null) {
                kitContainerApi.onEvent(interfaceC1047320dMQ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void processKeyboard(android.app.Activity r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod.processKeyboard(android.app.Activity, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051730dTX
    public void handle(JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
        super.handle(jSONObject, interfaceC1058710den);
        this.originCallback = interfaceC1058710den;
    }
}
