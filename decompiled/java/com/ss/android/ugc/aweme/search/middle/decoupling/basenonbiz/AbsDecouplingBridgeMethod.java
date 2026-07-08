package com.ss.android.ugc.aweme.search.middle.decoupling.basenonbiz;

import X.C09AY;
import X.C1051660dTQ;
import X.C1537480q70;
import X.C2188811AlT;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import X.InterfaceC1058710den;
import X.InterfaceC1531560pxS;
import X.InterfaceC685990QvV;
import X.InterfaceC686000QvW;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.lynx.xsearch.config.SearchEcomDecouplingChannelSettings;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbsDecouplingBridgeMethod implements InterfaceC686000QvW {
    public C09AY LIZ;
    public InterfaceC685990QvV LIZIZ;

    public static abstract class DecouplingBridgeMethod extends BaseBridgeMethod {
        public static final int $stable = 8;
        public EnumC1051570dTH access;
        public final AbsDecouplingBridgeMethod ecom;
        public final String name;
        public final AbsDecouplingBridgeMethod search;

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            super.onStateChanged(lifecycleOwner, event);
        }

        private final boolean isEcom() {
            C1537480q70 c1537480q70;
            InterfaceC1531560pxS interfaceC1531560pxS;
            HybridSchemaParam hybridSchemaParamLIZJ;
            C1051660dTQ c1051660dTQ = this.contextProviderFactory;
            String channel = (c1051660dTQ == null || (c1537480q70 = c1051660dTQ.LIZIZ) == null || (interfaceC1531560pxS = c1537480q70.hybridParams) == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null) ? null : hybridSchemaParamLIZJ.getChannel();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("channel: ");
            sbLIZ.append(channel);
            C2188811AlT.LIZIZ(sbLIZ);
            if (channel == null) {
                return false;
            }
            return SearchEcomDecouplingChannelSettings.LIZ(channel);
        }

        @Override // X.AbstractC1051750dTZ, X.InterfaceC1051690dTT
        public void release() {
            if (isEcom()) {
                this.ecom.getClass();
            } else {
                this.search.getClass();
            }
        }

        @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
        public EnumC1051570dTH getAccess() {
            return this.access;
        }

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
        public String getName() {
            return this.name;
        }

        @Override // X.AbstractC1051750dTZ
        public void setAccess(EnumC1051570dTH enumC1051570dTH) {
            this.access = enumC1051570dTH;
        }

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
        public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
            if (isEcom()) {
                this.ecom.LIZIZ(this, jSONObject, interfaceC1019840ce6);
            } else {
                this.search.LIZIZ(this, jSONObject, interfaceC1019840ce6);
            }
        }

        @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051730dTX
        public void handle(JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
            if (isEcom()) {
                this.ecom.LIZJ(this, jSONObject, interfaceC1058710den);
            } else {
                this.search.LIZJ(this, jSONObject, interfaceC1058710den);
            }
        }

        public DecouplingBridgeMethod(AbsDecouplingBridgeMethod absDecouplingBridgeMethod, AbsDecouplingBridgeMethod absDecouplingBridgeMethod2, C1051660dTQ c1051660dTQ) {
            String name;
            EnumC1051570dTH enumC1051570dTH;
            super(c1051660dTQ);
            this.search = absDecouplingBridgeMethod;
            this.ecom = absDecouplingBridgeMethod2;
            absDecouplingBridgeMethod.LIZ = new AwS554S0100000_10(this, 363);
            absDecouplingBridgeMethod2.LIZ = new AwS554S0100000_10(this, 364);
            final AwS624S0100000_10 awS624S0100000_10 = new AwS624S0100000_10(this, 34);
            final AwS624S0100000_10 awS624S0100000_102 = new AwS624S0100000_10(this, 35);
            absDecouplingBridgeMethod.LIZIZ = new InterfaceC685990QvV() { // from class: X.0QvX
                @Override // X.InterfaceC685990QvV
                public final void handle(JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
                    awS624S0100000_10.invoke(jSONObject, interfaceC1058710den);
                }
            };
            absDecouplingBridgeMethod2.LIZIZ = new InterfaceC685990QvV() { // from class: X.0QvY
                @Override // X.InterfaceC685990QvV
                public final void handle(JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
                    awS624S0100000_10.invoke(jSONObject, interfaceC1058710den);
                }
            };
            new AwS624S0100000_10(this, 32);
            absDecouplingBridgeMethod.getClass();
            new AwS624S0100000_10(this, 33);
            absDecouplingBridgeMethod2.getClass();
            if (isEcom()) {
                name = absDecouplingBridgeMethod2.getName();
            } else {
                name = absDecouplingBridgeMethod.getName();
            }
            this.name = name;
            if (isEcom()) {
                enumC1051570dTH = EnumC1051570dTH.PRIVATE;
            } else {
                enumC1051570dTH = EnumC1051570dTH.PRIVATE;
            }
            this.access = enumC1051570dTH;
        }
    }

    public abstract void LIZIZ(BaseBridgeMethod baseBridgeMethod, JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final Context LIZ() {
        ?? r0 = this.LIZ;
        if (r0 != 0) {
            return (Context) r0.invoke();
        }
        return null;
    }

    public void LIZJ(BaseBridgeMethod baseBridgeMethod, JSONObject jSONObject, InterfaceC1058710den interfaceC1058710den) {
        InterfaceC685990QvV interfaceC685990QvV = this.LIZIZ;
        if (interfaceC685990QvV != null) {
            interfaceC685990QvV.handle(jSONObject, interfaceC1058710den);
        }
    }
}
