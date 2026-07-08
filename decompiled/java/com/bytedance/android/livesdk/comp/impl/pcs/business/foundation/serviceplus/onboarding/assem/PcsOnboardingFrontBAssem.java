package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem;

import X.AbstractC1825240xb8;
import X.C0TGC;
import X.C1121890fIh;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1558800qfO;
import X.C1637806bA;
import X.C1825220xb6;
import X.C1825350xbJ;
import X.C1825380xbM;
import X.C1842040y2E;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingFrontBAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingFrontBAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public AbstractC1825240xb8 LLJJIII;
    public C127G LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsOnboardingFrontBAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/onboarding/viewmodel/PcsOnboardingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsOnboardingFrontBAssem() {
        C1825380xbM c1825380xbM = new C1825380xbM();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsOnboardingVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1825380xbM, C1637806bA.LIZ, new C1558800qfO(c19719912DlLIZ), new C1825350xbJ(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyq;
    }

    public final AbstractC1825240xb8 ip() {
        AbstractC1825240xb8 abstractC1825240xb8 = this.LLJJIII;
        if (abstractC1825240xb8 != null) {
            return abstractC1825240xb8;
        }
        "Fragment binding is only available between onCreateView and onDestroyView.".toString();
        throw new IllegalArgumentException("Fragment binding is only available between onCreateView and onDestroyView.");
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PcsOnboardingVM.class, new Function0(this) { // from class: X.0xb7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsOnboardingFrontBAssem.LLJJIJIIJIL;
                            return new PcsOnboardingVM(new C518640KVq(C1807670x8n.LJJIIJZLJL()));
                        }
                    }}, defaultViewModelProviderFactory);
                    this.LLJJIJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final IPcsOnboardingBottomFunctionAbility hp() {
        return (IPcsOnboardingBottomFunctionAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPcsOnboardingBottomFunctionAbility.class, null);
    }

    public final void kp(final int i) {
        IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbilityHp = hp();
        if (iPcsOnboardingBottomFunctionAbilityHp != null) {
            iPcsOnboardingBottomFunctionAbilityHp.J91();
        } else if (i > 0) {
            HandlerHook.viewPost(ip().LLILZ, new Runnable() { // from class: X.0qfP
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PcsOnboardingFrontBAssem@3055.requestShowBottomFunctionSafe$1");
                    try {
                        this.LL.kp(i - 1);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PcsOnboardingFrontBAssem@3055.requestShowBottomFunctionSafe$1");
                }
            });
        } else {
            C1121890fIh.LIZ("FrontB bottomFunctionAbility null after retries — race not absorbed");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        this.LLJJIII = (AbstractC1825240xb8) ViewDataBinding.LIZIZ(R.layout.fyq, view);
        AbstractC1825240xb8 abstractC1825240xb8Ip = ip();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        abstractC1825240xb8Ip.LJIILLIIL((PcsOnboardingVM) assemVMLazy.getValue());
        abstractC1825240xb8Ip.LLJJJJLIIL.setText(C497740JfY.LJIJI(2131855961));
        C0TGC.LIZJ(abstractC1825240xb8Ip.LLJJJIL, "ttlive_pcs_onboarding_benefit1.png", ImageView.ScaleType.CENTER_CROP, "tiktok_live_pcs_onboarding_front_b_webp");
        C0TGC.LIZJ(abstractC1825240xb8Ip.LLJJJJ, "ttlive_pcs_onboarding_benefit2.png", ImageView.ScaleType.CENTER_CROP, "tiktok_live_pcs_onboarding_front_b_webp");
        C0TGC.LIZJ(abstractC1825240xb8Ip.LLJJJJJIL, "ttlive_pcs_onboarding_benefit3.png", ImageView.ScaleType.CENTER_CROP, "tiktok_live_pcs_onboarding_front_b_webp");
        C736680Sv4.LJIIIZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0xZH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1411350mpZ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0xbH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1411350mpZ) obj).LLILLJJLI;
            }
        }, null, new C1825220xb6(this), 12);
    }
}
