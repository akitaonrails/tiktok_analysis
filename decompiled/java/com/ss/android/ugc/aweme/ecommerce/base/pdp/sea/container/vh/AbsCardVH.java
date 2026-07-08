package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.vh;

import X.AbstractC1066304Ez;
import X.AbstractC1764350w0v;
import X.AbstractC1764440w14;
import X.C01GW;
import X.C034S;
import X.C04CN;
import X.C04FN;
import X.C1120604Zw;
import X.C1558360qeg;
import X.C1764410w11;
import X.C1AQS;
import X.C2188811AlT;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1338780kwW;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import irm.AkS93S0100000_26;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public abstract class AbsCardVH<VO extends AbstractC1066304Ez, VM extends AbstractC1764350w0v<VO, MO>, MO extends C1764410w11<VO>> extends JediSimpleViewHolder<VM> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public boolean LLJI;
    public VM LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    public void LIZIZ() {
    }

    public abstract void b6(VM vm);

    public void c6() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class});
    }

    public void e6() {
        this.LLJI = false;
        VM vm = this.LLJIJIL;
        if (vm != null) {
            vm.LLILLL = false;
            VM vm2 = vm.LLJILJILJ;
            if (vm2 != 0) {
                vm2.LLILLL = false;
            }
            AbstractC1764440w14.LJI();
        }
        this.LLJIJIL = null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onPause() {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
    }

    public void onShow() {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJILLL.getValue();
    }

    public final void W5() {
        VM vm = this.LLJIJIL;
        if (vm == null || vm.LLILLL) {
            return;
        }
        vm.LJIIJ();
        onShow();
    }

    public final void X5() {
        VM vm = this.LLJIJIL;
        if (vm == null || !vm.LLILLL) {
            return;
        }
        vm.LJIIJJI();
        d6();
    }

    public final PageStateContext a6() {
        return (PageStateContext) this.LLJILJIL.getValue();
    }

    public void d6() {
        VM vm = this.LLJIJIL;
        if (vm != null) {
            vm.LJIIJJI();
        }
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJ(this.itemView, null);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        VM vm = this.LLJIJIL;
        if (vm != null) {
            AbstractC1764440w14.LJI();
            C04CN c04cn = vm.LLJ;
            if (c04cn != null) {
                AbstractC1764440w14.LJI();
                c04cn.LLILZLL = null;
            }
            vm.LLJILJILJ = null;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        super.I5();
        W5();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void P5() {
        super.P5();
        X5();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        c6();
        View view = this.itemView;
        if (view instanceof InterfaceC1338780kwW) {
            C786410Ut5.I7(new AkS93S0100000_26(this, 1), view);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onStart() {
        W5();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onStop() {
        X5();
    }

    public AbsCardVH(View view) {
        super(view);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 406));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(112));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 408));
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 407));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        InterfaceC1338780kwW interfaceC1338780kwW;
        GodaV2Style godaV2Style;
        IECommerceHostService iECommerceHostService;
        IPdpTriggerService iPdpTriggerService;
        C04FN c04fn;
        VM vm = (VM) obj;
        boolean z = true;
        this.LLJI = true;
        if (this.itemView.isAttachedToWindow()) {
            X5();
        }
        this.LLJIJIL = vm;
        b6(vm);
        if (this.itemView.isAttachedToWindow()) {
            W5();
        }
        KeyEvent.Callback callback = this.itemView;
        String name = null;
        if (callback instanceof InterfaceC1338780kwW) {
            interfaceC1338780kwW = (InterfaceC1338780kwW) callback;
        } else {
            interfaceC1338780kwW = null;
        }
        VM vm2 = this.LLJIJIL;
        if (vm2 != null && (c04fn = vm2.LLILZIL) != null) {
            godaV2Style = c04fn.LJIILLIIL;
        } else {
            godaV2Style = null;
        }
        if (interfaceC1338780kwW != null) {
            interfaceC1338780kwW.LJJJJJL(godaV2Style);
        } else if (godaV2Style != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService == null) {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("view ");
                sbLIZ.append(this.itemView);
                sbLIZ.append(" is not IStyleLayout");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (!vm.LLILZIL.LJIJ.LIZ() && (iPdpTriggerService = (IPdpTriggerService) this.LLJJ.getValue()) != null) {
            iPdpTriggerService.nD2(vm);
        }
    }
}
