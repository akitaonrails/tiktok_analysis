package com.ss.android.ugc.aweme.bullet.module.p003default;

import X.C1051660dTQ;
import X.C1051740dTY;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051730dTX;
import X.InterfaceC1058710den;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BridgeProxy extends BaseBridgeMethod {
    public static final C1051740dTY Companion = new Object() { // from class: X.0dTY
    };
    public final Function1<C1051660dTQ, InterfaceC1051730dTX> bridgeDesc;
    public String name;
    public InterfaceC1051730dTX realBridge;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051690dTT
    public void release() {
        super.release();
        InterfaceC1051730dTX interfaceC1051730dTX = this.realBridge;
        if (interfaceC1051730dTX != null) {
            interfaceC1051730dTX.release();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release ");
        sbLIZ.append(getName());
        sbLIZ.append(" with real bridge ");
        InterfaceC1051730dTX interfaceC1051730dTX2 = this.realBridge;
        sbLIZ.append(interfaceC1051730dTX2 != null ? interfaceC1051730dTX2.getClass().getSimpleName() : null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Function1<C1051660dTQ, InterfaceC1051730dTX> getBridgeDesc() {
        return this.bridgeDesc;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public Map<String, InterfaceC1051730dTX> onPrepare(String str) {
        Intrinsics.LJFF(getName(), str);
        if (this.realBridge != null) {
            return C2097608Jq.LJ();
        }
        InterfaceC1051730dTX interfaceC1051730dTXInvoke = this.bridgeDesc.invoke(this.contextProviderFactory);
        this.realBridge = interfaceC1051730dTXInvoke;
        return C2097908Jt.LIZJ(new Pair(str, interfaceC1051730dTXInvoke));
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051730dTX
    public void handle(JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
        String simpleName;
        if (this.realBridge == null) {
            onPrepare(getName());
        }
        InterfaceC1051730dTX interfaceC1051730dTX = this.realBridge;
        if (interfaceC1051730dTX != null) {
            interfaceC1051730dTX.handle(jSONObject, interfaceC1058710den);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle ");
        sbLIZ.append(getName());
        sbLIZ.append(" with real bridge ");
        InterfaceC1051730dTX interfaceC1051730dTX2 = this.realBridge;
        if (interfaceC1051730dTX2 != null) {
            simpleName = interfaceC1051730dTX2.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(" with param ");
        sbLIZ.append(jSONObject);
        sbLIZ.append('\"');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        super.handle(jSONObject, interfaceC1019840ce6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BridgeProxy(String str, C1051660dTQ c1051660dTQ, Function1<? super C1051660dTQ, ? extends InterfaceC1051730dTX> function1) {
        super(c1051660dTQ);
        this.bridgeDesc = function1;
        this.name = str;
    }
}
