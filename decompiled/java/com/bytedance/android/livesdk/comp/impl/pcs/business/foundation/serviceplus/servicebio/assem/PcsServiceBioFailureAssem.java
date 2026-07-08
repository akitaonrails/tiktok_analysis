package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C055X;
import X.C06MM;
import X.C0WZX;
import X.C13LE;
import X.C1637806bA;
import X.C1822700xX2;
import X.C197039127h;
import X.C19719912Dl;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C518220KUa;
import X.C518230KUb;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.PcsServicePlusFailureAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServiceBioFailureAssem extends PcsServicePlusFailureAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioFailureAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/viewmodel/PcsServiceBioVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServiceBioFailureAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055X(c19719912DlLIZ), new C518230KUb(), null, true);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.PcsServicePlusFailureAssem
    public final void hp() {
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0KUY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KUP) obj).LL;
            }
        }, null, new C518220KUa(this), 6);
    }

    public final PcsServiceBioVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PcsServiceBioVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.PcsServicePlusFailureAssem
    public final void ip(View view) {
        super.ip(view);
        View view2 = this.LLJJI;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                float f = C1822700xX2.LIZ;
                Activity activityLIZ = C06MM.LIZ(getContext());
                C2204961BRm.LLILZIL(activityLIZ.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xUG0I/xwf+EP1TY=", null)).getRealMetrics(new DisplayMetrics());
                layoutParams.height = (int) (r4.heightPixels * C1822700xX2.LIZ);
                C786410Ut5.W5(view2, layoutParams);
                view2.requestLayout();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C197039127h c197039127h = this.LLJJIJI;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0KUZ
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view3) {
                    if (view3 != null) {
                        this.LLILZ.kp().setState(new C0KUU());
                    }
                }
            }, c197039127h);
        }
    }
}
