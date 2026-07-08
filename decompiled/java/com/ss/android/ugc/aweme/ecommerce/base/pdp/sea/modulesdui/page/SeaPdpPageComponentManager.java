package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page;

import X.C051S;
import X.C1502500pCa;
import X.C1697810uHb;
import X.C1750410veR;
import X.C1755680vmw;
import X.C1755820vnA;
import X.C1757320vpa;
import X.C1759940vto;
import X.C1759980vts;
import X.C1760040vty;
import X.C1760050vtz;
import X.C356901a3;
import X.InterfaceC13038058i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AFwS328S0000000_3;
import kotlin.jvm.internal.AwS267S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpPageComponentManager implements DefaultLifecycleObserver, InterfaceC13038058i, GenericLifecycleObserver {
    public WeakReference<SeaPdpViewModel> LL;
    public final C1755820vnA LLILLJJLI = new C1755820vnA();
    public C1759940vto LLILLL;
    public C1759980vts LLILZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final SeaPdpViewModel LIZ() {
        WeakReference<SeaPdpViewModel> weakReference = this.LL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2;
        String str;
        lifecycleOwner.getLifecycle().removeObserver(this);
        this.LL = null;
        IEcUgPitayaService iEcUgPitayaService = (IEcUgPitayaService) PluggableExtentionKt.pluggableSpi$default(IEcUgPitayaService.class, false, false, false, 14, null);
        if (iEcUgPitayaService != null) {
            SeaPdpViewModel seaPdpViewModelLIZ = LIZ();
            if (seaPdpViewModelLIZ == null || (str = seaPdpViewModelLIZ.LLLZZIL) == null) {
                str = "";
            }
            iEcUgPitayaService.LJII("sea_pdp_invoke_action", str);
        }
        SeaPdpViewModel seaPdpViewModelLIZ2 = LIZ();
        if (seaPdpViewModelLIZ2 != null && (iSeaPdpCommunicationServiceTR2 = seaPdpViewModelLIZ2.TR2()) != null) {
            C1502500pCa.LIZIZ(iSeaPdpCommunicationServiceTR2, this, C1697810uHb.LJIIJJI("pdpSeaRefresh", "pdpSeaDestroyFloatingBanner"));
        }
        C1755820vnA c1755820vnA = this.LLILLJJLI;
        c1755820vnA.LIZ.LIZ.clear();
        C1750410veR c1750410veR = c1755820vnA.LIZIZ;
        if (c1750410veR != null) {
            c1750410veR.release();
        }
        C1759940vto c1759940vto = this.LLILLL;
        if (c1759940vto != null) {
            C1760040vty c1760040vty = c1759940vto.LIZJ;
            if (c1760040vty != null) {
                c1760040vty.LIZ();
            }
            c1759940vto.LIZJ = null;
            c1759940vto.LIZLLL = null;
            ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ = c1759940vto.LIZ.LIZ();
            if (iSeaPdpCommunicationServiceLIZ != null) {
                C1502500pCa.LIZIZ(iSeaPdpCommunicationServiceLIZ, c1759940vto, C1697810uHb.LJIIJJI("pdpSeaSubmitPopup", "pdpSeaHidePopup", "pdpSeaDestroyPopup"));
            }
        }
        this.LLILLL = null;
        C1759980vts c1759980vts = this.LLILZ;
        if (c1759980vts != null) {
            C1760050vtz c1760050vtz = c1759980vts.LIZJ;
            if (c1760050vtz != null) {
                c1760050vtz.LIZ();
            }
            c1759980vts.LIZJ = null;
            ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ2 = c1759980vts.LIZ.LIZ();
            if (iSeaPdpCommunicationServiceLIZ2 != null) {
                C1502500pCa.LIZIZ(iSeaPdpCommunicationServiceLIZ2, c1759980vts, C1697810uHb.LJIIJJI("pdpSeaSubmitPendant", "pdpSeaHidePendant", "pdpSeaDestroyPendant"));
            }
        }
        this.LLILZ = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C1755680vmw c1755680vmw = this.LLILLJJLI.LIZ;
        c1755680vmw.getClass();
        c1755680vmw.LIZ(new AwS267S0000000_26(false, 1));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C1755680vmw c1755680vmw = this.LLILLJJLI.LIZ;
        c1755680vmw.getClass();
        c1755680vmw.LIZ(new AwS267S0000000_26(true, 1));
    }

    @Override // X.InterfaceC13038058i
    public final void N0(String str, long j, JSONObject jSONObject) {
        String strOptString;
        SeaPdpViewModel seaPdpViewModelLIZ;
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceTR2;
        Map<String, Object> mapLIZJ;
        if (Intrinsics.LJFF(str, "sea_pdp_invoke_action") && jSONObject != null && (strOptString = jSONObject.optString("action_name")) != null && !a0.LJJJIL(strOptString) && (seaPdpViewModelLIZ = LIZ()) != null && (iSeaPdpCommunicationServiceTR2 = seaPdpViewModelLIZ.TR2()) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("action_params");
            if (jSONObjectOptJSONObject != null) {
                mapLIZJ = C051S.LIZJ(jSONObjectOptJSONObject);
            } else {
                mapLIZJ = null;
            }
            iSeaPdpCommunicationServiceTR2.hc1(strOptString, mapLIZJ, new C1757320vpa(null), AFwS328S0000000_3.get$arr$(4));
        }
    }
}
