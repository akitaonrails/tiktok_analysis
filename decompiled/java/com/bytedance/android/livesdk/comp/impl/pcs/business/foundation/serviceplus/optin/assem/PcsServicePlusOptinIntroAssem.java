package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem;

import X.C019F;
import X.C055L;
import X.C06VB;
import X.C0H31;
import X.C0H33;
import X.C0U3L;
import X.C13LE;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1825210xb5;
import X.C19719912Dl;
import X.C20441214yg;
import X.C20632315oP;
import X.C21546719Ub;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC764260TyS;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServicePlusOptinIntroAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public C20632315oP LLJJIII;
    public C21546719Ub LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C0H31 LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServicePlusOptinIntroAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/optin/viewmodel/PcsServicePlusOptinVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServicePlusOptinIntroAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServicePlusOptinVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055L(c19719912DlLIZ), new C06VB(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz8;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C20632315oP c20632315oP;
        View childAt;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xYn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1823670xYb) obj).LLILLJJLI;
            }
        }, null, new C1825210xb5(this), 6);
        this.LLJJIII = (C20632315oP) view.findViewById(R.id.kyd);
        this.LLJJIJI = (C21546719Ub) view.findViewById(R.id.g3l);
        C0H31 c0h31 = new C0H31();
        this.LLJJIJIL = c0h31;
        getContext();
        c0h31.LL = Collections.singletonList(new C0H33(2131856044));
        C20632315oP c20632315oP2 = this.LLJJIII;
        if (c20632315oP2 != null) {
            c20632315oP2.setAdapter(this.LLJJIJIL);
        }
        C21546719Ub c21546719Ub = this.LLJJIJI;
        if (c21546719Ub != null) {
            int visibility = c21546719Ub.getVisibility();
            c21546719Ub.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c21546719Ub);
        }
        try {
            C20632315oP c20632315oP3 = this.LLJJIII;
            if (c20632315oP3 != null && (childAt = c20632315oP3.getChildAt(0)) != null) {
                childAt.setOverScrollMode(2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("PcsServicePlusOptinIntroAssem", e.toString());
        }
        C21546719Ub c21546719Ub2 = this.LLJJIJI;
        if (c21546719Ub2 != null && (c20632315oP = this.LLJJIII) != null) {
            new C0U3L(c21546719Ub2, c20632315oP, true, new InterfaceC764260TyS() { // from class: X.0Txv
                @Override // X.InterfaceC764260TyS
                public final void LIZ(C763970Txz c763970Txz, int i) {
                    C426750GoL.LJIIL(c763970Txz.LJIIIIZZ, 0, 0, 0, 0, 16);
                    c763970Txz.LIZJ(C786410Ut5.Sd(R.layout.hg9, C786410Ut5.ne(this.LIZ.getContext()), null));
                }
            }).LIZ();
        }
    }
}
