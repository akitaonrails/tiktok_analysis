package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem;

import X.AbstractC1825370xbL;
import X.C01GW;
import X.C127G;
import X.C12961055j;
import X.C13LE;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1824670xaD;
import X.C1825290xbD;
import X.C1825300xbE;
import X.C1825310xbF;
import X.C1825360xbK;
import X.C1825380xbM;
import X.C1825400xbO;
import X.C1825410xbP;
import X.C1825420xbQ;
import X.C1825430xbR;
import X.C1825440xbS;
import X.C1833160xnu;
import X.C1842040y2E;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C343110Dcj;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingMultiSKUAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingMultiSKUAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public C1833160xnu LLJJIJI;
    public AbstractC1825370xbL LLJJIJIIJIL;
    public C127G LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsOnboardingMultiSKUAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/onboarding/viewmodel/PcsOnboardingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsOnboardingMultiSKUAssem() {
        C1825380xbM c1825380xbM = new C1825380xbM();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsOnboardingVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1825380xbM, C1637806bA.LIZ, new C12961055j(c19719912DlLIZ), new C1825360xbK(), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new C1825300xbE(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyr;
    }

    public final AbstractC1825370xbL hp() {
        AbstractC1825370xbL abstractC1825370xbL = this.LLJJIJIIJIL;
        if (abstractC1825370xbL != null) {
            return abstractC1825370xbL;
        }
        "Fragment binding is only available between onCreateView and onDestroyView.".toString();
        throw new IllegalArgumentException("Fragment binding is only available between onCreateView and onDestroyView.");
    }

    public final PcsOnboardingVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PcsOnboardingVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsOnboardingVM.class, new Function0(this) { // from class: X.0xbC
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsOnboardingMultiSKUAssem.LLJJJ;
                            return new PcsOnboardingVM(new C518640KVq(C1807670x8n.LJJIIJZLJL()));
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        this.LLJJIJIIJIL = (AbstractC1825370xbL) ViewDataBinding.LIZIZ(R.layout.fyr, view);
        AbstractC1825370xbL abstractC1825370xbLHp = hp();
        abstractC1825370xbLHp.LLJJJIL.setLayoutManager(new LinearLayoutManager(getContext()));
        if (ip().LLIZLLLIL.isEmpty()) {
            ip().LLIZLLLIL = C1697810uHb.LJIIJJI(new C1825400xbO(), new C1825430xbR(true), new C1825410xbP(false), new C1825440xbS(false), new C1825420xbQ(false));
        }
        C1833160xnu c1833160xnu = new C1833160xnu(ip().LLIZLLLIL, new C1825310xbF(this));
        this.LLJJIJI = c1833160xnu;
        abstractC1825370xbLHp.LLJJJIL.setAdapter(c1833160xnu);
        C1824670xaD.LIZIZ(abstractC1825370xbLHp.LLJJJIL, new C343110Dcj(12));
        IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbility = (IPcsOnboardingBottomFunctionAbility) this.LLJJIII.getValue();
        if (iPcsOnboardingBottomFunctionAbility != null) {
            iPcsOnboardingBottomFunctionAbility.iR();
        }
        C736680Sv4.LJIIIZ(this, ip(), new C2217381BqS() { // from class: X.0xZI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1411350mpZ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0mpj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1411350mpZ) obj).LLILLL;
            }
        }, null, new C1825290xbD(this), 12);
    }
}
