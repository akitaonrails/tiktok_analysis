package com.ss.android.ugc.aweme.bullet.utils;

import X.C098200Yq;
import X.C1051660dTQ;
import X.C1058910df7;
import X.C189200o6;
import X.C2188811AlT;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051760dTa;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class BulletMethodAdapter$javaMethodToBullet$1 extends BaseBridgeMethod {
    public final /* synthetic */ C1051660dTQ $contextProviderFactory;
    public final /* synthetic */ InterfaceC1051760dTa $method;
    public EnumC1051570dTH access;
    public final String name;
    public boolean needCallback;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public boolean getNeedCallback() {
        return this.needCallback;
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    @Override // X.AbstractC1051750dTZ
    public void setNeedCallback(boolean z) {
        this.needCallback = z;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("res");
        C1058910df7 webJsMsg = getWebJsMsg(jSONObject);
        if (this.$contextProviderFactory.LIZIZ == null) {
            this.$method.call(webJsMsg, jSONObjectOptJSONObject);
            setNeedCallback(webJsMsg.LJIIJJI);
            return;
        }
        try {
            this.$method.call(webJsMsg, jSONObjectOptJSONObject);
            setNeedCallback(webJsMsg.LJIIJJI);
            if (getNeedCallback()) {
                interfaceC1019840ce6.LIZIZ(jSONObjectOptJSONObject);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            thM5exceptionOrNullimpl.getMessage();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail to invoke JSB ");
            sbLIZ.append(webJsMsg.LIZJ);
            sbLIZ.append(", error:");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            interfaceC1019840ce6.LIZ(0, C2188811AlT.LIZIZ(sbLIZ));
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletMethodAdapter$javaMethodToBullet$1(String str, EnumC1051570dTH enumC1051570dTH, C1051660dTQ c1051660dTQ, InterfaceC1051760dTa interfaceC1051760dTa) {
        super(c1051660dTQ);
        this.$contextProviderFactory = c1051660dTQ;
        this.$method = interfaceC1051760dTa;
        this.name = str;
        this.access = enumC1051570dTH;
        this.needCallback = true;
    }
}
