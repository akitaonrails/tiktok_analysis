package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem;

import X.C019F;
import X.C1217510hmv;
import X.C1217520hmw;
import X.C13LE;
import X.C1637806bA;
import X.C1822260xWK;
import X.C1823630xYX;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.PcsServicePlusFailureAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinFailureAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.viewmodel.PcsServicePlusOptinVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;

/* JADX INFO: loaded from: classes20.dex */
public final class PcsServicePlusOptinFailureAssem extends PcsServicePlusFailureAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJIJIIJIL;
    public C1822260xWK LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServicePlusOptinFailureAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/optin/viewmodel/PcsServicePlusOptinVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PcsServicePlusOptinFailureAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServicePlusOptinVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1217510hmv(c19719912DlLIZ), new C1217520hmw(), null, true);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.PcsServicePlusFailureAssem
    public final void hp() {
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0xYg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1823670xYb) obj).LL;
            }
        }, null, new C1823630xYX(this), 6);
    }

    public final PcsServicePlusOptinVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PcsServicePlusOptinVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem.PcsServicePlusFailureAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127h = this.LLJJIJI;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0hom
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String showEntrance;
                    PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
                    PcsServicePlusOptinVM pcsServicePlusOptinVMKp = this.LL.kp();
                    PcsServicePlusOptinFailureAssem pcsServicePlusOptinFailureAssem = this.LL;
                    if (pcsServicePlusOptinFailureAssem.LLJJIJIL == null) {
                        C1822260xWK c1822260xWK = null;
                        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(pcsServicePlusOptinFailureAssem), "source_default_key", C1822260xWK.class, null);
                        if (interfaceC1555100qZQLIZIZ != null) {
                            c1822260xWK = (C1822260xWK) interfaceC1555100qZQLIZIZ.getSource();
                        }
                        pcsServicePlusOptinFailureAssem.LLJJIJIL = c1822260xWK;
                    }
                    C1822260xWK c1822260xWK2 = pcsServicePlusOptinFailureAssem.LLJJIJIL;
                    if (c1822260xWK2 == null || (pcsServicePlusOptinPageParams = c1822260xWK2.LLILLJJLI) == null || (showEntrance = pcsServicePlusOptinPageParams.getShowEntrance()) == null) {
                        showEntrance = "";
                    }
                    pcsServicePlusOptinVMKp.xQ2(showEntrance);
                }
            });
        }
    }
}
