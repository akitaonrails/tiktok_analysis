package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem;

import X.AbstractC1825270xbB;
import X.C0TGC;
import X.C1121890fIh;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1558770qfL;
import X.C1637806bA;
import X.C1825260xbA;
import X.C1825340xbI;
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
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingFrontAAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingFrontAAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLJJI;
    public AbstractC1825270xbB LLJJIII;
    public C127G LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsOnboardingFrontAAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/onboarding/viewmodel/PcsOnboardingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsOnboardingFrontAAssem() {
        C1825380xbM c1825380xbM = new C1825380xbM();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsOnboardingVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1825380xbM, C1637806bA.LIZ, new C1558770qfL(c19719912DlLIZ), new C1825340xbI(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyp;
    }

    public final AbstractC1825270xbB ip() {
        AbstractC1825270xbB abstractC1825270xbB = this.LLJJIII;
        if (abstractC1825270xbB != null) {
            return abstractC1825270xbB;
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
                    C127G c127g2 = new C127G(new Object[]{PcsOnboardingVM.class, new Function0(this) { // from class: X.0xb9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsOnboardingFrontAAssem.LLJJIJIIJIL;
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
            HandlerHook.viewPost(ip().LLILZ, new Runnable() { // from class: X.0qfM
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PcsOnboardingFrontAAssem@aa9.requestShowBottomFunctionSafe$1");
                    try {
                        this.LL.kp(i - 1);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PcsOnboardingFrontAAssem@aa9.requestShowBottomFunctionSafe$1");
                }
            });
        } else {
            C1121890fIh.LIZ("FrontA bottomFunctionAbility null after retries — race not absorbed");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
        this.LLJJIII = (AbstractC1825270xbB) ViewDataBinding.LIZIZ(R.layout.fyp, view);
        AbstractC1825270xbB abstractC1825270xbBIp = ip();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        abstractC1825270xbBIp.LJIILLIIL((PcsOnboardingVM) assemVMLazy.getValue());
        abstractC1825270xbBIp.LLJL.setText(C497740JfY.LJIIL(2131755966, 0, 0));
        abstractC1825270xbBIp.LLJJL.setText(C497740JfY.LJIJI(2131855961));
        C0TGC.LIZJ(abstractC1825270xbBIp.LLJJJIL, "ttlive_pcs_onboarding_impression_bg.png", ImageView.ScaleType.CENTER_CROP, "tiktok_live_pcs_onboarding_front_a_webp");
        C0TGC.LIZJ(abstractC1825270xbBIp.LLJJLIIIJLLLLLLLZ, "ttlive_pcs_onboarding_impression_bubble.png", ImageView.ScaleType.CENTER_CROP, "tiktok_live_pcs_onboarding_front_a_webp");
        C0TGC.LIZJ(abstractC1825270xbBIp.LLJJJJLIIL, "ttlive_pcs_onboarding_impression_man.png", ImageView.ScaleType.CENTER_CROP, "tiktok_live_pcs_onboarding_front_a_webp");
        C0TGC.LIZJ(abstractC1825270xbBIp.LLJJJJJIL, "ttlive_pcs_onboarding_impression_icon.png", ImageView.ScaleType.CENTER_CROP, "tiktok_live_pcs_onboarding_front_a_webp");
        C736680Sv4.LJIIIZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0xZG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1411350mpZ) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0xbG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1411350mpZ) obj).LLILLJJLI;
            }
        }, null, new C1825260xbA(this), 12);
    }
}
